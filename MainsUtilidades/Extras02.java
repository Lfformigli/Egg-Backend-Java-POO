package MainsUtilidades;

import Entidades.Ahorcado;
import Servicios.servicioAhorcado;
import java.util.Scanner;

public class Extras02 {

    public static void main(String[] args) {

        servicioAhorcado svAhorcado = new servicioAhorcado();
        Ahorcado a1 = svAhorcado.crearJuego();

        svAhorcado.juego(a1);
        
    
    }
}
