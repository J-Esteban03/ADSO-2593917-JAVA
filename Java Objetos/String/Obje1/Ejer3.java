import java.util.Scanner;
public class Ejer3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = entrada.nextLine();

        int i;
        for(i=texto.length()-1; i>=0; i--){
            System.out.print(texto.charAt(i));
            
        }
        
    }
}