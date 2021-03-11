package proyecto1;

import java.awt.*;
import javax.swing.*;

public class Administracion extends JFrame {
   public JPanel panel,Profesores,Cursos,Alumnos;
   
   public Administracion(){
        setSize(850, 650);//tamaño y posicion
        setDefaultCloseOperation(3);//cerrar el programa
        setLocationRelativeTo(null); //establacer la ventana en el centro de la pantalla
        setTitle("Iniciar Seción");//titulo de la ventana
        setVisible(true);
        JTabbePanel();
   }
   
   private void JTabbePanel(){
        
        JTabbedPane pestaña = new JTabbedPane();
        
        //profesores
        Profesores = new JPanel();
        Profesores.setLayout(null);
        Profesores.setBackground(Color.yellow);
        JLabel lista = new JLabel("Listado Oficial");
        lista.setFont(new Font("arial", Font.BOLD, 14));
        lista.setBounds(10, 10, 100, 20);
        Profesores.add(lista);
        
        Object[][] datos =
        {
            {"","","","",""},
            {"","","","",""},           
        };
        String[] columnas = {"Codigo","Nombre","Apellidos","Correo","Genero"};
        JTable t = new JTable(datos,columnas);
        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(10, 40, 500, 500);
        
        Button crear = new Button("Crear");
        crear.setBounds(550, 40, 100, 50);
        Profesores.add(crear);
        
        Button carga = new Button("Carga Masiva");
        carga.setBounds(690, 40, 100, 50);
        Profesores.add(carga);
        
        Button actualizar = new Button("Actualizar");
        actualizar.setBounds(550, 105, 100, 50);
        Profesores.add(actualizar);
        
        Button eliminar = new Button("Eliminar");
        eliminar.setBounds(690, 105, 100, 50);
        Profesores.add(eliminar);
        
        Button exportar = new Button("Ecportar Listado a PDF");
        exportar.setBounds(550, 165, 240, 50);
        Profesores.add(exportar);
        Profesores.add(sp);
        
        //Cursos
        Cursos = new JPanel();
        Cursos.setBackground(Color.orange);
        Cursos.setLayout(null);
        JLabel lista2 = new JLabel("Listado Oficial");
        lista2.setFont(new Font("arial", Font.BOLD, 14));
        lista2.setBounds(10, 10, 100, 20);
        Cursos.add(lista2);
        
        Object[][] datos2 =
        {
            {"","","","", ""},
            {"","","","", ""},           
        };
        String[] columnas2 = {"Codigo","Nombre","Apellidos","Correo","Genero"};
        JTable t2 = new JTable(datos2,columnas2);
        JScrollPane sp2 = new JScrollPane(t2);
        sp2.setBounds(10, 40, 500, 500);
        Cursos.add(sp2);
        
        Button crear2 = new Button("Crear");
        crear2.setBounds(550, 40, 100, 50);
        Cursos.add(crear2);
        
        Button carga2 = new Button("Carga Masiva");
        carga2.setBounds(690, 40, 100, 50);
        Cursos.add(carga2);
        
        Button actualizar2 = new Button("Actualizar");
        actualizar2.setBounds(550, 105, 100, 50);
        Cursos.add(actualizar2);
        
        Button eliminar2 = new Button("Eliminar");
        eliminar2.setBounds(690, 105, 100, 50);
        Cursos.add(eliminar2);
        
        Button exportar2 = new Button("Ecportar Listado a PDF");
        exportar2.setBounds(550, 165, 240, 50);
        Cursos.add(exportar2);
        
        
        //alumnos
        Alumnos = new JPanel();
        Alumnos.setLayout(null);
        Alumnos.setBackground(Color.blue);
        Alumnos.setLayout(null);
        JLabel lista3 = new JLabel("Listado Oficial");
        lista3.setFont(new Font("arial", Font.BOLD, 14));
        lista3.setBounds(10, 10, 100, 20);
        Alumnos.add(lista3);
        
        Object[][] datos3 =
        {
            {"","","","", ""},
            {"","","","", ""},           
        };
        String[] columnas3 = {"Codigo","Nombre","Apellidos","Correo","Genero"};
        JTable t3 = new JTable(datos2,columnas2);
        JScrollPane sp3 = new JScrollPane(t3);
        sp3.setBounds(10, 40, 500, 500);
        Alumnos.add(sp3);
        
        Button carga3 = new Button("Carga Masiva");
        carga3.setBounds(550, 40, 240, 50);
        Alumnos.add(carga3);
        
        Button exportar3 = new Button("Exportar Listado a PDF");
        exportar3.setBounds(550, 115, 240, 50);
        Alumnos.add(exportar3);
        
        
        pestaña.addTab("Profesores",Profesores);
        pestaña.addTab("Cursos", Cursos);
        pestaña.addTab("Alumnos", Alumnos);
        this.add(pestaña);
       
   }
}
