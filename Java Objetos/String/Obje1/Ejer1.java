import java.util.Scanner;
public class Ejer1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un texto:");
        String texto = entrada.nextLine();

        int acum=0;
        System.out.println(texto.length());

        for(int i=0; i<texto.length(); i++){
            
            System.out.println("Estas son las letras ingresadas: " + texto.charAt(i));
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
                acum=acum+1;
            }else if(texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U'){
                acum=acum+1;
            }
            
        }
        System.out.println("Este es el numero de bocales: " + acum);
        
    }
}
