import java.util.Scanner;
import java.util.Arrays;

public class Arre4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud = entrada.nextInt();

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("El arreglo original es: " + Arrays.toString(arreglo));

        Arrays.sort(arreglo);
        int[] arregloDescendente = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arregloDescendente[i] = arreglo[longitud - i - 1];
        }

        System.out.println("El arreglo ordenado de forma descendente es: " + Arrays.toString(arregloDescendente));
    }
}
