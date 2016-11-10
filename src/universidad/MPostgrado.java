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
public class MPostgrado extends Master {

    private String estudios_previos;

    public MPostgrado(String estudios_previos, String especialidad, String codigo) {
        super(especialidad, codigo);
        this.estudios_previos = estudios_previos;
    }

    public MPostgrado() {
    }

    public String getEstudios_previos() {
        return estudios_previos;
    }

    public void setEstudios_previos(String estudios_previos) {
        this.estudios_previos = estudios_previos;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(this.estudios_previos);
    }
}
