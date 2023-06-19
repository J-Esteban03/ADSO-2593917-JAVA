import java.util.Scanner;
public class Ejer9{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int N = entrada.nextInt();

        int root = N;
        while (root > 9) {
            int sum = 0;
            while (root > 0) {
                sum += root % 10;
                root /= 10;
            }
            root = sum;
        }
        System.out.println("La raiz digital de " + N + " es " + root);
    }
}
