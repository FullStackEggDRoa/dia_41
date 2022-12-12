/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import ejercicio_3.Entidades.Operacion;
import ejercicio_3.Serivicio.servicioOperacion;

/**
 *
 * @author droa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciación Servicios Operacion:
        servicioOperacion sO = new servicioOperacion();
        // Instanciación Operación.
        Operacion oper1 = sO.crearOperacion();
        //Resultados:
        System.out.println("-----------------------");
        System.out.println("Resultados:");
        System.out.println("La suma de los números ingresados es: "+sO.sumar(oper1));
        System.out.println("La resta de los números ingresados es: "+sO.restar(oper1));
        System.out.println("La multiplicación de los números ingresados es: "+sO.multiplicar(oper1));
        System.out.println("La división de los números ingresados es: "+(float)sO.dividir(oper1));
    }
    
}
