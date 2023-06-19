import java.util.Scanner;
public class Ejer1{
    public static void main(String [] args){

        //Variable para leer texto
        Scanner entrada = new Scanner(System.in);

        //Pedir texto al ususario
        System.out.print("Ingrese su nombre:");
        String cadena = entrada.nextLine();

        //Prueba
        System.out.println("Valor almacenado => "+ cadena);
        System.out.println("Cantidad letras => "+ cadena.length());
        System.out.println("Letra en pos 0 => "+ cadena.charAt(0));
        System.out.println("Letra en pos 1 => "+ cadena.charAt(1));
        System.out.println("Letra en pos 2 => "+ cadena.charAt(2));
        System.out.println("Letra en pos 3 => "+ cadena.charAt(3));



        String palabra_1 ="Hola Mundo";
        String palabra_2 ="HOLA MUNDO";

        System.out.println("CompareTo P1 a P2:" + palabra_1.compareTo(palabra_2));
        System.out.println("CompareTo P2 a P1:" + palabra_2.compareTo(palabra_1));
        

        System.out.println("CompareTo P1 a P2:" + palabra_1.equals(palabra_2));
        System.out.println("CompareTo P2 a P1:" + palabra_2.equals(palabra_1));


        //ignora si es mayuscula o minuscula
        System.out.println("CompareTo P1 a P2:" + palabra_1.equalsIgnoreCase(palabra_2));
        System.out.println("CompareTo P2 a P1:" + palabra_2.equalsIgnoreCase(palabra_1));


    }
}