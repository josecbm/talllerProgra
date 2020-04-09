/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Jose Bautista
 */
public class Punto {
    public int x;
    public int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void mostrar() {
        System.out.println(this.x + " ," + this.y);
    }
    
    public double distancia(Punto punto) {
        double resultado = 0;
        double x1 = (double)punto.x;
        double y1 = (double)punto.y;
        double x2 = (double)this.x;
        double y2 = (double)this.y;
        resultado = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return resultado;
    }
    
}
