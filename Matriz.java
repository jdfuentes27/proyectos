/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matriz {

    static int[][] matriza = new int[3][3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        leer();
        mostrar(matriza);
        
    }
    
    public static void leer() {
        Scanner a = new Scanner(System.in);
        //System.out.println("Ingrese la ruta que desea leer");
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("Ingrese la ruta del archivo que desea ver");
            String ruta = a.nextLine();
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                String[] numeros = linea.split(",");
                
                for (int i = 0; i < numeros.length; i++) {
                    //System.out.print("[" + contador + "][" + i + "]=");
                    //System.out.println(numeros[i]);
                    matriza[contador][i] = Integer.parseInt(numeros[i]);
                }
                //System.out.println("----------------------");
                contador++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }

    }
}
