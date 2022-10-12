package Practica1ºParcial;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        boolean salir = false;
        int nrolegajo=0;

        Scanner s = new Scanner(System.in);

        Facultad f1 = new Facultad("UTN");
        Carrera c1 = new Carrera("TUP");
        Carrera c2 = new Carrera("ISI");

        f1.agregarCarrera(c1);
        f1.agregarCarrera(c2);
        f1.mostarCarreras();

        Profesor p1 = new Profesor("Facundo","Uferer","9999");

        Materia m1 = new Materia("Laboratorio",p1);

        c1.agregarMateria(m1);

        System.out.println(m1.toString());

        Estudiante a1 = new Estudiante("Lucio","castillo",27133);

        m1.agrearEstudiante(a1);

        do {
            System.out.println("Ingrese legajo");

            try {

                nrolegajo = Integer.parseInt(s.nextLine());

                salir = true;

            }catch (NumberFormatException e){
                System.out.println("Solo numeros");
            }

        }while (!salir);

    }

}
