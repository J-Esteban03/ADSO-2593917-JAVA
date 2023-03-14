import java.util.Scanner;

public class Ejer1{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int mayus = 0;
        int minus = 0;
        int num = 0;
        int simbolos = 0;
        int espacios = 0;

        
        System.out.print("Usuario ingrese una contrasena: ");
        String contrasena = entrada.nextLine();

        //Analice la longitud de la cadena
        for (int i = 0; i<contrasena.length();i++){
            if (contrasena.length()>=8){
                //Mayusculas
                if (contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90){
                    mayus=mayus+i;
                }
                //Minusculas
                if (contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122){
                    minus=minus+i;
                }
                //Numero
                if (contrasena.charAt(i)>=48 && contrasena.charAt(i)<=57){
                    num=num+i;
                }
                //Simbolos
                if (contrasena.charAt(i)==250 || contrasena.charAt(i)==45 || contrasena.charAt(i)==123 || contrasena.charAt(i)== 125 || contrasena.charAt(i)== 91 || contrasena.charAt(i)== 93 || contrasena.charAt(i)== 42 || contrasena.charAt(i)== 36 || contrasena.charAt(i)== 37 || contrasena.charAt(i)== 38 || contrasena.charAt(i)== 92 || contrasena.charAt(i)== 63 || contrasena.charAt(i)== 33 || contrasena.charAt(i)== 33 || contrasena.charAt(i)== 161){
                    simbolos=simbolos+i;
                }
                //Espacios 
                if (contrasena.charAt(i)==32){
                    espacios=espacios+i;
                }
            }
        }
        if (mayus>=1 && minus>=1 && num>=1 && simbolos>=1 && espacios==0){
            System.out.println("Contrasena valida");
        }else {
            System.out.println("Contrasena invalida");
        }
        
    }
}