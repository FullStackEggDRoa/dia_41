

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2.Servicios;

import ejercicio_2.Entidades.Circunferencia;
import java.util.Scanner;

import java.lang.Math;

/**
 *
 * @author droa
 */

public class serviciosCircunferencia {
    
    Scanner leer = new Scanner(System.in);
    //Math operador
    
    public Circunferencia crearCircunferencia(){
        System.out.print("Ingrese el radio de la Circunferencia: "); 
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    
    }
    
    public void Area(Circunferencia cir){
        double area_aux=Math.PI * Math.pow(cir.getRadio(), (double)2);
        System.out.println("El Area de la Circunferencia es: "+area_aux);
    }
    
    public void Perimetro(Circunferencia cir){
        System.out.println("El Perímetro de la Circunferencia es: "+(2*cir.getRadio()*Math.PI));
    }
    
}
