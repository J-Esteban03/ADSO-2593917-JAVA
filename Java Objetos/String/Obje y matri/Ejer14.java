import java.util.Scanner;

public class Ejer14{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        String[] arreglo = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posicion " + i + ": ");
            arreglo[i] = entrada.next();
        }
        
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = entrada.next();
        
        int posicion = -1;
        for (int i = 0; i < n; i++) {
            if (arreglo[i].equals(palabra)) {
                posicion = i;
                break;
            }
        }
        
        if (posicion != -1) {
            System.out.println("La palabra '" + palabra + "' se encuentra en la posicion " + posicion + " del arreglo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no se encuentra en el arreglo.");
        }
        
    }
}
