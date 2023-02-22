/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioCurso {
   Scanner leer = new Scanner(System.in); 
    
//             método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
//
//             Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
//
//             Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    
    private String[] cargarAlumnos() {
    
    String[] alm = new String[5];
    
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el nombre del alumno " + (i+1));
            alm[i]=leer.next();
        }
        
        return alm;
    
}
    
    
    public void crearCurso(Curso c){
        
//        private String nombreCurso;
//    private int cantidadHorasPorDia;
//    private int cantidadDiasPorSemana;
//    private String turno;
//    private int precioPorHora;
//    private String[] alumnos;
        

        System.out.println("ingrese el nombre del curso");
        c.setNombreCurso(leer.next());
        System.out.println("ingrese la cantidad de horas por dia");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("ingrese la cantidad de dias por semana");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("ingrese si el turno es maniana o tarde");
        c.setTurno(leer.next());
        System.out.println("ingrese el precio del curso por hora");
        c.setPrecioPorHora(leer.nextInt());
        
        c.setAlumnos(cargarAlumnos());
        
    }
    
    public void calcularGananciaSemanal(Curso c){
        
        System.out.println("La ganancia semanal del curso es: " +c.getCantidadHorasPorDia()*c.getCantidadDiasPorSemana()*c.getPrecioPorHora()+ " pesos" );
    }
    
}
