/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;


import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

       

/**
 *
 * @author Adan Zuniga
 * @author Jessica Zuniga
 * @version 1.0, 31/01/2014
 * @see link http:\\www.bancatlan.hn
 * @since jdk 6.0
 */


public class Curso  {

   /**
    * @param string[]    Parametro String del Main
    * @see NewClass      Nueva Clase
    */
    public static void main(String[] string) {
   
        LibroCalificaciones libroCalificaciones = new LibroCalificaciones(null);
        LibroCalificaciones libroCiencias = new LibroCalificaciones(null);
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO A JAVA SE3");
       
        String nombre = JOptionPane.showInputDialog("Cuale es su Nombre");
        
        System.out.println(nombre);
        
        
        
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Que edad tienes");
        edad = teclado.nextInt();
        
        if (edad>=18) {
            System.out.println("Entonces si eres Mayor de Edad");
        }
        else {
            System.out.println("Entonces eres Menor de Edad");
                      
        }           
        
   
        UtilizarShitch(edad);        
        UtilizarFor();   
        UtilizarWhile();
        UtilizarDOWhile();
        // UtilizarArray(); 
        
        libroCalificaciones.SetCurso("Demo 1");
        libroCalificaciones.mostrarNombre();
        libroCiencias.SetCurso("Objecto No.2");
        String nombredelCurso = "";
        nombredelCurso = libroCiencias.GetCurso();
        System.out.print(nombredelCurso);
        
        PanelDibujo panelDibujo = new PanelDibujo();
       
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        aplicacion.add( panelDibujo );
        aplicacion.setSize( 250, 250 );        
        aplicacion.setVisible( true );
       
    }
    
            
         
    private static void UtilizarShitch(int x  ) {
       
        switch(x) {       
        case 1:     
        System.out.println("El valor es 1");
        break;
        case 2:
        System.out.println("El valor es 2");
        break;
        case 3:
        System.out.println("El valor es 3");
        break;
        default:
        System.out.println("Quien Sabe que numero Puso");
        break;
        }
                                           
    }
    
       private static void UtilizarFor()  {
            int y = 0;           
            for (y = 1; y <= 100;  y++ )
            {
               System.out.print( y + "-" );                           
             }                           
        }
       
       
       private static void UtilizarWhile()  {
            int y = 1 ;           
            
            while ( y <= 200){
                y = y + 1;
               System.out.println( y + "*" );                           
             }                           
        }
       
      
       private static void UtilizarDOWhile()  {
            int y = 1 ;           
            
            do {
                System.out.println( y + "R");                           
                y = y + 1;
             }  while( y < 200);                           
        }
      
           
}
