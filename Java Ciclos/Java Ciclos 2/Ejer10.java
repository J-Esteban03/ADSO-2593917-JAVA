import java.util.Scanner;

public class Ejer10{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el orden del cuadrado latino: ");
        int n = entrada.nextInt();

        System.out.println("El cuadrado latino de orden " + n + " es:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 2; i <= n; i++) {
            int temp = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(temp + " ");
                temp++;
                if (temp > n) {
                    temp = 1;
                }
            }
            System.out.println();
        }
    }
}
