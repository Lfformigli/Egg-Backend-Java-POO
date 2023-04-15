package MainServices;

import Entidades.NIF;
import Servicios.servicioNIF;

public class Extra02 {

    public static void main(String[] args) {
    
    servicioNIF svNIF = new servicioNIF();
    NIF nifA = svNIF.crearNIF();
    
    svNIF.mostrar(nifA);

    }

}
