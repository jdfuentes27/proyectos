package proyecto1;

import java.awt.*;
import javax.swing.*;

public class Proyecto1 {

    public static void main(String[] args) {
        //Sesion sesion = new Sesion();
        //sesion.setVisible(true);
        //identificacion();
        
        Administracion admin = new Administracion();
        admin.setVisible(true);
    }
    
    public static void identificacion() {
        JFrame jfr = new JFrame();
        jfr.setSize(450, 250);//tamaño y posicion
        jfr.setDefaultCloseOperation(3);//cerrar el programa
        jfr.setLocationRelativeTo(null); //establacer la ventana en el centro de la pantalla
        jfr.setTitle("Iniciar Seción");//titulo de la ventana
        jfr.setVisible(true);

        JPanel Profesores = new JPanel();
        Object[][] datos =
        {
            {new Integer(1),"Nombre","Apellido","Correo", "Genero"}
            
        };
        String[] columnas = {"Codigo","Nombre","Apellidos","Correo","Genero"};
        JTable t = new JTable(datos,columnas);
        JScrollPane sp = new JScrollPane(t);
        Profesores.add(sp);

    }
}
