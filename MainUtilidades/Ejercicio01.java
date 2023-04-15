package MainUtilidades;

import Entidades.Cadena;
import Servicios.servicioCadena;

public class Ejercicio01 {

    public static void main(String[] args) {
    
    servicioCadena svCadena = new servicioCadena();
    Cadena c1 = svCadena.crearCadena();
    
    
        System.out.println(svCadena.mostrarVocales(c1));       
        System.out.println(svCadena.invertirFrase(c1));
        System.out.println(svCadena.vecesRepetido(c1));
        System.out.println(svCadena.unirFrases(c1));
        System.out.println(svCadena.compararLongitud(c1));
        System.out.println(svCadena.reemplazar(c1));
        System.out.println(svCadena.contiene(c1));
    

    }

}
