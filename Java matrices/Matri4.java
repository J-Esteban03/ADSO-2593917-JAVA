import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // números aleatorios entre 0 y 9
            }
        }
        
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        int tamanoMitad = (filas * columnas) / 2;
        int[] primeraMitad = new int[tamanoMitad];
        int[] segundaMitad = new int[tamanoMitad + ((filas * columnas) % 2)]; // si la matriz tiene un número impar de elementos, el segundo arreglo es un elemento más grande
        
        int contadorPrimeraMitad = 0;
        int contadorSegundaMitad = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (contadorPrimeraMitad < tamanoMitad) {
                    primeraMitad[contadorPrimeraMitad] = matriz[i][j];
                    contadorPrimeraMitad++;
                } else {
                    segundaMitad[contadorSegundaMitad] = matriz[i][j];
                    contadorSegundaMitad++;
                }
            }
        }
        
        System.out.println("Primer arreglo:");
        for (int i = 0; i < tamanoMitad; i++) {
            System.out.print(primeraMitad[i] + " ");
        }
        System.out.println();
        
        System.out.println("Segundo arreglo:");
        for (int i = 0; i < tamanoMitad + ((filas * columnas) % 2); i++) {
            System.out.print(segundaMitad[i] + " ");
        }
        System.out.println();
    }
}
