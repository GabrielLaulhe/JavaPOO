/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Operacion;
import Servicio.servicioOperacion;

/**
 *
 * @author Asus
 */
public class Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        servicioOperacion so = new servicioOperacion();
        
        Operacion O1 = so.crearOperacion();
        
        System.out.println("La suma de los numeros ingresados es "+ so.sumar(O1.getNumero1(), O1.getNumero2()));
        System.out.println("La resta de los numeros ingresados es "+ so.restar(O1.getNumero1(), O1.getNumero2()));
        System.out.println("El producto de los numeros ingresados es "+ so.multiplicar(O1.getNumero1(), O1.getNumero2()));
        System.out.println("El cociente de los numeros ingresados es "+ so.dividir(O1.getNumero1(), O1.getNumero2()));
      
        
    }
    
}
