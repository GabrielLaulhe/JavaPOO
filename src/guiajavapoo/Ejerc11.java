/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejerc11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fecha, fechaActual;
        
        System.out.println("Ingrese el dia en formato numerico");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        mes = mes-1;
        System.out.println("Ingrese el anio en formato yy");
        int anio = leer.nextInt();
        
        fecha = new Date(anio, mes, dia);
        System.out.println(fecha.toString());
        
        fechaActual = new Date();
        System.out.println(fechaActual.toString());
        
        
        
        long dif = 0;
        dif = fechaActual.getYear()-fecha.getYear();
        System.out.println("La diferencia entre una fecha y la otra es " + dif);
    }
    
}
