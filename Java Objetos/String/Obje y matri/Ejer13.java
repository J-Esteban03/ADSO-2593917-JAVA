import java.util.Scanner;

public class Ejer13{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los valores para el arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Ingrese una posición: ");
        int posicion = entrada.nextInt();

        int valor;
        if (posicion >= 0) {
            valor = arreglo[posicion % n];
        } else {
            valor = arreglo[n - (-posicion % n)];
        }

        System.out.println("El valor para la posición " + posicion + " es " + valor);
        
    }
}
