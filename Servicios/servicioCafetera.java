package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class servicioCafetera {

    Cafetera c1 = new Cafetera();
    Scanner read = new Scanner(System.in);

    public Cafetera crearCafetera() {
        return c1;
    }

    public void llenarCafetera(Cafetera CafeA) {
        CafeA.setCantidadActual(1000);
        System.out.println("La cafetera se ha llenado completamente");
    }

    public void servirTaza(Cafetera CafeA) {
        System.out.println("Ingrese el tamaño de la taza");

        int taza = read.nextInt();

        if (taza < CafeA.getCantidadActual()) {
            System.out.println("Taza servida");
            CafeA.setCantidadActual(CafeA.getCantidadActual() - taza);
        } else if (taza > CafeA.getCantidadActual()) {

            System.out.println("Cafe insuficiente para llenar la taza, se agregaron solo " + CafeA.getCantidadActual());

            CafeA.setCantidadActual(0);

        }

        System.out.println("Cafe actual: " + CafeA.getCantidadActual());

    }

    public void vaciarCafetera(Cafetera CafeA) {
        CafeA.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera");
    }

    public void agregarCafe(Cafetera CafeA) {

        System.out.println("Cuanto cafe desea añadir");

        int CafeExtra = read.nextInt();

        if (CafeA.getCantidadActual() + CafeExtra > 1000) {
            System.out.println("No es posible agregar esa cantidad, supera el limite.");
        } else {
            CafeA.setCantidadActual(CafeA.getCantidadActual()+CafeExtra);    
        }

        System.out.println("Cantidad Actual: " + CafeA.getCantidadActual());
    }

    public void mostrarCantidad(Cafetera CafeA) {
        System.out.println("La cantidad de cafe actual es: " + CafeA.getCantidadActual());
    }

}
