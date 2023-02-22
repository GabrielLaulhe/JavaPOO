/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioMovil {

//     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//      instanciar un objeto Celular y poder cargarlo en nuestro programa.
//    
//     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
//    
    public int[] ingresarCodigo() {

        int[] cod = new int[7];

        for (int i = 0; i < 7; i++) {
            cod[i] = (int) (Math.random() * 10);
        }
        return cod;
    
    }
    
    

    public void cargarCelular(Movil m) {
        Scanner leer = new Scanner(System.in);

//    private String marca;
//    private int precio;
//    private String modelo;
//    private int memoriaRam;
//    private String almacenamiento;
//    private int[] codigo;
        System.out.println("Ingrese la marca");
        m.setMarca(leer.next());
        System.out.println("ingrese precio");
        m.setPrecio(leer.nextInt());
        System.out.println("ingrese modelo");
        m.setModelo(leer.next());
        System.out.println("ingrese la memoriaRam");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("ingrese el almacenamiento");
        m.setAlmacenamiento(leer.next());
        
        m.setCodigo(ingresarCodigo());
        
        
                
    }

}
        
        


