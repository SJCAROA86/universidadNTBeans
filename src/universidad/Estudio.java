/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Estudio {

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    private String codigo;

    public void anadirAlumno(Alumno a) {
        this.alumnos.add(a);
    }

    public Estudio(String codigo) {
        this.codigo = codigo;
    }

    public Estudio() {
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrar() {
        System.out.println(this.codigo);
        System.out.println(this.alumnos);
    }

}
