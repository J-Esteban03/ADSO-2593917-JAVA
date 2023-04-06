import java.util.Arrays;
import java.util.Scanner;

public class Ejer4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = entrada.nextInt();
        String[] nombres = new String[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = entrada.next();
        }
        
        System.out.println("Arreglo original: " + Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println("Arreglo ordenado alfabéticamente: " + Arrays.toString(nombres));
    }
}
