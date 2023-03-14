public class Persona{
    //Atributos

    int cedula;
    String nombre;
    String apellidos;
    String genero;
    int edad;
    int peso;
    int altura;

    //metodos
    //constructores
    public Persona(){
        this.cedula = 0;
        this.nombre = "";
        this.apellidos = "";
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    //constructor
    public Persona(int cedula, String nombre, String apellidos){
        this.cedula =cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }


    //constructor
    public Persona(int cedula, String nombre, String apellidos, String genero, int edad, int peso, int altura){
        this.cedula =cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // metodo get: obtener
    // metodo set: moficiar
    public int getPeso(){
        return this.peso;
    }

    //void no retorna nada
    public void setPeso(int nuevo_peso){
        this.peso = nuevo_peso;
        
    }

    public void comer (int gramos){
        //el --> += <-- es un incremento
        // this.peso = this.peso (int) (gramos * 0.1);
        
        this.peso += (int) (gramos * 0.1);
    }

    public void ImprimirCartaPresentacio(){
        System.out.println("-------------------------");
        System.out.println("----- DATOS PERSONA ------");
        System.out.println("-------------------------");
        System.out.println("cedula: " + this.cedula);
        System.out.println("nombre: " + this.nombre);
        System.out.println("apellido: " + this.apellidos);
        System.out.println("genero: " + this.genero);
        System.out.println("edad: " + this.edad);
        System.out.println("peso: " + this.peso);
        System.out.println("altura: " + this.altura);
        System.out.println("-------------------------");
    }

}