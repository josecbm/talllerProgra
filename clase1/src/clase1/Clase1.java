/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author Jose Bautista
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        boolean bandera = false;
        // TODO code application logic here
        
        System.out.println("El resultado de la suma es: " + suma(10,5));
        System.out.println(resta(10,5));
        System.out.println(multiplicacion(10,5));
        System.out.println(division(10,5));
        calculadora(4.5);
        int valor = 1;
        if(!bandera){
            System.out.println("bandera true");
        }else{
            System.out.println("bandera false");
        }
        
    }
    public static void calculadora(Double valor1){
       int datoEntero = 7;
        System.out.println("Estamos en el metodo");
        System.out.println(datoEntero * valor1);
    }
    public static int suma(int valor1, int valor2){
        int resultado = 0;
        resultado = valor1 + valor2;
        
        return resultado;
    }
    public static int resta(int valor1, int valor2){
        int resultado = 0;
        resultado = valor1 - valor2;
        return resultado;
    }
    public static int multiplicacion(int valor1, int valor2){
        int resultado = 0;
        resultado = valor1 * valor2;
        return resultado;
    }
    public static int division(int valor1, int valor2){
        int resultado = 0;
        resultado = valor1 / valor2;
        return resultado;
    }
    
    
}
