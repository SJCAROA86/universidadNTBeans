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
public class Facultad {

    private ArrayList<Estudio> estudios = new ArrayList<>();
    private String direccion;
    private String ciudad;

    public void anadirEstudio(Estudio e) {
        this.estudios.add(e);
    }

    public Facultad(String direccion, String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Facultad() {
    }

    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void mostrar() {
        System.out.println(this.ciudad);
        System.out.println(this.direccion);
        System.out.println(this.estudios);

    }
}
