/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioPuntos {
    
    
    public void crearPuntos(Puntos punto) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.println("Ingrese x1 y luego y1");
        punto.setX1(leer.nextInt());
        punto.setY1(leer.nextInt());
        
        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.println("Ingrese x2 y luego y2");
        punto.setX2(leer.nextInt());
        punto.setY2(leer.nextInt());
        
    }
    
    public double distanciaPuntos(Puntos punto){
        
        double dist;
        // punto.getX2() - punto.getX1() = cateto1
        // punto.getY2() - punto.getY1() = cateto2
        return dist = Math.hypot(punto.getX2() - punto.getX1(), punto.getY2() - punto.getY1());
    }
    
    
    
}
