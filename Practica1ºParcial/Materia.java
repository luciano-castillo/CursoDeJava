package Practica1ºParcial;

import java.util.Iterator;
import java.util.LinkedList;

public class Materia {

    //Atrubutos
    private String nombre;
    private Profesor titular;
    LinkedList<Estudiante> coleccionEstudiantes = new LinkedList<>();

    public String getNombre() {
        return nombre;
    }


    //Metodos

    public Materia (String nombre , Profesor titular){

        this.nombre=nombre;
        this.titular=titular;

    }

    public void agrearEstudiante(Estudiante nuevoEstudiante){

        coleccionEstudiantes.add(nuevoEstudiante);

    }

    public void eleminarEstudiante(int legajo){

        coleccionEstudiantes.removeIf(estudiante -> estudiante.equals(legajo));

    }

    public void listarEstudiantes(){

        for (Estudiante estudiante : coleccionEstudiantes) {

            estudiante.toString();

        }

    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
