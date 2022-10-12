package Practica1ºParcial;

public class Profesor extends Persona{


    //Constructor
    public Profesor (String nombre, String apellido,String legajo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.legajo= Integer.parseInt(legajo);

    }

    //metodos

    @Override
    public void modificarDatos(String nombre, String apellido, int legajo) {

        this.nombre=nombre;
        this.apellido=apellido;
        this.legajo=legajo;

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
