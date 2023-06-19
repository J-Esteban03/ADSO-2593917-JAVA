
import javax.swing.*;
import java.awt.*;


public class EjemploBorderLayout extends JFrame{

    public EjemploBorderLayout() {
        initComponents();

    }
    public void initComponents(){
        setTitle("BorderLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);

        JLabel etiqueta_superior = new JLabel("superior", SwingConstants.CENTER);
        etiqueta_superior.setOpaque(true);
        etiqueta_superior.setBackground(Color.red);

        JLabel etiqueta_izquierda = new JLabel("izquierda");
        etiqueta_izquierda.setOpaque(true);
        etiqueta_izquierda.setBackground(Color.blue);

        JLabel etiqueta_centro = new JLabel("centro", SwingConstants.CENTER);
        etiqueta_centro.setOpaque(true);
        etiqueta_centro.setBackground(Color.pink);

        JLabel etiqueta_derecha = new JLabel("derecha");
        etiqueta_derecha.setOpaque(true);
        etiqueta_derecha.setBackground(Color.orange);

        JLabel etiqueta_inferior = new JLabel("inferior", SwingConstants.CENTER);
        etiqueta_inferior.setOpaque(true);
        etiqueta_inferior.setBackground(Color.yellow);

        contenedor.add(etiqueta_superior, BorderLayout.NORTH);
        contenedor.add(etiqueta_inferior, BorderLayout.SOUTH);
        contenedor.add(etiqueta_izquierda, BorderLayout.WEST);
        contenedor.add(etiqueta_derecha, BorderLayout.EAST);
        contenedor.add(etiqueta_centro, BorderLayout.CENTER);

        add(contenedor);
        revalidate();
    }
}