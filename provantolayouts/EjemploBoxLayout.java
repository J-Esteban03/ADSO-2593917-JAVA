import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploBoxLayout extends JFrame{

    public EjemploBoxLayout() {
        initComponents();

    }

    public void initComponents(){
        setTitle("BoxLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();

        //se puede mostrar en eje X o eje Y
        BoxLayout capa = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
        contenedor.setLayout(capa);

        JLabel etiqueta_01 = new JLabel("Etiqueta_01");
        JLabel etiqueta_02 = new JLabel("Etiqueta_02");
        JLabel etiqueta_03 = new JLabel("Etiqueta_03");
        JLabel etiqueta_04 = new JLabel("Etiqueta_04");
        JLabel etiqueta_05 = new JLabel("Etiqueta_05");

        contenedor.add(etiqueta_01);
        contenedor.add(etiqueta_02);
        contenedor.add(etiqueta_03);
        contenedor.add(etiqueta_04);
        contenedor.add(etiqueta_05);

        add(contenedor);
        revalidate();
    }
}