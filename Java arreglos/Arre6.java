import java.util.Scanner;

public class Arre6{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        int[] primos = new int[n];
        int[] noPrimos = new int[n];
        int cantPrimos = 0;
        int cantNoPrimos = 0;

        for (int i = 0; i < n; i++) {
            int divisores = 0;
            for (int j = 1; j <= arreglo[i]; j++) {
                if (arreglo[i] % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                primos[cantPrimos] = arreglo[i];
                cantPrimos++;
            } else {
                noPrimos[cantNoPrimos] = arreglo[i];
                cantNoPrimos++;
            }
        }

        System.out.println("Arreglo de números primos:");
        for (int i = 0; i < cantPrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println();
        System.out.println("Arreglo de números no primos:");
        for (int i = 0; i < cantNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
        System.out.println();

        System.out.println("Cantidad de números primos: " + cantPrimos);
        System.out.println("Cantidad de números no primos: " + cantNoPrimos);
    }
}
