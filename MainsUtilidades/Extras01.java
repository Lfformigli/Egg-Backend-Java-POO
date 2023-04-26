package MainsUtilidades;

import java.util.Scanner;


public class Extras01 {
    
    public static void main(String[] args) {
        
    Scanner read = new Scanner(System.in);
    
    String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    
    String mesSecreto = mes[8];
    String resp;
    
    
    boolean acierto;
    
        do {
            System.out.println("Ingrese el mes secreto");
            resp=read.next();
            
            if (resp.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Respuesta correcta");
                acierto=true;
            }   else {
                System.out.println("Respuesta incorrecta, intente otra vez");
                acierto=false;
            } 
            
        } while (!acierto);
        
    
    
    }

}
