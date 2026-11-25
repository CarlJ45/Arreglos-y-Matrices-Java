import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int mayor, menor;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese el valor de la fila " + i +
                                 " columna " + j + ": ");
                matriz[i][j] = entrada.nextInt();

            }
        }

        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

            }
        }

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);

    }
}