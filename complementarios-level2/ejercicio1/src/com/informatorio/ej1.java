package com.informatorio;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        String ciudad;
        int op = 1;

        while (op == 1){
            System.out.println("Ingrese una ciudad");
            ciudad = scan.nextLine();
            ciudades.add(ciudad);

            System.out.println("Ciudad cargarda. Ingrese 1 para continuar, 2 para salir");
            op = Integer.parseInt(scan.nextLine());

        }

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println((i+1) + "# " + ciudades.get(i));
        }
    }
}
