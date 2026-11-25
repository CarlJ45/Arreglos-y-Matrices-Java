import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print("Ingrese el valor de la fila " + i +
                                 " columna " + j + ": ");
                matriz[i][j] = entrada.nextInt();

            }
        }

        System.out.println("\n--- MATRIZ ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }

    }
}