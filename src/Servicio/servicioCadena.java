/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    

    public void crearFrase(Cadena f1) {
        System.out.println("Ingrese una frase");
        f1.setFrase(leer.nextLine());
        f1.setLongitud(f1.getFrase().length());
    }

    public void mostrarVocales(Cadena f1) {
        int cont1 = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (f1.getFrase().charAt(i) == 'a' || f1.getFrase().charAt(i) == 'e' || f1.getFrase().charAt(i) == 'i' || f1.getFrase().charAt(i) == 'o' || f1.getFrase().charAt(i) == 'u') {
                cont1++;
            }
        }
        System.out.println("La frase tiene " + cont1 + " vocal/es");
        // f1.getFrase().substring(i, i+1).toLowerCase().equals("a");
    }

    public void invertirFrase(Cadena f1) {
        String cadenaInvertida = "";
        for (int i = f1.getLongitud() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + f1.getFrase().charAt(i);
            
        }
        f1.setFrase(cadenaInvertida);
        System.out.println(cadenaInvertida);
    }

    public int vecesRepetido(Cadena f1, String caracter) {
        int cont2 = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (f1.getFrase().substring(i, i+1).equals(caracter)) {
                cont2++;

            }
        }
        return cont2;
    }

    public void compararLongitud(Cadena f1) {

        System.out.println("Ingrese una frase para comparar su longitud con la frase ingresada inicialmente");
        String frase1 = leer.next();
        
        if (f1.getLongitud() == frase1.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else if (f1.getLongitud() > frase1.length()) {
            System.out.println("La longitud de la primera frase es mayor");
        } else {
            System.out.println("La longitud de la ultima frase ingresada es mayor que la primera");
        }
    }

    public void unirFrases(Cadena f1, String frase2) {
        
        
        System.out.println("La nueva frase queda de la siguiente manera");
        f1.setFrase(f1.getFrase().concat(" "+ frase2));
        f1.setLongitud(f1.getFrase().length());
        System.out.println(f1.getFrase());
    }

    public void reemplazar(Cadena f1) {
        System.out.println("ingrese la letra que va a reemplazar");
        char letra = leer.next().charAt(0);

        System.out.println("Ahora ingrese por que caracter lo desea reemplazar");
        char car = leer.next().charAt(0);
        String frase3;
        frase3 = f1.getFrase().replace(letra, car);
        f1.setFrase(frase3);
        System.out.println(f1.getFrase());
    }

    public boolean contieneLetra(Cadena f1) {
        System.out.println("Ingrese una letra");
        String letra1 = leer.next();
        
        return f1.getFrase().contains(letra1);
        
            }
        }
     
    


        
    

    
    
    

