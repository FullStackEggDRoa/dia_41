/*
    EJERCICIO_4
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio_4;

import ejercicio_4.Entidades.Rectangulo;
import ejercicio_4.Servicio.servicioRectangulo;

/**
 *
 * @author droa
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioRectangulo sR = new servicioRectangulo();
        
        System.out.println("Creación de Rectángulo ... ");
        Rectangulo rec1 = sR.crearRectangulo();
        System.out.println("--------------------");
        System.out.println("Resultados: ");
        sR.calcularSuperficie(rec1);
        sR.calcularPerimetro(rec1);
        System.out.println("Esquema del Rectángulo: ");
        sR.dibugarRectangulo(rec1);
    }
    
}
