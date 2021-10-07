package com.informatorio;

import java.util.ArrayList;
import java.util.List;

public class ej4 {

    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("Pepe");
        estudiantes.add("Pablo");
        estudiantes.add("María");
        estudiantes.add("Laura");
        estudiantes.add("Juan");
        estudiantes.add("José");
        estudiantes.add("Pedro");
        estudiantes.add("Ramón");
        estudiantes.add("Paula");
        estudiantes.add("Andrea");
        estudiantes.add("Marta");
        estudiantes.add("Carlos");

        List<String> curso1 = new ArrayList<>();
        List<String> curso2 = new ArrayList<>();
        List<String> curso3 = new ArrayList<>();

        curso1 = estudiantes.subList(0, 4);
        curso2 = estudiantes.subList(4, 8);
        curso3 = estudiantes.subList(8, 12);

        System.out.println("CURSO 1");
        System.out.println(curso1);
        System.out.println("CURSO 2");
        System.out.println(curso2);
        System.out.println("CURSO 3");
        System.out.println(curso3);
    }
}
