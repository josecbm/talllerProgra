package clase2.clases;

import java.util.Date;

/**
 *
 * @author Jose Bautista
 */
public class pato {
    private String color;
    private String raza;
    private boolean sexo;
    public double peso;
    public String nombre;
    double altura;
    Date fecha;
    
    public pato(String color , String raza , String nombre ){
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;
        
    }
    
    public void migrar(){
        System.out.println("me voy pal norte");
    }
    public void nadar(){
        System.out.println("me voy pal sur hay buenos peces");
    }
    public void caminar(){
        System.out.println("me voy a la chingada");
    }
    public void quakquak(){
        System.out.println("quak quak soy "+ this.nombre);
    }
}
