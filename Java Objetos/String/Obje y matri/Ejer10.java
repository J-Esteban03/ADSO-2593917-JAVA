import java.util.Scanner;

public class Ejer10{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = entrada.nextInt();

        int[] arreglo = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el número de movimientos: ");
        int movimientos = entrada.nextInt();

        for (int i = 0; i < movimientos; i++) {
            int temp = arreglo[0];
            for (int j = 0; j < size - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[size - 1] = temp;
            System.out.println("Arreglo después del movimiento " + (i + 1) + ": " + java.util.Arrays.toString(arreglo));
            
        }
    }
}
