import javax.swing.*;
import java.awt.*;

public class EjemploGridBagLayout extends JFrame{

    public EjemploGridBagLayout() {
        initComponents();

    }

    public void initComponents(){
        setTitle("GridBagLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        JPanel principal = new JPanel();
        GridBagLayout capa_principal = new GridBagLayout();
        principal.setLayout(capa_principal);

        GridBagConstraints restriccion = new GridBagConstraints();

        JTextArea area_texto = new JTextArea();
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 2;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(area_texto, restriccion);

        JButton btn_1 = new JButton("Boton 1");
        restriccion.gridy = 0;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn_1, restriccion);

        JButton btn_2 = new JButton("Boton 2");
        restriccion.gridy = 1;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn_2, restriccion);


        JButton btn_3 = new JButton("Boton 3");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(btn_3, restriccion);

        JButton btn_4 = new JButton("Boton 4");
        restriccion.gridy = 2;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn_4, restriccion);


        JTextField campo = new JTextField("CAMPO DE TEXTO");
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo, restriccion);

        add(principal);
        revalidate();


    }
}