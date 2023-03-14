import java.util.Scanner;
public class Ejer5{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el nuemro de personas");
        int n =entrada.nextInt();

        String nombres [] =new String [n];
        String generos [] =new String [n];
        int aux=0;

        for(int i=0;i<n;i++){
            System.out.println("Ingrese su Nombre:");
            String nombre=entrada.nextLine();
            nombres[i]=nombre;

            System.out.println("Ingrese su Genero:");
            String genero=entrada.nextLine();
            generos[i]=genero;

        }

        for(int i=0;i<n;i++){
            System.out.println("["+nombres[i]+" -> " +generos[i]+"]");

        }
    }
}