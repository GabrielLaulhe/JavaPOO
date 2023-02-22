/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioAhorcado {
    
//            Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.
//
//             Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
//
//             Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
//
//             Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
//
//             Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
//
//             Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    
    
    Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado a) {

        System.out.println("Ingrese la palabra");
        String pal = leer.next();

        System.out.println("Ingrese la cantidad de jugadas maximas");
        a.setJugadasMax(leer.nextInt());

        String[] palabra = new String[pal.length()];

        for (int i = 0; i < pal.length(); i++) {
            palabra[i] = pal.substring(i, i + 1);
        }
        a.setPalabra(palabra);
        a.setEncontrada(0);
        
    }

    public int longitud(Ahorcado a) {
        return a.getPalabra().length;

    }

    public int buscar(Ahorcado a, String letra) {
        
        int cont1=0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a.getPalabra()[i])) {
                cont1++;    
            }
        }
        return cont1;
    }
    

    public boolean encontradas(Ahorcado a, String letra) {
        boolean letraEncontrada = false;
        if (buscar(a,letra)>0) {
            letraEncontrada=true;
           a.setEncontrada(a.getEncontrada()+buscar(a, letra));
            System.out.println("La letra se encuentra en la palabra");
        }else {
            a.setJugadasMax(a.getJugadasMax()-1);
            System.out.println("La letra no se encuentra en la palabra");
        }
        return letraEncontrada;

    }

    public int intentos(Ahorcado a) {
        return a.getJugadasMax();

    }

    public void juego(Ahorcado a) {
        crearJuego(a);
        System.out.println("el tamanio de la palabra es "+ longitud(a));
        System.out.println("Tiene "+ a.getJugadasMax()+ " intentos");
        
        do {
            System.out.println("Ingrese una letra");
            String letra=leer.next();
            // buscar(a, letra);
            encontradas(a, letra);
            System.out.println("Número de letras (encontradas, faltantes): ( " + a.getEncontrada() + " , " + (a.getPalabra().length-a.getEncontrada()) +" )");
            System.out.println("La cantidad de intentos que le queda es " + intentos(a));
        } while (a.getJugadasMax()>0  && a.getEncontrada()<longitud(a));
        
        if (a.getJugadasMax()==0) {
            System.out.println("Perdio el juego");   
        }
        if (a.getEncontrada()==a.getPalabra().length) {
            System.out.println("usted gano el juego");
        }
        
        
        
        
    }
}
