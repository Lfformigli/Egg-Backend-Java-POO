
package Servicios;

import Entidades.parDeNumeros;

public class servicioParDeNumeros {
        
    public void mostrarValores(parDeNumeros par) {
        System.out.println("El numero 1 es: " + par.getNum1());
        System.out.println("El numero 2 es: " + par.getNum2());
    }
    
    public int devolverMayor(parDeNumeros par) {        
        return Math.max(par.getNum1(), par.getNum2());
    }
    
    public int devolverMenor(parDeNumeros par) {
        return Math.min(par.getNum1(), par.getNum2());
    }
    
    public int calcularPotencia(parDeNumeros par) {
        
        double may=Math.max(par.getNum1(), par.getNum2());
        double min=Math.min(par.getNum1(), par.getNum2());
        
        double potencia=Math.pow(may, min);
        
        return (int)potencia;
    }
    
    public double calcularRaiz(parDeNumeros par) {
        
        return Math.sqrt(Math.min(par.getNum1(), par.getNum2()));
    }
    
    
}
