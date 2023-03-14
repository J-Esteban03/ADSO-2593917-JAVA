import java.util.Scanner;
public class Ejer4{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        char[] palindromo;
        int izq, der;

        System.out.print("Ingrese un texto: ");
        String texto = entrada.nextLine();

        palindromo = texto.toCharArray();
        izq=0;
        der = palindromo.length - 1;

        
        while(izq<der){
            if(palindromo[izq] == palindromo[der]){
                der--;
                izq++;

            }else{
                System.out.print("La palabra " +texto+ " NO es palindroma");
                break;

            }
        }

        if (izq == der){
            System.out.print("La palabra " +texto+ " Es palindroma");
        }

        
    }
}