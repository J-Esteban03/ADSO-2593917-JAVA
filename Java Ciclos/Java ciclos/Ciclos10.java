import java.util.Scanner;

public class Ciclos10{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero N (máximo 11): ");
        int n = entrada.nextInt();
        if (n > 11) {
            System.out.println("El número ingresado es mayor a 11. Intente de nuevo.");
            return;
        }

        int count = 0;
        int current = 2;
        while (count < n * n) {
            boolean esPrimo = true;
            for (int i = 2; i < current; i++) {
                if (current % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(current + " ");
                count++;
                if (count % n == 0) {
                    System.out.println();
                }
            }
            current++;
        }
    }
}
