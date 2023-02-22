/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioRaices {
    Scanner leer = new Scanner(System.in);
    
    
    
    public double crearDiscriminate(Raices d) {
       System.out.println("Ingrese el valor de a, b, c");
            d.setA(leer.nextInt());
            d.setB(leer.nextInt());
            d.setC(leer.nextInt());
            
       double disc = (d.getB()*d.getB())-4*d.getA()*d.getC();
        
       return disc;
    }
    
    public boolean tieneRaices(Raices d, double disc) {
        
        return disc>=0;
          
    }
    
    public boolean tieneRaiz(Raices d, double disc) {
        
    return disc==0;
    
    }
    
    
        
    }
    
    
    

