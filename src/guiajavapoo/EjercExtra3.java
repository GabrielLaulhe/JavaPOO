/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Pass;
import Servicio.servicioPass;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class EjercExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        servicioPass serv = new servicioPass();
        
        Pass u1 = new Pass("gabriel","gabriel123", 33894901);
        
        
        serv.menu(u1);
        
        System.out.println(u1);
        
        
        
    }
    
}
