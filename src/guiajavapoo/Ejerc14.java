/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Movil;
import Servicio.servicioMovil;

/**
 *
 * @author Asus
 */
public class Ejerc14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        servicioMovil serv = new servicioMovil();
        
        Movil m = new Movil();
        
        
        serv.cargarCelular(m);
        
        System.out.println(m);
        
        
        
        
        
    }
    
}
