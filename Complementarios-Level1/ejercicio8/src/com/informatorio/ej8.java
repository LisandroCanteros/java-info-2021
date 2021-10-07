package com.informatorio;

import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();
        System.out.println("Ingrese su edad");
        String edad = scan.nextLine();
        System.out.println("Ingrese su dirección");
        String direccion = scan.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = scan.nextLine();

        scan.close();

        System.out.println(String.format("%s - %s - %s - %s %s", ciudad, direccion, edad, nombre, apellido));

    }
}
