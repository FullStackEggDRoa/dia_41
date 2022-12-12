/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.Servicio;

import ejercicio_4.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicioRectangulo {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        System.out.println("Creación del Réctangulo");
        System.out.print("Ingrese el valor de la base: ");
        int b = leer.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        int h = leer.nextInt();
        return new Rectangulo(b,h);
    }
    public void calcularSuperficie(Rectangulo rectangulo){
        System.out.println("La superficie del rectángulo creado es: "+(rectangulo.getBase()*rectangulo.getAltura()));
    }
    public void calcularPerimetro(Rectangulo rectangulo){
        System.out.println("El Perímetro del rectángulo creado es: "+((rectangulo.getBase()+rectangulo.getAltura())*2));
    }
    public void dibugarRectangulo(Rectangulo rectangulo){
        for (int i=0;i<rectangulo.getAltura();i++){
            for (int j=0;j < rectangulo.getBase();j++){
                if(i == 0 || i == rectangulo.getAltura()-1){
                    System.out.print("*");
                } else{
                    
                    if(j == 0 || j==rectangulo.getBase()-1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
                
                
                }
            }
            System.out.println("");
        }
    }
}
