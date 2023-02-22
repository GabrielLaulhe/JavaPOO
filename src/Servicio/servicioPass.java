/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioPass {

    Scanner leer = new Scanner(System.in);

    public void crearPass(Pass usu) {

        String contra;
        contra = usu.getPass();
        do {
            if (!(contra.length() == 10)) {
                System.out.println("contrasena incorrecta, ingrese una nuevamente de 10 digitos, para el usuario " + usu.getNombre());
                contra = leer.next();
            }
        } while (!(contra.length() == 10));
        usu.setPass(contra);

    }

    public void analizarPass(Pass usu) {
        int conta = 0;
        boolean letraz = false;
        for (int i = 0; i < 10; i++) {
            if (usu.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                letraz = true;
            }
            if (usu.getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                conta++;
            }
        }
        if (letraz && conta > 1) {
            System.out.println("Nivel de contrasena ALTO");
        } else if (letraz) {
            System.out.println("Nivel de contrasena MEDIO");
        } else {
            System.out.println("Nivel de contrasena BAJO");
        }
    }

    public boolean validarPass(Pass usu) {

        String contra1;
        for (int i = 2; i >= 0; i--) {
            System.out.println("Ingrese la Pass");
            contra1 = leer.next();
            if (contra1.equals(usu.getPass())) {
                return true;
            } else {
                System.out.println("contrasena incorrecta, te quedan " + i + " intentos");
            }
        }
        return false;
    }

    public void modificarNombre(Pass usu) {
        System.out.println("Ingrese el nuevo nombre");
        usu.setNombre(leer.next());
    }

    public void modificarDNI(Pass usu) {
        System.out.println("Ingrese el nuevo DNI");
        usu.setDni(leer.nextInt());
    }

    public void modificarPass(Pass usu) {
        System.out.println("Ingrese la nueva contrasena");
        usu.setPass(leer.next());
        crearPass(usu);
        System.out.println("contrasena modificada correctamente");
    }

    public void menu(Pass usu) throws InterruptedException {
        crearPass(usu);
        if (validarPass(usu)) {
            int opc;
            do {
                System.out.println("Ingrese la opcion que desea");
                System.out.println("opcion 1 para modificar su nombre, opcion 2 para modificar su dni");
                System.out.println("opcion 3 para modificar su contrasena u opcion 4 para verificar el nivel de su contrasena");
                System.out.println("opcion 5 para salir");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        modificarNombre(usu);
                        break;
                    case 2:
                        modificarDNI(usu);
                        break;
                    case 3:
                        modificarPass(usu);
                        break;
                    case 4:
                        analizarPass(usu);
                        break;
                    case 5:
                        System.out.println("anda palla bobo!");
                }
                Thread.sleep(1000);
            } while (!(opc == 5));

        } else {
            System.out.println("te quedaste sin intentos");
        }

    }

}
//Thread.sleep(1000)

//public static void esperar(int miliSec) {
//        try {
//            Thread.sleep(miliSec);
//        } catch (InterruptedException ignored) {
//        }
//    }

