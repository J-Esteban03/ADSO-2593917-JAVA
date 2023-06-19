import java.util.Scanner;

public class Ejer12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de los arreglos: ");
        int size = scanner.nextInt();

        int[] arreglo1 = new int[size];
        int[] arreglo2 = new int[size];
        int[] intercambiar = new int[size * 2];

        System.out.println("Introduce los valores para el primer arreglo:");
        for (int i = 0; i < size; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Introduce los valores para el segundo arreglo:");
        for (int i = 0; i < size; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < size; i++) {
            intercambiar[index++] = arreglo1[i];
            intercambiar[index++] = arreglo2[i];
        }

        System.out.println("El arreglo intercalado es:");
        for (int i = 0; i < size * 2; i++) {
            System.out.print(intercambiar[i] + " ");
        }
        
    }
}
