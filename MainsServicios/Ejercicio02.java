package MainsServicios;

import Entidades.Cafetera;
import Servicios.servicioCafetera;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
    boolean salida = false;  
    int opc;
        
    Scanner read = new Scanner(System.in);
    servicioCafetera svCafe = new servicioCafetera();
    Cafetera Cafe1 = svCafe.crearCafetera();
    
        do {
            System.out.println("MENU");
            System.out.println("1-Llenar Cafetera");
            System.out.println("2-Servir Cafe");
            System.out.println("3-Vaciar Cafetera");
            System.out.println("4-Agregar Cafe");
            System.out.println("5-Mostrar Cantidad");
            System.out.println("6-Salir");
            
            opc=read.nextInt();
            
            switch (opc) {
                case 1:
                    svCafe.llenarCafetera(Cafe1);
                    break;
                case 2:
                    svCafe.servirTaza(Cafe1);
                    break;
                case 3:
                    svCafe.vaciarCafetera(Cafe1);
                    break;
                case 4:
                    svCafe.agregarCafe(Cafe1);
                    break;
                case 5:
                    svCafe.mostrarCantidad(Cafe1);
                    break;
                case 6:
                    
                    System.out.println("Desea salir? (Y/N)");
                    
                     if ("Y".equalsIgnoreCase(read.next())) {
                        salida = true;
                    }       
                    
                    break;
            }
            
        } while (!salida);
        
    
    
    
    }

}
