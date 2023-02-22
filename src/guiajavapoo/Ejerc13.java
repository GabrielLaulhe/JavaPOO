/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import Entidad.Curso;
import Servicio.servicioCurso;

/**
 *
 * @author Asus
 */
public class Ejerc13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioCurso serv = new servicioCurso();
        
        Curso c = new Curso();
        
        serv.crearCurso(c);
        serv.calcularGananciaSemanal(c);
        
        
    }
    
}
