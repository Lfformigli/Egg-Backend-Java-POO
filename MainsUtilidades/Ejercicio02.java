package MainsUtilidades;

import Entidades.parDeNumeros;
import Servicios.servicioParDeNumeros;

public class Ejercicio02 {

    public static void main(String[] args) {

        parDeNumeros par1 = new parDeNumeros();
        servicioParDeNumeros svPar = new servicioParDeNumeros();

        svPar.mostrarValores(par1);

        System.out.println("El numero mayor es: " + svPar.devolverMayor(par1));

        System.out.println("El numero menor es: " + svPar.devolverMenor(par1));

        System.out.println("La potencia del mayo elevado al menor es: " + svPar.calcularPotencia(par1));

        System.out.println("La raiz del menor es: " + svPar.calcularRaiz(par1));

    }

}
