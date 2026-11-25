import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();

            suma = suma + numeros[i];
        }

        promedio = suma / 10;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

    }
}