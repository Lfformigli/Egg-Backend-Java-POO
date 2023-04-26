package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class servicioCurso {

    Scanner read = new Scanner(System.in);

    public String[] cargarAlumnos() {

        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del " + (i+1) + "º alumno");
            alumnos[i] = read.next();
        }

        return alumnos;
    }

    public Curso crearCurso() {

        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = read.nextLine();

        System.out.println("Ingrese el turno (Mañana/Tarde)");
        String turno = read.nextLine();

        System.out.println("Ingrese las horas por dia");
        int horas = read.nextInt();

        System.out.println("Ingrese la cantidad de dias por semana");
        int dias = read.nextInt();

        System.out.println("Ingrese el precio por hora");
        int precio = read.nextInt();
        System.out.println("------");
        String[] alumnos = cargarAlumnos();

        return new Curso(nombreCurso, horas, dias, turno, precio, alumnos);
    }
    
    public int calcularGananciaSemanal(Curso c1) {
        
        int ganancia=c1.getDiasPorSemana()*c1.getHorasPorDia()*c1.getPrecioHora()*c1.getAlumnos().length;
        
        return ganancia;
    }
    
}
