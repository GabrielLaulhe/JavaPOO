/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Triangulo;

/**
 *
 * @author Asus
 */
public class ServicioTriangulo {
    
    public Triangulo crearTriangulo() {
        Triangulo iso = new Triangulo();
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el valor de la base");
            iso.setBase(i);
            System.out.println("Ingrese el valor de la altura");
            iso.setAltura(i);
        }
        return iso;
    }
    
    public int calcularArea(Triangulo iso) {
    
        int area;
        area = (iso.getBase()*iso.getAltura())/2;
    return area;
    
}
    
    public double calcularPerimetro(Triangulo iso) {
        double ladoIgual = Math.sqrt(Math.pow(iso.getAltura(), 2)+ Math.pow(iso.getBase()/2, 2));
        
        double perimetro = ladoIgual*2 + iso.getBase();
        return perimetro;
    }
    
    public void mostrarIso(Triangulo iso[]) {
        double area;
        
        area = calcularArea(iso[0]);
        for (int i = 0; i < 4; i++) {
            
        }
    }

 
    
    
}
