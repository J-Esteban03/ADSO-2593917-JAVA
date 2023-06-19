import javax.swing.*;
import java.awt.*;

public class EjemploGridLayout extends JFrame{

    public EjemploGridLayout() {
        initComponents();

    }

    public void initComponents(){
        setTitle("GridLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(3,4);
        contenedor.setLayout(capa);

        //crear el arreglo de jtextfield
        JTextField arreglo_inputs [] = new JTextField [12];

        //Instanciar cada posicion del arreglo con un objeto Jtextfield
        for (int i=0; i<arreglo_inputs.length; i++){
            arreglo_inputs[i] = new JTextField();

        }

        //Asignar cada input en el contenedor
        for (int i=0; i<arreglo_inputs.length; i++){
            contenedor.add(arreglo_inputs[i]);
        }

        add(contenedor);
        revalidate();


    }
}