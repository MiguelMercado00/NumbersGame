
import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        boolean haGanado = false;
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinanza! Adivina el número entre 1 y 100.");

        while (!haGanado) {
            Scanner scanner = new Scanner(System.in);
            int numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado == numeroAleatorio) {
                haGanado = true;
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número a adivinar. Intenta de nuevo.");
            } else {
                System.out.println("El número ingresado es mayor que el número a adivinar. Intenta de nuevo.");
            }
        }
    }
}