import java.util.Scanner;

public class Ejer2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = entrada.nextLine();
        System.out.println("Ingresa un número:");
        int numero = entrada.nextInt();

        int longitud = frase.length();
        char[] caracteres = frase.toCharArray();
        char[] caracteresMovidos = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            int nuevaPosicion = (i - numero) % longitud;
            if (nuevaPosicion < 0) {
                nuevaPosicion += longitud;
            }
            caracteresMovidos[nuevaPosicion] = caracteres[i];
        }

        String fraseMovida = new String(caracteresMovidos);
        System.out.println("La frase movida es: " + fraseMovida);
    }
}
