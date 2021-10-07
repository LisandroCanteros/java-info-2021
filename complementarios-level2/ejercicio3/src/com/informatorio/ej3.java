package com.informatorio;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.AnnotatedWildcardType;
import java.util.ArrayList;
import java.util.Collections;

public class ej3 {

    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            baraja.add(i);
        }

        //en orden
        System.out.println("EN ORDEN");
        System.out.println(baraja);

        //orden inverso
        System.out.println("INVERSO");
        Collections.sort(baraja, Collections.reverseOrder());
        System.out.println(baraja);

        //desordenado
        System.out.println("DESORDENADO");
        Collections.shuffle(baraja);
        System.out.println(baraja);

    }
}
