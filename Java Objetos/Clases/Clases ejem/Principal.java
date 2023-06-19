public class Principal{
    public static void main (String [] args){


        Persona lista [] = new Perosna [10];

        //Instancia de la clase Persona

        Persona mauricio = new Persona();
        Persona esteban = new Persona(10004, "Juan esteban", "marin Arboleda", "masculino", 19, 59000, 170);
        Persona alberth = new Persona(1021654, "alberth", "aricapa");

        mauricio.ImprimirCartaPresentacio();
        esteban.ImprimirCartaPresentacio();
        alberth.ImprimirCartaPresentacio();

        esteban.comer(850);
        esteban.ImprimirCartaPresentacio();



    }
}