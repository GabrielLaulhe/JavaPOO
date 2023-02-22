/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Asus
 */
public class servicioMatematica {
    
    public void crearValores(Matematica op){
        
        op.setNum1(Math.random()*10);
        op.setNum2(Math.random()*10);
       
        
        System.out.println("El primer numero es " +op.getNum1());
        System.out.println("El segundo numero es " +op.getNum2());
    }
    
    public void devolverMayor(Matematica op){
        if (op.getNum1()>op.getNum2()) {
            System.out.println("El primer numero es mayor al segundo");
        }else{
            System.out.println("El segundo numero es mayor al primero");
            
            // max(op.getNum1(), op.getNum2()  -- es una clase que devuelve el mayor
        }
        
    }
    
    
    public int calcularPotencia(Matematica op){
        return (int) (Math.pow(op.getNum1(), op.getNum2()));
    }    
    
    
    public void calcularRaiz(Matematica op){
        
        if (op.getNum1()<op.getNum2()) {
            int raiz = (int) Math.sqrt(op.getNum1());
            System.out.println("El menor numero es " +op.getNum1()+" y la raiz es "+ raiz);
        }else{
            int raiz = (int) Math.sqrt(op.getNum2());
            System.out.println("El menor numero es " +op.getNum2()+" y la raiz es "+ raiz);
        }
        
        
    }
}
