import java.util.Scanner;

public class Ejer1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero:");
        int n = entrada.nextInt();

        int arreglo1 [] =  new int [n];
	    
	    for(int i=0; i<arreglo1.length; i++){
            arreglo1[i]=(i+1)*2-1;
	    }

	    //imprimir arreglo
	    for(int i=0; i<arreglo1.length; i++){
	        System.out.print("["+arreglo1[i]+"]");
        }
    }
}
