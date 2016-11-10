/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author usuario
 */
public class Becario extends Alumno {

    private String departamento;

    public Becario(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public Becario() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(this.departamento);
    }
}
