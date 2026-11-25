import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numero;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese el valor de la fila " + i +
                                 " columna " + j + ": ");
                numero = entrada.nextInt();

                matriz[i][j] = numero + (i * j);

            }
        }

        System.out.println("\n--- MATRIZ MODIFICADA ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }

    }
}