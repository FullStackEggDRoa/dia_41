/*
    EJERCICIO 2:
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
   tipo real. A continuación, se deben crear los siguientes métodos:
   a) Método constructor que inicialice el radio pasado como parámetro.
   b) Métodos get y set para el atributo radio de la clase Circunferencia.
   c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
   objeto.
   d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
   e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio_2;

import ejercicio_2.Entidades.Circunferencia;
import ejercicio_2.Servicios.serviciosCircunferencia;


/**
 *
 * @author droa
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serviciosCircunferencia sC = new serviciosCircunferencia();
        Circunferencia c1= sC.crearCircunferencia();
        System.out.println("Creación de Circunferencia:");
        System.out.println("Resultados:");
        sC.Area(c1);
        sC.Perimetro(c1);
        
        
    }   
    
}
