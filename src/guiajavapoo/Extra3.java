/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Raices;
import Servicio.servicioRaices;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        servicioRaices serv = new servicioRaices();
        
        
        Raices d = new Raices();
        serv.crearDiscriminate(d);
        
        
        if (serv.tieneRaices(d, serv.crearDiscriminate(d))){
            
            System.out.println("La ecuacion tiene dos posibles soluciones");
        }
        
        
         
        
        if (serv.tieneRaices(d, serv.crearDiscriminate(d))) {
            
           double disc1 = (-d.getB() + sqrt(serv.crearDiscriminate(d)))/2*d.getA();
           double disc2 = (-d.getB() - sqrt(serv.crearDiscriminate(d)))/2*d.getA();

            System.out.println("Las dos posibles soluciones son que X sea igual a: "+ disc1 +" y "+ disc2);
               
        }
        
        if (serv.tieneRaiz(d, serv.crearDiscriminate(d))) {
           double disc3 = (-d.getB() + sqrt(serv.crearDiscriminate(d)))/2*d.getA();
            
            System.out.println("La posible solucion es " + disc3);
        }
        
        
        
    }
   
   
   
}
