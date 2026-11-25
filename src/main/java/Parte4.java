import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];

        int cantidadPares = 0;
        int cantidadImpares = 0;

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }

        }

        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);

    }
}