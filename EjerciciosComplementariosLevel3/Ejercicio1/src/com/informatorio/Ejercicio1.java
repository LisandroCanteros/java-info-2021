package com.informatorio;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> output = palabras.stream()
                .filter(palabra -> Objects.nonNull(palabra) && !palabra.isEmpty() && !palabra.isBlank())
                .map(String::trim)
                .collect(Collectors.toList());
        System.out.println(output);
    }
}
