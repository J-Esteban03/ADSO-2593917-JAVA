import java.util.Scanner;

public class Matri4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        int columnas = entrada.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        System.out.print("Ingrese la cantidad de bombas que desea colocar: ");
        int cantBombas = entrada.nextInt();
        
        for(int i = 0; i < cantBombas; i++) {
            System.out.print("Ingrese la posición de la bomba " + (i+1) + ": ");
            int filaBomba = entrada.nextInt();
            int columnaBomba = entrada.nextInt();
            matriz[filaBomba][columnaBomba] = 1;
        }
        
        int[][] areaAfectada = new int[filas][columnas];
        
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                if(matriz[i][j] == 1) {
                    areaAfectada[i][j] = 1;
                    if(i > 0) areaAfectada[i-1][j] = 2;
                    if(j > 0) areaAfectada[i][j-1] = 2;
                    if(i < filas-1) areaAfectada[i+1][j] = 2;
                    if(j < columnas-1) areaAfectada[i][j+1] = 2;
                }
            }
        }
        
        System.out.println("Matriz con las bombas:");
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz con el área afectada:");
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print(areaAfectada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
