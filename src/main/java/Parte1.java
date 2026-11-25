import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero para la posicion " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\n--- NUMEROS INGRESADOS ---");

        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

    }
}