/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Tiempo;
import Servicio.servicioTiempo;

/**
 *
 * @author Asus
 */
public class EjercExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
//        Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
//constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
//Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
//animas a simular el paso del tiempo en consola??????

        servicioTiempo serv = new servicioTiempo();
        
        Tiempo a = new Tiempo();
        
        serv.imprimirHoraCompleta(a);
    }
    
}
