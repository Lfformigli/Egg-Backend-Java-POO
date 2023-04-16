package MainsNormales;

import Entidades.Circulo;

public class Ejercicio02 {
    
    
    public static void main(String[] args) {
        
       Circulo circ1 = new Circulo();
       
       circ1.crearCirculo();
       
        System.out.println("El area del circulo es: " + circ1.areaCirculo(circ1.getRadio()) );
        
        System.out.println("El perimetro del circulo es: " + circ1.perimCirculo(circ1.getRadio()));
        
    }
   
}
