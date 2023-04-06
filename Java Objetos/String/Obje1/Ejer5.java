import java.util.Scanner;
public class Ejer5{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        String secreto = "programa";

        int i=1;
        int n=999999;
        while(i<n){
            System.out.println("");
            System.out.println("--> ingrese alguna de las opciones <--");
            System.out.println("--> 1. Iniciar juego <--");
            System.out.println("--> 2. salir <--");
            int opcion = entrada.nextInt();
            if(opcion==1){
                System.out.println("Numero de guines de la palabra secreta: ");
                for(int a=0; a<secreto.length(); a++){
                    System.out.print("_" + "   ");
                }
                System.out.println("");

                int j=1;
                int b=9999999;

                while(j<b){
                    for(int z=0; z<secreto.length(); z++){
                        System.out.println("Ingrese la frase: ");
                        String frase = entrada.nextLine();

                        if(frase == secreto){
                            System.out.println("Es la palabra correcta");
                            b=0;
                            
                        }else{
                            System.out.println("No es la palabra, sigue intentando");
                            j=2;
                        }
                        
                    }
                    
                    
                }
  
                

            }else if (opcion==2){
                System.out.print("Gracias por jugar");
                n=0;
            }

        }
    }
}
