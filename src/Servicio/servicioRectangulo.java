/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioRectangulo {
    
    public Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("ingrese la base y la altura turroooo");
        int base = leer.nextInt();
        int altura = leer.nextInt();
        return new Rectangulo(base, altura);

    }
    
        public int metodoSuperficie(int base, int altura){
        int superficie = base*altura;
        return superficie;   
    }
    
        public int metodoPerimetro(int base, int altura){
        int perimetro = (base+altura)*2;
        return perimetro;
    }
    
        public void dibujoRectangulo(int base, int altura){
            for (int i = 0; i < altura; i++) {
                
                for (int j = 0; j < base; j++) {
                    if(i==0 || i==(altura-1) || j==0 || j==(base-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                        
                }
                System.out.println("");
            }
            
        }
        
        
}
