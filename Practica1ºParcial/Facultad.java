package Practica1ºParcial;

import java.util.Iterator;
import java.util.LinkedList;

public class Facultad {

    //Atributos
    String nombre;
    LinkedList<Carrera> coleccionCarreras = new LinkedList<>();

    //Metodos

    public Facultad (String nombre){
        this.nombre=nombre;
    }

    public void agregarCarrera(Carrera carrera){

        coleccionCarreras.add(carrera);
    }

    public boolean eliminarCarrera(String nombre){

        Iterator<Carrera> carreraIterator = coleccionCarreras.iterator();

        while (carreraIterator.hasNext()){

            Carrera carrera = carreraIterator.next();

            if (carrera.equals(nombre)){

                carreraIterator.remove();

                return true;
            }
        }
        return false;
    }

    public void mostarCarreras(){

        for (Carrera carrera:coleccionCarreras) {

            carrera.toString();

        }

    }

}
