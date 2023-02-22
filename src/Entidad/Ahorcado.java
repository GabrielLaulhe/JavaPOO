/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Asus
 */
public class Ahorcado {
    
    
    private String[] palabra;
    private int encontrada;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontrada, int jugadasMax) {
        this.palabra = palabra;
        this.encontrada = encontrada;
        this.jugadasMax = jugadasMax;
    }

 

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontrada() {
        return encontrada;
    }

    public void setEncontrada(int encontrada) {
        this.encontrada = encontrada;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
    
}
