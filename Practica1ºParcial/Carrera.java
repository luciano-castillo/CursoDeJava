package Practica1ºParcial;

import java.util.Iterator;
import java.util.LinkedList;

public class Carrera {

    //atributos

    private String nombre;
    LinkedList<Materia> coleccionMaterias = new LinkedList<>();

    //contructor

    public Carrera (String nombre){
        this.nombre=nombre;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    //Metodos

    public void agregarMateria(Materia materia){

        coleccionMaterias.add(materia);

    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    public void eliminarmateria(String nombre){

        coleccionMaterias.removeIf(materia -> materia.getNombre() == nombre);

    }


}
