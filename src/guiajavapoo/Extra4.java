/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.NIF;
import Servicio.servicioNIF;

/**
 *
 * @author Asus
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioNIF serv = new servicioNIF();
        
        NIF a = new NIF();
        
        serv.crearDni(a);
        serv.mostrar(a);
        
    }
    
}
