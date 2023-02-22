/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioOperacion {
    
    
    public Scanner leer = new Scanner(System.in);
    
    
    public Operacion crearOperacion(){
        System.out.println("ingrese dos numeros");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        return new Operacion(numero1, numero2);
        
    }
    
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    
    public int multiplicar(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("error");
            return 0;
        }
        
        int producto = numero1 * numero2;
        return producto;
    }
     
    public double dividir(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("error");
            return 0;
        }
        
        double cociente = (numero1/numero2);
        return cociente;
    }
}

