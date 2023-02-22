/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Triangulo;
import Servicio.ServicioTriangulo;

/**
 *
 * @author Asus
 */
public class EjercExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangulo iso[] = new Triangulo[4];
        ServicioTriangulo serv = new ServicioTriangulo();
        
        
        
        for (int i = 0; i < 4; i++) {
            iso[i] = serv.crearTriangulo();
            
            
            
        }
        
        
        
    }
    
}
