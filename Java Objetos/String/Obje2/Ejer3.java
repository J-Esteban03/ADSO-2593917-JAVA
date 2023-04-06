import java.util.Scanner;

public class Ejer3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Usuario ingrese la 1ra palabra: ");
        String palabra1 = entrada.nextLine();

        System.out.print("Usuario ingrese la 2da palabra: ");
        String palabra2 = entrada.nextLine();

        int p1 = palabra1.length();
        int p2 = palabra2.length();
        char arreglo1 [] = new char[p1];
        char arreglo2 [] = new char[p1]; 

        int cambio = 0;

        if(p1 > p2){
            for(int i = 0; i <= p1-1;i++){
                System.out.print(palabra1.charAt(i));
                System.out.print(palabra2.charAt(cambio));
                if(cambio == p2-1){
                    cambio = 0;
                }else{
                    cambio++;
                }
            }

        }else if(p2 > p1){
            for(int i = 0; i <= p2-1;i++){
                System.out.print(palabra1.charAt(cambio));
                System.out.print(palabra2.charAt(i));
                if(cambio == p1-1){
                    cambio = 0;
                }else{
                    cambio++;
                }
            }
            
        }else if(p1 == p2){
            for(int i = 0; i <= p1-1; i++){
                arreglo1[i] = palabra1.charAt(i);
                arreglo2[i] = palabra2.charAt(i);
            }
            for(int j = 0; j <= p1-1; j++){
                System.out.print(arreglo1[j]);
                System.out.print(arreglo2[j]);
            }

        }
    }
}
