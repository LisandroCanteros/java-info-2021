package com.informatorio;

import java.util.ArrayList;
import java.util.Random;

public class ej5 {

    public static void main(String[] args) {
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> salario = new ArrayList<>();
        ArrayList<Integer> totalDia = new ArrayList<>();
        int total = 0;
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            horas.add(rand.nextInt(10));
            salario.add(rand.nextInt(1000-100) + 100);
        }

        for (int i = 0; i < 5; i++) {
            totalDia.add(horas.get(i)*salario.get(i));
            total += totalDia.get(i);
        }

        System.out.println("HORAS TRABAJADAS");
        System.out.println(horas);
        System.out.println("SALARIO POR HORA");
        System.out.println(salario);

        System.out.println("SALARIO TOTAL DE CADA DÍA");
        System.out.println(totalDia);
        System.out.println("TOTAL SEMANAL");
        System.out.println(total);

    }
}
