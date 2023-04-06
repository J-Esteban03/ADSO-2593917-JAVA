import java.util.Scanner;

public class Arre5{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud = entrada.nextInt();

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("El arreglo original es: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.print("Ingrese el número de movimientos: ");
        int movimientos = entrada.nextInt();

        for (int i = 0; i < movimientos; i++) {
            int temp = arreglo[0];
            for (int j = 0; j < longitud - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[longitud - 1] = temp;

            System.out.println("Después del movimiento " + (i + 1) + ": ");
            for (int j = 0; j < longitud; j++) {
                System.out.print(arreglo[j] + " ");
            }
            System.out.println();
        }
    }
}
