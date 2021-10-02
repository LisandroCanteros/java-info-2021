package com.informatorio;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String nombre;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        nombre = scan.nextLine();
        System.out.println("------------------------------");
        System.out.println("HOLA " + nombre);
    }
}
