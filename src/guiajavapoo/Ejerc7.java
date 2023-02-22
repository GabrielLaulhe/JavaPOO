/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Persona;
import Servicio.servicioPersona;

/**
 *
 * @author Asus
 */
public class Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         servicioPersona serv = new servicioPersona();
        // se crea un vector para crear los objetos
        Persona[] persona = new Persona[4];
        
       
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        
        for (int i = 0; i < 4; i++) {
            persona[i] = serv.crearPersona();
            if (serv.calcularIMC(persona[i]) == -1) {
                cont1++;
            } else if (serv.calcularIMC(persona[i]) == 0) {
                cont2++;
            } else {
                cont3++;
            }

            if (!serv.esMayorDeEdad(persona[i])) {
                cont4++;
            }

        }

        System.out.println("El porcentaje de personas que estan por debajo de su peso ideal es " + cont1*100/4);
        System.out.println("El porcentaje de personas que estan en su peso ideal es " + cont2*100/4);
        System.out.println("El porcentaje de personas que estan por encima de su peso ideal es " + cont3*100/4);

        System.out.println("El porcentaje de personas mayores de edad es " + (4 - cont4)*100/4);
        System.out.println("El porcentaje de personas menores de edad es " + (cont4)*100/4);
    }
    
}
