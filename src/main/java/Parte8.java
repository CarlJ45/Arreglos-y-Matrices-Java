import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print("Ingrese el valor de la fila " + i +
                                 " columna " + j + ": ");
                matriz[i][j] = entrada.nextInt();

            }
        }

        System.out.println("\n--- DIAGONAL PRINCIPAL ---");

        for (int i = 0; i < 4; i++) {

            System.out.println(matriz[i][i]);

            suma = suma + matriz[i][i];

        }

        System.out.println("Suma de la diagonal principal: " + suma);

    }
}