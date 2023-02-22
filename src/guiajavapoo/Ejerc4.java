package guiajavapoo;


import Entidad.Rectangulo;
import Servicio.servicioRectangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        servicioRectangulo sr = new servicioRectangulo();
        
        Rectangulo R1 = sr.crearRectangulo();
        
        System.out.println("La superficie del rectangulo es "+ sr.metodoSuperficie(R1.getBase(),R1.getAltura()));
        System.out.println("El perimetro del rectangulo es "+ sr.metodoPerimetro(R1.getBase(),R1.getAltura()));
        
        sr.dibujoRectangulo(R1.getBase(), R1.getAltura());
    }
    
}
