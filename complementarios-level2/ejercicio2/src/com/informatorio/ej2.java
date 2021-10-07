package com.informatorio;

import java.util.ArrayList;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Ingrrese número a insertar al principio");
        int numInicio = Integer.parseInt(scan.nextLine());
        System.out.println("Ingrrese número a insertar al final");
        int numFinal = Integer.parseInt(scan.nextLine());
        scan.close();

        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println("--------------------------");
/* esta parte la hice sin saber que se podía agregar un elemento al principio sin eliminar el que ya estaba en esa posición.
        int aux = 0;
        int prox = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (i < (numeros.size()-1)) {
                prox = numeros.get(i + 1);
            }

            if (i == 0) {
                aux = numeros.get(i);
                numeros.set(i, numInicio);
            } else {
                numeros.set(i, aux);
                aux = prox;
            }
        }*/

        numeros.add(0, numInicio);
        numeros.add(numFinal);

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
