import java.util.Scanner;

public class Ejer9{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        int[] primos = new int[n];
        int[] noPrimos = new int[n];
        int numPrimos = 0;
        int numNoPrimos = 0;

        for (int i = 0; i < n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < arreglo[i]; j++) {
                if (arreglo[i] % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[numPrimos] = arreglo[i];
                numPrimos++;
            } else {
                noPrimos[numNoPrimos] = arreglo[i];
                numNoPrimos++;
            }
        }

        System.out.println("Arreglo de primos:");
        for (int i = 0; i < numPrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println();

        System.out.println("Arreglo de no primos:");
        for (int i = 0; i < numNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
        System.out.println();

        System.out.println("Longitud del arreglo original: " + n);
        System.out.println("Longitud del arreglo de primos: " + numPrimos);
        System.out.println("Longitud del arreglo de no primos: " + numNoPrimos);
    }
}
