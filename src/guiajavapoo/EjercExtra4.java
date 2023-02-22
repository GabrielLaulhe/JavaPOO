/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Fecha;
import Servicio.servicioFecha;

/**
 *
 * @author Asus
 */
public class EjercExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioFecha serv = new servicioFecha();
        
        Fecha f = new Fecha();
        
        
        
        serv.ingresarAnio(f);
        serv.ingresarMes(f);
        serv.cantidadDiasMes(f);
        System.out.println("La fecha ingresada es "+f);
        serv.diaAnterior(f);
        
        serv.diaPosterior(f);
        
    }
    
}
