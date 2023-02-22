/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tiempo;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Asus
 */
public class servicioTiempo {

    Scanner leer = new Scanner(System.in);

    public void imprimirHoraCompleta(Tiempo a) throws InterruptedException {
        System.out.println("ingrese una hora");
        a.setHoras(leer.nextInt());
        System.out.println("Ingrese los minutos");
        a.setMinutos(leer.nextInt());
        System.out.println("Ingrese los segundos");
        a.setSegundos(leer.nextInt());

        while (true) {
            if (a.getSegundos() == 59) {
                a.setSegundos(0);
                a.setMinutos(a.getMinutos() + 1);

            } else {
                a.setSegundos(a.getSegundos() + 1);
            }
            if (a.getMinutos() > 59) {
                a.setMinutos(0);
                a.setHoras(a.getHoras() + 1);
            } 

            
            if (a.getHoras() > 23) {
                a.setHoras(0);
            }
            System.out.println(a.getHoras() + " : " + a.getMinutos() +" : "+ a.getSegundos());
            Thread.sleep(1000);
        }
        
    }
}