package com.informatorio;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ej6 {

    public static class Empleado{
        String nombre;
        String apellido;
        int dni;
        int horas;
        int salarioHora;

        public Empleado(String nombre, String apellido, int dni, int horas, int salarioHora){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.horas = horas;
            this.salarioHora = salarioHora;
        }

        public int getDNI(){
            return dni;
        }

        public int getHoras(){
            return horas;
        }

        public int getSalarioHora(){
            return salarioHora;
        }

        public void verDatos(){
            System.out.println(String.format("%s - %s - %d - %d - %h",nombre, apellido, dni, horas, salarioHora));
        }
    }

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> sueldos = new HashMap<>();
        Empleado juan = new Empleado("Juan", "Flores", 12345678, 40, 100);
        Empleado armando = new Empleado("Armando", "Paredes", 87654321, 30, 100);
        Empleado marta = new Empleado("Marta", "Pérez", 12341234, 35, 100);

        empleados.add(juan);
        empleados.add(armando);
        empleados.add(marta);

        for (Empleado e : empleados) {
            sueldos.put(e.getDNI(), e.getHoras()*e.getSalarioHora());
        }
        
        for (Map.Entry<Integer, Integer>registro : sueldos.entrySet()) {
            System.out.println(String.format("DNI: %d SUELDO: %d ", registro.getKey(), registro.getValue()));
        }

    }
}
