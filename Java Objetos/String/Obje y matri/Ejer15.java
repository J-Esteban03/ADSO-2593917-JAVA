import java.util.Scanner;

public class Ejer15{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        String[] arreglo = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor en la posicion " + i + ": ");
            arreglo[i] = entrada.next();
        }

        System.out.print("Ingrese la posicion del elemento que desea eliminar: ");
        int posicion = entrada.nextInt();

        if (posicion < 0 || posicion >= n) {
            System.out.println("La posicion ingresada no es válida.");
            return;
        }

        for (int i = posicion; i < n - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        System.out.print("Arreglo resultante: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("[" + arreglo[i] + "]" + " ");
        }
        
    }
}
