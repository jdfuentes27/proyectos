package tarea1;

import java.util.Scanner;

public class Tarea1 {
    static Scanner num;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int selec = 0;
        do {
            
            System.out.println("Gracias por venir a esta aplicacaion");
            System.out.println("Por favor seleccione una opción del menu que se le presentara a continuación");
            System.out.println("1. Numero par e impar.");
            System.out.println("2. Potenciación de un numero.");
            System.out.println("3. Numero primo.");
            System.out.println("4. Calculadora basica.");
            System.out.println("5. Salir.");
            
            try {
                num = new Scanner(System.in);
                selec = num.nextInt();
            }catch (Exception e){
                System.out.println("Por favor ingrese un numero");
            }
            
            switch(selec){
                case 1:
                    boolean es = pei ();
                    if (es){
                        System.out.println("Es un nunmero par");
                        }else {
                        System.out.println("Es un numero impar");
                    }
                    break;
                case 2:
                    potencia();
                    break;  
                case 3:
                    esprimo();
                    break;
                case 4:
                    calculadora ();
                    break;
                case 5:
                        
                    break;
                    
        }
            
        } while (selec != 5);
        
    }
    
        public static boolean pei (){
            System.out.println("Ingrese un numero entero");
            int n1 = num.nextInt();
            if ((n1  % 2)==0 ){
                return true;
            }else{
                return false;
            }
        }
        public static void potencia(){
            System.out.println("Por favor ingrese un numero base");
            int n1 = num.nextInt();
            System.out.println("Por favor ingrese el limite de la potencia");
            int n2 = num.nextInt();
            if (n2 < 0){
                System.out.println("Por favor ingrese un nuemro positivo");
                potencia ();
            }
            int res = 1 ;
            for (int i = 1; i <= n2; i++){
                res = res * n1;
                System.out.println(res);
            }
        }
        
        public static void esprimo(){
            System.out.println("Ingrese el inicio del rango");
            int n1 = num.nextInt();
            System.out.println("Ingrese el final del rango");
            int n2 = num.nextInt();
            
            for (int i = n1; i < n2; i++){
                int rang = 0;
                for (int j = 1 ; j <= i ; j++){
                    if (i % j == 0 ){
                        rang++;
                    }
                }
                 if (rang == 2){
                    System.out.println(i);
                }
            }
        }
        
        public static void calculadora(){
            System.out.println("Por favor seleccione una de las siguientes opciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            int menu;
            menu = num.nextInt();
            int n1,n2;
            int res = 0;
            switch (menu){
                case 1:
                    System.out.println("Ingrese el primer numero");
                    n1 = num.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = num.nextInt();
                    res = n1+n2;
                    System.out.println("El resultado es " + res );
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    n1 = num.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = num.nextInt();
                    res = n1-n2;
                    System.out.println("El resultado es " + res );
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero");
                    n1 = num.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = num.nextInt();
                    res = n1*n2;
                    System.out.println("El resultado es " + res );
                    
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero");
                    n1 = num.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = num.nextInt();
                    res = n1%n2;
                    System.out.println("El resultado es " + res );
                    
                    break;    
            }
        }
}        
        