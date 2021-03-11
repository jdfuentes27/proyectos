package proyecto1;

import java.awt.*;
import javax.swing.*;

public class Sesion extends JFrame {

public JPanel panel;
    
    public Sesion() {
        setSize(450, 250);//tamaño y posicion
        setDefaultCloseOperation(3);//cerrar el programa
        setLocationRelativeTo(null); //establacer la ventana en el centro de la pantalla
        setTitle("Iniciar Seción");//titulo de la ventana
        setVisible(true);
        PanelSesion();
    }

    private void PanelSesion() {
        panel = new JPanel();
        panel.setBackground(Color.yellow); //establece el color del panel
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        //llamar a las clases 
        Etiquetas();
        Text();
        BottunIniciar();

       
    }

    private void Etiquetas() {
        JLabel nombre = new JLabel("Usuario:");
        nombre.setBounds(30, 40, 60, 30);
        nombre.setHorizontalAlignment(SwingConstants.LEFT);
        nombre.setFont(new Font("arial", Font.BOLD, 12));//establecer fuente del texto
        panel.add(nombre);

        JLabel contraseña = new JLabel();
        contraseña.setText("Contraseña:");
        contraseña.setBackground(Color.BLACK);
        contraseña.setFont(new Font("arial", Font.BOLD, 12));
        contraseña.setBounds(30, 80, 80, 30);
        panel.add(contraseña).setVisible(true);
    }

    private void Text() {
        JTextField ingrese_nombre = new JTextField();
        ingrese_nombre.setBounds(180, 40, 120, 30);
        panel.add(ingrese_nombre);

        JPasswordField ingrese_contraseña = new JPasswordField();
        ingrese_contraseña.setBounds(180, 80, 120, 30);
        panel.add(ingrese_contraseña);
    }
    
    private void BottunIniciar(){
        Button iniciar = new Button("Iniciar Seción");
        iniciar.setBounds(170, 150, 100, 30);
        iniciar.setEnabled(true); //encendido del  boton
        iniciar.setForeground(Color.BLACK);
        iniciar.setFont(new Font("arial",Font.BOLD,12));
        panel.add(iniciar);
    }
    
}
