package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class servicioAhorcado {

    Scanner read = new Scanner(System.in);

//    CREAR JUEGO
    public Ahorcado crearJuego() {

        String p1;

        int intentos;

        System.out.println("Ingrese la palabra");
        p1 = read.next();

        String[] palabra = new String[p1.length()];

        for (int i = 0; i < p1.length(); i++) {

            String letra = p1.substring(i, i + 1);
            palabra[i] = letra;

        }

        System.out.println("Ingrese la cantidad de intentos");
        intentos = read.nextInt();

        return new Ahorcado(palabra, intentos);
    }

//    LONGITUD
    public static int longitud(Ahorcado a1) {

        return a1.getPalabra().length;
    }

//    BUSCAR LETRA EN EL ARRAY
    public static boolean buscar(Ahorcado a1, String letra) {

        boolean info = false;

        String[] p1 = a1.getPalabra();

        for (int i = 0; i < a1.getPalabra().length; i++) {

            if (p1[i].equals(letra)) {
                info = true;
            }
        }

        return info;
    }

//    IMPRIME LETRAS CANTIDAD DE LETRAS ENCONTRADAS
    public static void encontradas(Ahorcado a1) {

        System.out.println("Cantidad de letras encontradas: " + a1.getLetrasEncontradas());

        System.out.println("Letras faltantes: " + (longitud(a1) - a1.getLetrasEncontradas()));

    }

//    DEVUELVE INTENTOS
    public static int intentos(Ahorcado a1) {
        return a1.getIntentos();
    }

//    JUEGO
    public void juego(Ahorcado a1) {

        String[] palabra2 = new String[longitud(a1)];
        String[] palabra1 = a1.getPalabra();

        for (int i = 0; i < longitud(a1); i++) {
            palabra2[i] = "_";
        }

        do {

            System.out.println("Ingrese una letra");
            String letra = read.next();

            if (!buscar(a1, letra)) {
                System.out.println("Letra no encontrada");
                a1.setIntentos(a1.getIntentos() - 1);
            } else {
                System.out.println("La letra se encuentra en la palabra");
            }

            int pos;

            for (int i = 0; i < longitud(a1); i++) {
                if (palabra1[i].equals(letra)) {
                    pos = i;
                    palabra2[pos] = letra;
                    a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
                }

                System.out.print(palabra2[i]);
            }

            for (int i = 0; i < longitud(a1); i++) {

            }

            System.out.println("");
            System.out.println("--------");

            encontradas(a1);

            System.out.println("Le quedan " + intentos(a1) + " intentos.");

        } while (intentos(a1) > 0 && (a1.getLetrasEncontradas() < longitud(a1)));

    }

}
