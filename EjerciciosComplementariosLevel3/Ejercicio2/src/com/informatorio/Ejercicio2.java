package com.informatorio;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> resultado = palabras.stream()
                .map(palabra -> palabra*palabra)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
