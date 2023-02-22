/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mes[] = new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}; 
        
        String mesSecreto = mes[9];
        String mes1;
        do {
            System.out.println("Adivine el mes secreto");
            mes1 = leer.next();
            if (!(mes1.equals(mesSecreto))) {
                System.out.println("error, mes incorrecto");
            } else {
                System.out.println("acertaste!!");
            }
        } while (!(mes1.equals(mesSecreto)));
        
        
        
        
        
        
    }
    
}
