/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Puntos;
import Servicio.servicioPuntos;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Extra2 {
 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioPuntos serv = new servicioPuntos();
        
        Puntos Punto = new Puntos();
        
        serv.crearPuntos(Punto);
        System.out.println("La distancia entre ambos puntos es el siguiente: " + serv.distanciaPuntos(Punto));
    
    

    
    }
    
}
