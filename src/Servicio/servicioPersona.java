/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class servicioPersona {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje

//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.

//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
    
    
    
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        
        System.out.println("Ingrese su edad");
        persona.setEdad(leer.nextInt());
        
        do {
            System.out.println("Ingrese su sexo (H, M o O)");
            persona.setSexo(leer.next());
        } while (!(persona.getSexo().equals("H")) && (!persona.getSexo().equals("M")) && (!persona.getSexo().equals("O")));
        
        
        System.out.println("Ingrese su Peso");
        persona.setPeso(leer.nextInt());
        
        System.out.println("Ingrese su Altura");
        persona.setAltura(leer.nextDouble());
        return persona;
    }
    
    public int calcularIMC(Persona persona) {

        if (persona.getPeso() / (persona.getAltura() * persona.getAltura()) < (20)) {

            System.out.println("Estas por debajo de tu peso ideal");
            return -1;

        } else if (persona.getPeso() / (persona.getAltura() * persona.getAltura()) >= (20) && persona.getPeso() / (persona.getAltura() * persona.getAltura()) <= (25)) {
            System.out.println("Estas en tu peso ideal");
            return 0;
        } else {
            System.out.println("Tienes sobrepeso");
            return 1;

        }

    }
 
    public boolean esMayorDeEdad(Persona persona){
        
        if(persona.getEdad() >= 18){
            System.out.println("Usted es mayor de edad");
            return true;
        }else{
            System.out.println("Usted es menor de edad");
            return false;
        }
        
    }





    
    }
    

