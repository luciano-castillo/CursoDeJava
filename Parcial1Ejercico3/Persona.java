package Parcial1Ejercico3;

public abstract class Persona {

    //atributos
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected double sueldoBasico;

    public Persona(String nombre,String apellido,int dni,double sueldoBasico){

        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.sueldoBasico=sueldoBasico;

    }

    //getters and setters
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    //Metodos

    public void modificarDatos(String nombre,String apellido,int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;

    }

    public abstract void subirSueldo(double incremento);


}
