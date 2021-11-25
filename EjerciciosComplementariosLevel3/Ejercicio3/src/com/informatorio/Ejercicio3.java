package com.informatorio;

import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long resultado = palabras.stream()
                .filter(palabra -> palabra.toLowerCase().startsWith("b"))
                .count();

        System.out.println(resultado);
    }
}
