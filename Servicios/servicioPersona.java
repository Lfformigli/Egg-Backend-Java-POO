package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class servicioPersona {

    Scanner read = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();

        System.out.println("Ingrese el nombre");
        p1.setNombre(read.next());

        System.out.println("Ingrese la edad");
        p1.setEdad(read.nextInt());

        String sexo;

        do {

            System.out.println("Ingrese el sexo (H/M/O)");
            sexo = read.next();

            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {
                p1.setSexo(sexo);
            } else {
                System.out.println("Ingreso incorrecto");
            }

        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equals("O"));

        System.out.println("Ingrese el peso (kg)");
        p1.setPeso(read.nextDouble());

        System.out.println("Ingrese la altura (cm)");
        p1.setAltura(read.nextDouble());

        return p1;
    }

    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int calcularIMC(Persona p) {

        double IMC = p.getPeso() / Math.pow(p.getAltura(), 2);


        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC < 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public void promedioIMC(int IMC[]) {
        
        int cont0=0;
        int cont1=0;
        int cont2=0;
        
        
        for (int i = 0; i < 4; i++) {
            
            switch (IMC[i]) {
                case -1:
                    cont0++;
                    break;
                case 0:
                    cont1++;
                    break;
                case 1:
                    cont2++;
                    break;
            }
        }
        
        System.out.println("El porcentaje de personas con bajo peso es: " + cont0*100/4);
        System.out.println("El porcentaje de personas con peso ideal es: " + cont1*100/4);
        System.out.println("El porcentaje de personas con sobrepeso es: " + cont2*100/4);
        
    }
}
