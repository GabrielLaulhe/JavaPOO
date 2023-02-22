/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Cadena;
import Servicio.servicioCadena;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        servicioCadena serv = new servicioCadena();
        
        Cadena f1 = new Cadena();
        
        serv.crearFrase(f1);
        serv.mostrarVocales(f1);
        serv.invertirFrase(f1);
        serv.invertirFrase(f1);
        System.out.println("Ingrese un caracter");
        System.out.println("La frase tiene " + serv.vecesRepetido(f1, leer.next()) + " veces el caracter ingresado");

        serv.compararLongitud(f1);
        
        
        System.out.println("Ingrese una frase");
        
        serv.unirFrases(f1, leer.next());
        
        serv.reemplazar(f1);
        
        if (serv.contieneLetra(f1)) {
            System.out.println("La frase contiene la letra");
        }else{
            System.out.println("La frase no contiene la letra");
        }
        
        
    }
    
}
