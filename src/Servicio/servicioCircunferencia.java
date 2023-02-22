/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioCircunferencia {
    
    public Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el valor de radio");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
       
    }
    
    public double metodoArea(double radio){
        double area = Math.PI*radio*radio;
        return area;   
    }
    
    public double metodoPerimetro(double radio){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    
    
}
