package Parcial1Ejercico3;

public class Jefe extends Persona{

    //atributos
    public double porsentaje;

    //constructor
    public Jefe(String nombre, String apellido, int dni, double sueldoBasico,double porsentaje) {

        super(nombre, apellido, dni, (sueldoBasico)+sueldoBasico*(porsentaje/100) );

    }


    //metodos
    @Override
    public void subirSueldo(double incremento) {

        sueldoBasico += incremento;

    }



}
