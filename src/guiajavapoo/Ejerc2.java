/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Circunferencia;
import Servicio.servicioCircunferencia;

/**
 *
 * @author Asus
 */
public class Ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//       Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:

//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����). el

        servicioCircunferencia sc = new servicioCircunferencia();
        
        Circunferencia C1 = sc.crearCircunferencia();
        
        System.out.println("Tu area es " +sc.metodoArea(C1.getRadio()));
        System.out.println("Tu perimetro es " + sc.metodoPerimetro(C1.getRadio()));
    }
    
}
