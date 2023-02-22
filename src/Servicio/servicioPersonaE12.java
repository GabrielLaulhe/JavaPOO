/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.PersonaE12;
import java.time.LocalDate;
import java.time.Period;


import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class servicioPersonaE12 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(PersonaE12 p1) {

//        try {
//            System.out.println("Ingrese el nombre de la persona");
//            p1.setNombre(leer.next());
//            System.out.println("Ingrese su fecha de nacimiento formato DD/MM/YYYY");
//            String fecha = leer.next();
//            
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            
//            p1.setFechaNacimiento(sdf.parse(fecha));
//            System.out.println(p1.getFechaNacimiento());
//        } 
//        
//        
//        catch (ParseException ex) {
//            Logger.getLogger(servicioPersonaE12.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        } 
        

        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la fecha de nacimiento, dia, mes y anio");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        p1.setFechaNacimiento(fecha);

        System.out.println(p1.getFechaNacimiento());
    }

    public void calcularEdad(PersonaE12 p1) {
        
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        
        Period periodo = Period.between(p1.getFechaNacimiento(), hoy);
        System.out.println(periodo);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",periodo.getYears(), periodo.getMonths(), periodo.getDays());
        
    }
    
    public boolean menorQue(PersonaE12 p1, int edad){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(p1.getFechaNacimiento(), hoy);
        
        return (periodo.getYears()<edad);
        
            
        }
    
    public void mostrarPersona(PersonaE12 p1, int edad, String nombre1){
        
        System.out.println("Su nombre es "+nombre1+ " su edad "+edad);
        
    }
       
    }


        
     
        
                
        
       
           
        
    


    

