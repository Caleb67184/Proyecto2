/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_caleb;
import java.util.Scanner;
/**
 *
 * @author Caleb
 */
public class Menu {

    int opcion = 0, opcion2 = 0;
    int size, size2, size3, size4 = 0;
    Scanner obj = new Scanner(System.in);
    Colas Cola = new Colas();
    Colas Cajero1 = new Colas();
    Colas Cajero2 = new Colas();
    Colas Cajero3 = new Colas();
    Colas Cajero4 = new Colas();

    public void verMenu() {
        do {
            System.out.println("**** ¿Qué desea hacer? ****");
            System.out.println("1- Ingresar persona");
            System.out.println("2- Atender persona");
            System.out.println("3- Salir");
            System.out.println("Digite la opción: ");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    subMenuCajeros();
                    break;
                case 2:
                    subMenuCajeros();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        } while (opcion != 3);
    }

        
      public void subMenuCajeros() {
        do {
            System.out.println("**** Escoja un cajero ****");
            System.out.println("1- Cajero 1" + "(" + size + ") personas");
            System.out.println("2- Cajero 2" + "(" + size2 + ") personas");
            System.out.println("3- Cajero 3" + "(" + size3 + ") personas");
            System.out.println("4- Cajero 4" + "(" + size4 + ") personas");
            System.out.println("5- Atrás");
            System.out.println("Digite la opción: ");
            opcion2 = obj.nextInt();

            switch (opcion2) {
                case 1:
                
                    if (opcion == 1) {
                        if (size <= size2 && size <= size3 && size <= size4 && size < 10) {
                            Cajero1.InsertarCola();
                            size++;
                        } else {
                            System.out.println("Escoja un cajero con menos personas");
                        }
                    } else if(size > 0){
                        Cajero1.Atender();
                        size--;
                    } else {System.out.println("La cola está vacía");}
                    
                    break;
                case 2:
                    if (opcion == 1) {
                        if (size2 <= size && size2 <= size3 && size2 <= size4 && size2 < 10) {
                            Cajero2.InsertarCola();
                            size2++;
                        } else {
                            System.out.println("Escoja un cajero con menos personas");
                        } 
                    } else if(size2 > 0){
                        Cajero2.Atender();
                        size2--;
                    } else {System.out.println("La cola está vacía");}
                    break;
                case 3:
                    if (opcion == 1) {
                        if (size3 <= size && size3 <= size2 && size3 <= size4 && size3 < 10) {
                            Cajero3.InsertarCola();
                            size3++;
                        } else {
                            System.out.println("Escoja un cajero con menos personas");
                        }
                    } else if(size3 > 0){
                        Cajero3.Atender();
                        size3--;
                    } else {System.out.println("La cola está vacía");}
                    break;
                case 4:
                    if (opcion == 1) {
                        if (size4 <= size && size4 <= size2 && size4 <= size3 && size4 < 10) {
                            Cajero4.InsertarCola();
                            size4++;
                        } else {
                            System.out.println("Escoja un cajero con menos personas");
                        }
                    } else if(size4 > 0){
                        Cajero4.Atender();
                        size4--;
                    } else {System.out.println("La cola está vacía");}
                    break;
                case 5:
                    verMenu();
                    break;
            }
        } while (opcion2 != 5);

    }
}

