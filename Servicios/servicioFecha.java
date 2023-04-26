
package Servicios;

import java.util.Date;
import java.util.Scanner;


public class servicioFecha {
    
    Scanner read = new Scanner(System.in);
    
    public Date fechaNacimiento() {
        
        int dia,mes,año;
        
        System.out.println("Ingrese su dia de nacimiento");
        dia=read.nextInt();
        
        System.out.println("Ingrese el mes");
        mes=read.nextInt();
        
        System.out.println("Ingrese el año");
        año=read.nextInt();
        
        Date fecha = new Date(año, mes, dia);
        
        return fecha;
    }
    
    public Date fechaActual() {
        
        Date fecha = new Date();
        
        return fecha;
        
    }
    
    public int diferencia (Date f1, Date f2) {
        
        int Edad=f2.getYear()-f1.getYear();
        
        return Edad;
    }
}
