/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Jose Bautista
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        nombre = nombre.toLowerCase();
        pasatiempos(nombre);
    }
    
    public static void ordenar(int val, int val2, int val3){
        
        if (val > val2 && val > val3) {
            if (val2 < val3) {
                System.out.println("Mayor: " + val + " Medio: " + val3 + " Menor: " + val2);
            }
            else {
                System.out.println("Mayor: " + val + " Medio: " + val2 + " Menor: " + val3);
            }
        } 
        else if (val2 > val && val2 > val3) {
            if (val > val3) {
                System.out.println("Mayor: " + val2 + " Medio: " + val + " Menor: " + val3);
            }
            else {
                System.out.println("Mayor: " + val2 + " Medio: " + val3 + " Menor: " + val);
            }
        }
        else if (val3 > val2 && val3 > val) {
            if (val2 > val) {
                System.out.println("Mayor: " + val3 + " Medio: " + val2 + " Menor: " + val);
            }
            else {
                System.out.println("Mayor: " + val3 + " Medio: " + val + " Menor: " + val2);
            }
        }
        
    }
    
    public static void carcel(int edad) {
        if (edad >= 18) {
            System.out.println("Ya puedes ir a la carcel");
        }
        if (edad < 18) {
            System.out.println("No puedes ir a la carcel uffff");
        }
    }
    
    public static void pasatiempos(String nombre) {
        String mensaje = "Su pasatiempo favorito es: ";
        
        switch(nombre) {
            case "jose miguel":
                mensaje += "jugar videojuegos";
                break;
            case "keneth":
                mensaje += "jugar futbol";
                break;
            case "carlos":
                mensaje += "hacer deportes";
                break;
            case "milton":
                mensaje += "escuchar musica";
                break;
            case "roxana":
                mensaje += "jugar basketball";
                break;
            case "roberto":
                mensaje += "dormir";
                break;
            case "jose carlos":
                mensaje += "ver doramas";
                break;
            case "kevin":
                mensaje += "escuchar musica x2";
                break;
            default:
                mensaje += "programar";
        }
        System.out.println(mensaje);
    }
}
