package MainsNormales;

import Entidades.Libro;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        
    Libro libro1 = new Libro();
    
        System.out.println("Ingrese el nombre del libro");
    
    libro1.Titulo=read.next();
    
        System.out.println("Autor");
    
    libro1.Autor=read.next();
    
        System.out.println("ISBN");
        
    libro1.ISBN=read.nextLong();

        System.out.println("Ingrese la cantidad de paginas");    
    libro1.Paginas=read.nextInt();
    
    
    
    }

}
