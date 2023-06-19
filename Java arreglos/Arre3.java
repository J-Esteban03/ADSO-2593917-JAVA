import java.util.Scanner;

public class Arre3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("Ingrese una posición dentro del arreglo: ");
        int pos = entrada.nextInt();
        
        System.out.print("El arreglo original es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        
        System.out.print("Los valores en sentido antihorario desde la posición " + pos + " son: ");
        for (int i = pos; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = n - 1; i > pos; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
