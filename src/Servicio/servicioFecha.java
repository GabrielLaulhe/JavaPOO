/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioFecha {

    Scanner leer = new Scanner(System.in);

    public void ingresarAnio(Fecha f) {
        System.out.println("ingrese el anio");
        int aa = leer.nextInt();
        if (aa >= 1900 && aa <= 2021) {
            f.setAnio(aa);
        }
    }

    public void ingresarMes(Fecha f) {
        int mm;
        System.out.println("ingrese el mes");
        do {
            mm = leer.nextInt();
            if (mm < 1 || mm > 12) {
                System.out.println("Mes incorrecto, ingresar del 1 al 12");
            } else {
                f.setMes(mm);
            }
        } while (mm < 1 || mm > 12);
    }

    public void cantidadDiasMes(Fecha f) {

        switch (f.getMes()) {
            case 1:
                System.out.println("El mes 1 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 2:
                if (validarBisiesto(f)) {
                    System.out.println("El mes 2 tiene 29 dias");
                    System.out.println("Ingrese el dia");
                    f.setDia(leer.nextInt());

                } else {
                    System.out.println("El mes 2 tiene 28 dias");
                    System.out.println("Ingrese el dia");
                    f.setDia(leer.nextInt());
                    break;
                }
            case 3:
                System.out.println("El mes 3 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 4:
                System.out.println("El mes 4 tiene 30 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 5:
                System.out.println("El mes 5 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 6:
                System.out.println("El mes 6 tiene 30 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 7:
                System.out.println("El mes 7 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 8:
                System.out.println("El mes 8 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 9:
                System.out.println("El mes 9 tiene 30 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 10:
                System.out.println("El mes 10 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 11:
                System.out.println("El mes 11 tiene 30 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
            case 12:
                System.out.println("El mes 12 tiene 31 dias");
                System.out.println("Ingrese el dia");
                f.setDia(leer.nextInt());
                break;
        }

    }

    public boolean validarBisiesto(Fecha f) {

        if (f.getAnio() % 4 == 0) {
            if (!(f.getAnio() % 100 == 0)) {
                return true;
            }
        }
        return false;
    }

    public void diaAnterior(Fecha f) {
        int dd = f.getDia();
        int mm = f.getMes();
        int aa = f.getAnio();

        if (dd > 1) {
            dd = (dd - 1);
        } else if (dd == 1) {
            if (mm > 1) {
                mm = (mm - 1);
                switch (mm) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        dd = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        dd = 30;
                        break;
                    case 2:
                        if (validarBisiesto(f)) {
                            dd = 29;
                        } else {
                            dd = 28;
                        }
                        break;
                    default:
                        break;
                }

            } else if (mm == 1) {
                aa = (aa - 1);
                mm = (12);
                dd = (31);

            }
        }
        System.out.println("La fecha anterior es dia=" + dd + ", mes=" + mm + ", anio=" + aa);
    }

    public void diaPosterior(Fecha f) {
        int d = f.getDia();
        int m = f.getMes();
        int a = f.getAnio();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d > 30) {
                    d = (1);
                    if (m == 12) {
                        m = (1);
                        a = (a + 1);
                    } else {
                        m = (m + 1);
                    }

                } else if (d < 31) {
                    d = (d + 1);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d==30) {
                    d = (1);
                    m = (m + 1);
                } else if (d < 30) {
                    d = (d + 1);
                }
                break;
            case 2:
                if (validarBisiesto(f)) {
                    if (d == 29) {
                        d = (1);
                        m = (m + 1);
                    }
                } else {
                    if (d == 28) {
                        d = (1);
                        m = (m + 1);
                    }
                }
                break;
            default:
                break;

        }
        System.out.println("La fecha posterior es dia=" + d + ", mes=" + m + ", anio=" + a);
    }
}
