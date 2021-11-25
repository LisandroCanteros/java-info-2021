package com.informatorio;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> resultado = palabras.stream()
                .distinct()
                .map(palabra -> factorial(palabra))
                .collect(Collectors.toList());
        System.out.println(resultado);
    }

    public static int factorial (int n){
        if (n==0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
