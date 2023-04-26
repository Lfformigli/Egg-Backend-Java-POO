package MainsUtilidades;

import Servicios.servicioArray;


public class Ejercicio03 {

    public static void main(String[] args) {
        
    servicioArray svArray = new servicioArray();  
    
    
    double vector1[]=new double[50];
    
    double vector2[]=new double[20];
    
    vector1=svArray.inicializarA(vector1);
    
    svArray.ordenarArray(vector1);
    
    svArray.mostrarArray(vector1);
    
    vector2=svArray.inicializarB(vector2, vector1);
    
    svArray.mostrarArray(vector2);
    
    
    }

}
