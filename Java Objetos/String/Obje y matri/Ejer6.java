import java.util.Scanner;

public class Ejer6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n=999999;
        int x = 1;
        int meses [] =new int [12];
        int opcion=0;
        int mes=0;
        int pago=0;
        int mes2=0;

        while(x < n){

            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1. Registrar pago mensual - año 2019.");
            System.out.println("2: Ver Pago todos los meses - año 2019.");
            System.out.println("3: Ver Pago mes especifico.");
            System.out.println("4: Salir.");
            System.out.println("");
            System.out.println("ingrese alguna de las opciones");
            opcion = entrada.nextInt();

            if (opcion == 1){
                System.out.println("Seleccione el mes;");
                System.out.println("1.Enero");
                System.out.println("2.Febrero");
                System.out.println("3.Marzo");
                System.out.println("4.Abril");
                System.out.println("5.Mayo");
                System.out.println("6.Junio");
                System.out.println("7.Julio");
                System.out.println("8.Agosto");
                System.out.println("9.Septiembre");
                System.out.println("10.Octubre");
                System.out.println("11.Noviembre");
                System.out.println("12.Diciembre");
                mes= entrada.nextInt();
                for(int i=0;i<meses.length;i++){
                    if(mes==i){
                        System.out.print("Ingrese el pago: ");
                        pago= entrada.nextInt();
                        meses[i]=pago;
                    }
                }
                x=2;
            }


            if (opcion == 2){
                 for(int j=0;j<meses.length;j++){   
                    System.out.println("mes "+j+":"+meses[j]);

                }
                x=2;
            }
                
            if (opcion ==3){
                System.out.print("Ingrese el mes: ");
                mes2= entrada.nextInt();
                for(int j=0;j<meses.length;j++){
                    if(mes2==j){
                        System.out.println("Este es el pago: "+meses[j]);
                           
                    }
                }
                x=2;
            }

            if (opcion==4){
                n=0;
            }
            
        }
    }
}
