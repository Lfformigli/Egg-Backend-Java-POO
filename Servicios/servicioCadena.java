package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class servicioCadena {

    Scanner read = new Scanner(System.in);

    public Cadena crearCadena() {
        System.out.println("Ingrese la frase");
        Cadena c1 = new Cadena(read.nextLine());
        return c1;
    }

    public int mostrarVocales(Cadena c1) {
        int vocales = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {

            String letra = c1.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        return vocales;
    }

    public String invertirFrase(Cadena c1) {
        String frase2 = "";

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            String letra = c1.getFrase().substring(i, i + 1);
            frase2 = frase2 + letra;
        }

        return frase2;
    }

    public String vecesRepetido(Cadena c1) {

        System.out.println("Ingrese la letra a buscar");
        String letra1 = read.next();
        String letra2, info;
        int cont = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            letra2 = c1.getFrase().substring(i, i + 1);
            if (letra1.equals(letra2)) {
                cont++;
            }
        }
        info = "La frase '" + c1.getFrase() + "' contiene repetido el caracter '" + letra1 + "' " + cont + " veces";
        return info;
    }

    public String compararLongitud(Cadena c1) {
        System.out.println("Ingrese la frase a comparar");
        String frase2 = read.nextLine();

        if (c1.getFrase().equals(frase2)) {
            return "Las frases tienen la misma longitud";
        } else {
            return "Las frases son diferentes";
        }
    }

    public String unirFrases(Cadena c1) {

        System.out.println("Ingrese la frase para unir");
        String frase = read.nextLine();
        return c1.getFrase() + " " + frase;
    }

    public String reemplazar(Cadena c1) {
        System.out.println("Ingrese la letra para realizar el reemplazo");
        String letra = read.next();

        return c1.getFrase().replace("a", letra);
    }

    public boolean contiene(Cadena c1) {
        System.out.println("Ingrese la letra a buscar en la frase");
        String letra = read.next();
        int cont = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            String letra2 = c1.getFrase().substring(i, i + 1);

            if (letra2.equals(letra)) {
                cont++;
            }
        }

        if (cont>0) {
            return true;
        } else {
            return false;
        }

    }
}
