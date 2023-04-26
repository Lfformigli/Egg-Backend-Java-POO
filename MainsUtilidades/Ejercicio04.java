package MainsUtilidades;

import Servicios.servicioFecha;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    servicioFecha svFecha = new servicioFecha();
    
    Date fN = svFecha.fechaNacimiento();
    Date fA = svFecha.fechaActual();
    
        System.out.println(fN);
    
        System.out.println(fA);
        
        System.out.println("El usuario tiene o tendra " + svFecha.diferencia(fN, fA) + " años al finalizar este año." );
        
    }

}
