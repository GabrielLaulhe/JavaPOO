/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioNIF {

    Scanner leer = new Scanner(System.in);

    public void crearDni(NIF a) {

        System.out.println("Ingrese su DNI");
        a.setDNI(leer.nextLong());

        long resto = a.getDNI() % 23;

        char[] car = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        for (int i = 0; i < 22; i++) {
            if (i == resto) {
                a.setLetra(car[i]);
            }
        }
        
        
    }
    
    public void mostrar(NIF a){
        
        System.out.println(a.getDNI() + "-" + a.getLetra());
        
    }

   
}
