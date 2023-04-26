package MainsUtilidades;

import Entidades.Curso;
import Servicios.servicioCurso;

public class Ejercicio06 {

    public static void main(String[] args) {

        servicioCurso svCurso = new servicioCurso();
        Curso c1 = svCurso.crearCurso();
        
        System.out.println(c1.getAlumnos().length);
        
        System.out.println(svCurso.calcularGananciaSemanal(c1));
        
    }

}
