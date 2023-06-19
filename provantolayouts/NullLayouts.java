import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class NullLayouts extends JFrame{
    public NullLayouts(){
        initComponents();
    }

    public void initComponents(){
        setVisible(true);
        setSize(400, 500);
        setTitle("NULL LAYOUT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(null);

        JButton btn = new JButton("Hola Mundo");
        contenedor.add(btn);
        btn.setBounds(100, 100, 100, 50);

        add(contenedor);
        revalidate();
    }

}