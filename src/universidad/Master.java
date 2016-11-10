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
public class Master extends Estudio {

    private String especialidad;

    public Master(String especialidad, String codigo) {
        super(codigo);
        this.especialidad = especialidad;
    }

    public Master() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(this.especialidad);
    }
}
