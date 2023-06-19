import java.util.Scanner;
public class Ejer2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un texto:");
        String texto = entrada.nextLine();

        for(int i=0; i<texto.length(); i++){
            
            int pos = (int) texto.charAt(i);

            if(pos >= 65 && pos<=90){
                char nuevo = (char) (pos+32);
                System.out.print(nuevo);

            }else if(pos >= 97 && pos <= 122){
                char nuevo = (char) (pos-32);
                System.out.print(nuevo);
            }else if(pos == 32){
                char nuevo = (char) (pos=32);
                System.out.print(nuevo);
            }
             
        }
    }
}
