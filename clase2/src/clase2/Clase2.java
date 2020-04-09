/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import clase2.clases.pato;
import java.util.Scanner;

/**
 *
 * @author Jose Bautista
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pato donald = new pato("blanco", "disney", "Donald");
        donald.caminar();
        donald.nadar();
        donald.quakquak();
        
        
    }
    public static double porcentaje(double cantidad){
        double respuesta=0;
        double porcentaje = 0.10;
        System.out.println("repuesta = cantidad["+cantidad+"] + (cantidad["+cantidad+"]*porcentaje["+porcentaje+"]");
        respuesta = cantidad + (cantidad*porcentaje);
        return respuesta;
    }
   
    
}
