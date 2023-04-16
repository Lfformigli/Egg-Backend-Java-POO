package MainsServicios;

import Entidades.Persona;
import Servicios.servicioPersona;

public class Ejercicio03 {

    public static void main(String[] args) {

        servicioPersona svPersona = new servicioPersona();

        //PERSONA 1
        Persona p1 = svPersona.crearPersona();

        if (svPersona.esMayorDeEdad(p1)) {
            System.out.println(p1.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p1.getNombre() + " es menor de edad");
        }
        

        switch (svPersona.calcularIMC(p1)) {
            case -1:
                System.out.println("La persona esta en bajo peso");
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            default:
                System.out.println("La persona esta en sobrepeso");
                break;
        } 

        //PERSONA 2
        Persona p2 = svPersona.crearPersona();

        if (svPersona.esMayorDeEdad(p2)) {
            System.out.println(p2.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p2.getNombre() + " es menor de edad");
        }

        switch (svPersona.calcularIMC(p2)) {
            case -1:
                System.out.println("La persona esta en bajo peso");
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            default:
                System.out.println("La persona esta en sobrepeso");
                break;
        }

        //PERSONA 3
        Persona p3 = svPersona.crearPersona();

        if (svPersona.esMayorDeEdad(p3)) {
            System.out.println(p3.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p3.getNombre() + " es menor de edad");
        }

        switch (svPersona.calcularIMC(p3)) {
            case -1:
                System.out.println("La persona esta en bajo peso");
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            default:
                System.out.println("La persona esta en sobrepeso");
                break;
        }

        //PERSONA 4
        Persona p4 = svPersona.crearPersona();

        if (svPersona.esMayorDeEdad(p4)) {
            System.out.println(p4.getNombre() + " es mayor de edad");
        }else {
            System.out.println(p4.getNombre() + " es menor de edad");
        }

        switch (svPersona.calcularIMC(p4)) {
            case -1:
                System.out.println("La persona esta en bajo peso");
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            default:
                System.out.println("La persona esta en sobrepeso");
                break;
        }

        int[] IMC = {svPersona.calcularIMC(p1),svPersona.calcularIMC(p2),svPersona.calcularIMC(p3),svPersona.calcularIMC(p4)};
        boolean[] Edad = {svPersona.esMayorDeEdad(p1),svPersona.esMayorDeEdad(p2),svPersona.esMayorDeEdad(p3),svPersona.esMayorDeEdad(p4)};
        
        svPersona.promedioIMC(IMC);
        svPersona.promedioEdad(Edad);
        
        
    }   
    
    
    
    
}
