import java.util.Scanner;
public class Ejer3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = entrada.nextLine();

        String nombreReverso = new StringBuilder(nombreCompleto).reverse().toString();

        System.out.println("Su nombre al reves es: " + nombreReverso);
        
    }
}
