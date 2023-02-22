/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavapoo;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class Ejerc10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creacion de los vectores o arreglos
        double[] A = new double[50];
        
        double[] B = new double[20];
        
        
        
        // llenado del arreglo A con valores aleatorios
        for (int i = 0; i < 50; i++) {
            double num = Math.random()*100;
            A[i] = (int)num;
        }
        
        //muestra por pantalla del arreglo A
        System.out.print(Arrays.toString(A));
        
        System.out.println(" ");
        
        // ordenado del arreglo A de menor a mayor
        Arrays.sort(A);
        System.out.print(Arrays.toString(A));
        
        System.out.println(" ");
        
        // llenado del vector B, los primeros 10 con el vector A ordenado y los ultimos 10 con 0.5.
        
        // ACLARACION = NO SE PUEDE PONER DENTRO DEL FOR ARRAYS.FILL(B, 0, 10, A[i]) PORQUE LA FUNCION VA A TOMAR EL ULTIMO VALOR DEL VECTOR A Y ES EL QUE VA A ASIGNAR A TODOS LOS ELEMENTOS DEL VECTOR.
        // ES DECIR DE LA POSICION 0 A LA POSICION 9 DEL VECTOR B VAN A SER TODOS DEL MISMO NUMERO Y EL NUMERO VA A SER EL DE LA POSICION 9 DEL VECTOR A.
        // SI EN LA POSICION 9 DEL VECTOR A EL VALOR ES 6, EL VECTOR B SE VA A LLENAR EN SUS 10 PRIMEROS LUGARES CON EL VALOR 6.
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                B[i] = A[i];
            }
            Arrays.fill(B, 10, 20, 0.5);
        }
        
        // muestra por pantalla
        System.out.println(Arrays.toString(B));
    }
    
}
