import java.util.Arrays;
import java.util.Scanner;

public class Ejer11{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int n = entrada.nextInt();

        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[n];

        System.out.println("Ingrese los valores del primer arreglo:");
        
        for (int i = 0; i < n; i++) {
            arreglo1[i] = entrada.nextInt();
        }

        System.out.println("Ingrese los valores del segundo arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo2[i] = entrada.nextInt();
        }

        if (Arrays.equals(arreglo1, arreglo2)) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }
    }

}
