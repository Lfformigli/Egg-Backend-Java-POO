package MainsServicios;

import Entidades.CuentaBancaria;
import Servicios.servicioCuentaBancaria;
import java.util.Scanner;

/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes 
atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor
vacío, con parámetros, getters y setters.

Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
 Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        servicioCuentaBancaria svBanco = new servicioCuentaBancaria();

        CuentaBancaria cuenta = svBanco.crearCuenta();

        boolean salida = false;
        int opc;

        System.out.println("MENU");
        System.out.println("1-Ingresar");
        System.out.println("2-Extraer");
        System.out.println("3-Extraccion Rapida");
        System.out.println("4-Consultar Saldo");
        System.out.println("5-Consultar Datos");
        System.out.println("6-salir");
        System.out.println("Opcion");

        opc = read.nextInt();

        do {

            switch (opc) {
                case 1:
                    System.out.println("Cuanto desea ingresar?");
                    svBanco.ingresar(read.nextDouble());
                    break;
                case 2:
                    System.out.println("Cuanto desea extraer?");
                    svBanco.retirar(read.nextDouble());
                    break;
                case 3:
                    double extMax = cuenta.getSaldoActual() * 0.20;

                    System.out.println("Ud puede retirar como maximo: " + extMax);
                    System.out.println("Cuanto desea retirar?");
                    double ext = read.nextDouble();

                    if (ext < extMax) {
                        svBanco.extraccionRapida(ext);
                    } else {
                        System.out.println("Extraccion incorrecta");
                    }

                    break;
                case 4:
                    svBanco.consultarSaldo();
                    break;
                case 5:
                    svBanco.consultarDatos();
                    break;
                case 6:
                    System.out.println("Desea salir? (Y/N)");

                    if ("Y".equalsIgnoreCase(read.next())) {
                        salida = true;
                    }

                    break;
            }
            
            
            if (!salida) {
            System.out.println("MENU");
            System.out.println("1-Ingresar");
            System.out.println("2-Extraer");
            System.out.println("3-Extraccion Rapida");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar Datos");
            System.out.println("6-salir");
            System.out.println("Opcion");
            opc=read.nextInt();
            }

        } while (!salida);

    }

}
