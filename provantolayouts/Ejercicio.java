import javax.swing.*;
import java.awt.*;

public class Ejercicio extends JFrame{

    public Ejercicio() {
        initComponents();

    }

    public void initComponents(){

        // Configurar el BorderLayout para los botones superiores
        JPanel panelBotonesArriba = new JPanel(new GridLayout(1, 4));
        for (int i = 1; i <= 4; i++) {
            JButton boton = new JButton("Botón " + i);
            boton.setBackground(Color.BLUE);
            panelBotonesArriba.add(boton);
        }
        
        // Configurar el BoxLayout para los botones de la parte izquierda
        JPanel panelBotonesIzquierda = new JPanel();
        panelBotonesIzquierda.setLayout(new BoxLayout(panelBotonesIzquierda, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 4; i++) {
            JButton boton = new JButton("Botón " + i);
            panelBotonesIzquierda.add(boton);
        }
        
        // Configurar el panel central
        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.WHITE);
        
        // Configurar el BoxLayout para los botones de la parte derecha
        JPanel panelBotonesDerecha = new JPanel();
        panelBotonesDerecha.setLayout(new BoxLayout(panelBotonesDerecha, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 4; i++) {
            JButton boton = new JButton("" + i);
            panelBotonesDerecha.add(boton);
        }
        
        // Configurar el panel inferior
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.setBackground(Color.YELLOW);
        JTextField campoTexto = new JTextField();
        JButton botonEnviar = new JButton("Enviar");
        panelInferior.add(new JLabel("Pon texto: "), BorderLayout.WEST);
        panelInferior.add(campoTexto, BorderLayout.CENTER);
        panelInferior.add(botonEnviar, BorderLayout.EAST);
        
        // Agregar los paneles al JFrame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelBotonesArriba, BorderLayout.NORTH);
        getContentPane().add(panelBotonesIzquierda, BorderLayout.WEST);
        getContentPane().add(panelCentral, BorderLayout.CENTER);
        getContentPane().add(panelBotonesDerecha, BorderLayout.EAST);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);
        
        
        setTitle("GridBagLayout");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}