import java.util.Scanner;

public class Ejer7{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = entrada.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + ": ");
            array[i] = entrada.nextInt();
        }

        System.out.print("Ingrese la posicion del elemento a partir de la cual imprimir en sentido antihorario: ");
        int position = entrada.nextInt();

        System.out.println("Arreglo original:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Posicion: " + position);

        for (int i = position; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        for (int i = size-1; i > position; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
