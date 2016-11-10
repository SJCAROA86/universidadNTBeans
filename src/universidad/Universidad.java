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
public class Universidad {

    static ArrayList<Facultad> facultades = new ArrayList<>();

    public static void rellenarDatos() {
        Facultad fa;
        Estudio est;
        Alumno al;

        for (int i = 0; i < 5; i++) {
            fa = new Facultad("Av Batalla del Ebro" + i, "BADAJOZ");

            for (int j = 0; j < 5; j++) {
                est = new MPostgrado("GRADO", "BIOLOGÍA" + j, "COD 112" + j);

                for (int z = 0; z < 10; z++) {
                    al = new Becario("GENÉTICA", "SERGIO" + " " + z + " ", 30 + z);
                    est.anadirAlumno(al);

                    al = new Intercambio("UNIV: OXFORD", "PAUL" + " " + z + " ", 20 + z);
                    est.anadirAlumno(al);
                }
                fa.anadirEstudio(est);
            }

            for (int j = 0; j < 5; j++) {
                est = new MNoOficial("BACHILLERATO" + j, "CIENCIAS" + j, "COD 556" + j);

                for (int z = 0; z < 10; z++) {
                    al = new Becario("AMBIENTALES", "SUSANA" + " " + z + " ", 25 + z);
                    est.anadirAlumno(al);

                    al = new Intercambio("UNIV: YALE", "HILLARY" + " " + z + " ", 23 + z);
                    est.anadirAlumno(al);
                }
                fa.anadirEstudio(est);
            }
            facultades.add(fa);
        }
    }

    public static void mostrarTodo() {
        for (Facultad facultad : facultades) {
            System.out.println(facultad.getCiudad());
            System.out.println(facultad.getDireccion());

            for (Estudio estudio : facultad.getEstudios()) {
                System.out.println(estudio.getCodigo());

                for (Alumno alumno : estudio.getAlumnos()) {
                    System.out.println(alumno.getNombre());
                    System.out.println(alumno.getEdad());
                }
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodo();

    }

}
