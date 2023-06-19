import java.util.Scanner;

public class Ejer6{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del primer usuario: ");
        String jugador1 = input.nextLine();
        System.out.print("Ingrese el nombre del segundo usuario: ");
        String jugador2 = input.nextLine();
        
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();
            
            if (opcion == 1) {
                char[][] tablero = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
                };
                boolean turnoJugador1 = true;
                boolean juegoTerminado = false;
                int jugadasRealizadas = 0;
                
                while (!juegoTerminado) {
                    System.out.println("Tablero actual:");
                    System.out.println("  1 2 3");
                    System.out.println("1 " + tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
                    System.out.println("  -+-+-");
                    System.out.println("2 " + tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
                    System.out.println("  -+-+-");
                    System.out.println("3 " + tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);
                    
                    int fila, columna;
                    if (turnoJugador1) {
                        System.out.println(jugador1 + ", ingrese una posición (1-9):");
                        fila = (input.nextInt() - 1) / 3;
                        columna = (input.nextInt() - 1) % 3;
                    } else {
                        System.out.println(jugador2 + ", ingrese una posición (1-9):");
                        fila = (input.nextInt() - 1) / 3;
                        columna = (input.nextInt() - 1) % 3;
                    }
                    
                    if (tablero[fila][columna] != ' ') {
                        System.out.println("La casilla ya está ocupada, intente de nuevo.");
                        continue;
                    }
                    
                    // Realizar jugada
                    if (turnoJugador1) {
                        tablero[fila][columna] = 'X';
                    } else {
                        tablero[fila][columna] = 'O';
                    }
                    
                    if (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] != ' ' ||
                        tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] && tablero[1][0] != ' ' ||
                        tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] && tablero[2][0] != ' ' ||
                        tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] && tablero[0][0] != ' ' ||
                        tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] && tablero[0][1] != ' ' ||
                        tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] && tablero[0][2] != ' ' ||
                        tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ' ||
                        tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {

                        System.out.println("Tablero final:");
                        System.out.println(" 1 2 3");
                        System.out.println("1 " + tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
                        System.out.println(" -+-+-");
                        System.out.println("2 " + tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
                        System.out.println(" -+-+-");
                        System.out.println("3 " + tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);

                        String ganador;
                        if (turnoJugador1) {
                            ganador = jugador1;
                        } else {
                            ganador = jugador2;
                        }
                        System.out.println(ganador + " ha ganado!");
                        juegoTerminado = true;
                    } else if (jugadasRealizadas == 8) {

                        System.out.println("Tablero final:");
                        System.out.println("  1 2 3");
                        System.out.println("1 " + tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
                        System.out.println("  -+-+-");
                        System.out.println("2 " + tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
                        System.out.println("  -+-+-");
                        System.out.println("3 " + tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);
                        

                        System.out.println("El juego ha terminado en empate.");
                        juegoTerminado = true;
                    } else {

                        turnoJugador1 = !turnoJugador1;
                        jugadasRealizadas++;
                    }
                }
            } else if (opcion != 2) {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 2);
        
        System.out.println("Gracias por jugar!");
    }
}
                        