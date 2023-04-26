
package Entidades;

import java.util.Arrays;


public class Curso {
    
    private String nombreCurso;
    private int horasPorDia;
    private int diasPorSemana;
    private String turno;
    private int precioHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasPorDia, int diasPorSemana, String turno, int precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.horasPorDia = horasPorDia;
        this.diasPorSemana = diasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos= alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(int horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    public int getDiasPorSemana() {
        return diasPorSemana;
    }

    public void setDiasPorSemana(int diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", horasPorDia=" + horasPorDia + ", diasPorSemana=" + diasPorSemana + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
}
