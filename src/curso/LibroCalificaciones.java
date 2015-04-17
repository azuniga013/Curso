/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

/**
 *
 * @author azuniga
 * 
 */

public class LibroCalificaciones {
    
   /**
    * @see "documento de Word"
    * Este campo nos sirve para identificar el nombrre del curso
    * 
    */
    
  public  String  nombredelCurso = "Texto" ;
    
    public LibroCalificaciones( String cursoVarios) {
        this.nombredelCurso = cursoVarios;
    }
        
    public void SetCurso(String nombreCurso) {        
        this.nombredelCurso = nombreCurso;        
    }
    
    public String GetCurso() {
        return nombredelCurso;
    }
    
    public void mostrarNombre() {
        System.out.print(nombredelCurso);
    }
            
}
