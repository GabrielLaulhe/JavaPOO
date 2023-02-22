/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Cafetera;
import Servicio.servicioCafetera;

/**
 *
 * @author Asus
 */
public class Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        servicioCafetera serv = new servicioCafetera();
        
        Cafetera C1 = serv.crearCafetera();
        
        
        Cafetera c2 = serv.llenarCafetera(C1);
        System.out.println(" ");
        serv.servirTaza(C1);
        System.out.println(" ");
        serv.vaciarCafetera(C1);
        System.out.println(" ");
        serv.agregarCafe(C1);
    }
    
}
