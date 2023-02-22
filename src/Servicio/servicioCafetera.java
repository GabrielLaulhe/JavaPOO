/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class servicioCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//    • Método vaciarCafetera(): pone la cantidad de café actual en cero.
//    • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    
    public Cafetera crearCafetera(){
        Cafetera C1 = new Cafetera();
        System.out.println("Ingrese la capacidad maxima");
        C1.setCantidadActual(leer.nextInt());
        return C1;
    }
    
    
    
    public Cafetera llenarCafetera(Cafetera C1) {
        C1.setCantidadActual(C1.getCantidadMaxima());
        System.out.println("Su cafetera se lleno");
        return C1;
    }

    public void servirTaza(Cafetera C1) {
        
        System.out.println("Ingrese el tamano de la taza");
        int taza = leer.nextInt();
        
        if (C1.getCantidadActual() >= taza) {
            C1.setCantidadActual(C1.getCantidadActual() - taza);
            System.out.println("Se lleno toda la taza y lo que queda es " + C1.getCantidadActual());
        } else {
            C1.setCantidadActual(0);
            int resto = taza - C1.getCantidadActual();
            System.out.println("no se pudo llenar toda la taza, quedo por llenar " + resto);
        }
    }

    public void vaciarCafetera(Cafetera C1) {

        System.out.println("Se procede con el vaciado de la cafetera");
        C1.setCantidadActual(0);
        System.out.println("La cantidad actual es " + C1.getCantidadActual());
    }

    public void agregarCafe(Cafetera C1) {

        System.out.println("Ingrese la cantidad de cafe que desea agregar ");
        int cafe = leer.nextInt();
        if (cafe >= C1.getCantidadMaxima()) {
            C1.setCantidadActual(C1.getCantidadMaxima());
        } else {
            C1.setCantidadActual(cafe);
        }

    }
    
    
    
}
