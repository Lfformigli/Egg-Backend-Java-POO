package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class servicioCuentaBancaria {

    Scanner read = new Scanner(System.in);
    CuentaBancaria c1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {

        c1.setNumeroCuenta(2042);

        c1.setDniCliente(42221192);

        c1.setSaldoActual(5000.00);

        return c1;

    }

    public void ingresar(double ingreso) {
        c1.setSaldoActual(c1.getSaldoActual()+ingreso);
    }

    public void retirar(double ingreso) {
        c1.setSaldoActual(c1.getSaldoActual()-ingreso);
    }
    
    public void extraccionRapida(double ingreso) {
        c1.setSaldoActual(c1.getSaldoActual()-ingreso);
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Su numero de cuenta es: " + c1.getNumeroCuenta());
        System.out.println("Su DNI es: " + c1.getDniCliente());
    }
}
