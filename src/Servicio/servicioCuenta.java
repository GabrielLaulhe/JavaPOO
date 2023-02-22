/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioCuenta {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

// Punto C
   // Creamos la cuenta y le damos los valores a los atributos. El objeto se va a llamar cuenta, de la clase Cuenta.
    public void crearCuenta(Cuenta cuenta){
        System.out.println("Por favor ingrese numero de cuenta, DNI y saldo actual");
        cuenta.setNumeroCuenta(leer.nextInt());
        cuenta.setDNI(leer.nextLong());
        cuenta.setSaldoActual(leer.nextInt());
    }
        // Punto D
        // Creamos el metodo ingresar que le pasamos el objeto cuenta.
    public void ingresar(Cuenta cuenta){
        
        System.out.println("Ingrese la cantidad de dinero que desea agregar");
        int ingreso = leer.nextInt();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }
    
    public void retirar(Cuenta cuenta) {

        System.out.println("Ingrese la cantidad que desea retirar");
        int retiro = leer.nextInt();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("Solo podra retirar el monto de su saldo " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
            System.out.println("Ahora su saldo acutal es " + cuenta.getSaldoActual());
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Usted retira " + retiro + " y el saldo de su cuenta es " + cuenta.getSaldoActual());
        }
        
    }
    
    public void extraccionRapida(Cuenta cuenta){
        System.out.println("Desea realizar una extraccion rapida, ingrese s/n");
        String respuesta = leer.next();
       
        if("s".equals(respuesta)){
            cuenta.setSaldoActual((int)(cuenta.getSaldoActual()*0.8));
        }
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo actual es "+ cuenta.getSaldoActual());
    }
        
    public void consultarDatos(Cuenta cuenta){
        System.out.println("Cuenta "+ cuenta.getNumeroCuenta()+ " DNI "+ cuenta.getDNI() + " Saldo "+ cuenta.getSaldoActual());
    }
    }
    
    
    

