/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.PersonaE12;
import Servicio.servicioPersonaE12;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejerc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        servicioPersonaE12 ser = new servicioPersonaE12();
        PersonaE12 p1 = new PersonaE12();

        ser.crearPersona(p1);
        ser.calcularEdad(p1);
        
        System.out.println(" ");
        
        System.out.print("Ingrese su nombre");
        String nombre1 = leer.next();
        System.out.print("Ingrese su edad");
        int edad = leer.nextInt();
        if (ser.menorQue(p1, edad)) {
            System.out.println("Usted es mayor que la primera persona");
        }else{
            System.out.println("Usted es menor que la primera persona");
        }

        ser.mostrarPersona(p1, edad, nombre1);
        
    }
    
}
