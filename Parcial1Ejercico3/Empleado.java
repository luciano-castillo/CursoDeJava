package Parcial1Ejercico3;

public class Empleado extends Persona{

    //contrusctor
    public Empleado(String nombre, String apellido, int dni, double sueldoBasico) {
        super(nombre, apellido, dni, sueldoBasico);
    }

    //metodos
    @Override
    public void subirSueldo(double incremento) {

        sueldoBasico += incremento;

    }


}
