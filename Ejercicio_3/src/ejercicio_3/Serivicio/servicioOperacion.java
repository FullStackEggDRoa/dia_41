/*
    EJERCICIO 3
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

package ejercicio_3.Serivicio;

import ejercicio_3.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicioOperacion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        System.out.print("Ingres el Número 1: ");
        int num1 = leer.nextInt();
        System.out.print("Ingres el Número 2: ");
        int num2 = leer.nextInt();
        
        return new Operacion(num1,num2);
    }
    public int sumar(Operacion operacion){
        int sumatoria=operacion.getNumero1()+operacion.getNumero2();
        return sumatoria;
    }
    public int restar(Operacion operacion){
        int resta=operacion.getNumero1()-operacion.getNumero2();
        return resta;
    }
    public int multiplicar(Operacion operacion){
        if(operacion.getNumero1()==0 || operacion.getNumero2()==0){
            System.out.println("Error: Multiplicacion por Cero");
            return 0;
        }else{
            int multiplicacion=operacion.getNumero1()*operacion.getNumero2();
            return multiplicacion;
        }
    }
    public float dividir(Operacion operacion){
        if(operacion.getNumero2()==0){
            System.out.println("Error: División por Cero");
            return 0;
        }else{
            float division=(float)operacion.getNumero1()/(float)operacion.getNumero2();
            return division;
        }
    }
    
}
