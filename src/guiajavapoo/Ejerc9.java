/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Matematica;
import Servicio.servicioMatematica;

/**
 *
 * @author Asus
 */
public class Ejerc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        servicioMatematica serv = new servicioMatematica();
        
        Matematica op = new Matematica();
        
        
        
        serv.crearValores(op);
        serv.devolverMayor(op);
        
        System.out.println("El resultado de la potencia del primer numero con el segundo es " + serv.calcularPotencia(op));
        serv.calcularRaiz(op);
    }
    
}
