
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class servicioNIF {

    NIF nif = new NIF();
    Scanner read = new Scanner(System.in);
    
    char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public NIF crearNIF(){
        
        System.out.println("Ingrese su dni");    
        
        nif.setDni(read.nextLong());
        
        int digito = (int) nif.getDni()%23;
                
        nif.setLetra(letra[digito]);
        
        return nif;
    }
    
    public void mostrar(NIF nif1) {
        
        System.out.println("NIF: " + nif1.getDni()+"-"+nif1.getLetra() );
                
    }
    
    
}
