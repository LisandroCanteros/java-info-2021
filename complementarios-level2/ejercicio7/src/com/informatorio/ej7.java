package com.informatorio;

import java.util.ArrayList;

public class ej7 {

    public static void main(String[] args) {
        System.out.println(fizzBuzzFuncion(1, 6));
        System.out.println(fizzBuzzFuncion(1, 8));
        System.out.println(fizzBuzzFuncion(5, 8));
        System.out.println(fizzBuzzFuncion(1, 13));
    }

    public static ArrayList<String> fizzBuzzFuncion(int a, int b){
        ArrayList<String> arreglo = new ArrayList<>();
        for (int i = a; i < b; i++) {
            arreglo.add((Integer.toString(i)));
        }

        int actual;
        for (int i = 0; i < arreglo.size(); i++) {
            actual = Integer.parseInt(arreglo.get(i));
            if (actual % 6 == 0){
                arreglo.set(i, "FizzBuzz");
            }else if (actual % 2 == 0){
                arreglo.set(i, "Fizz");
            }else if (actual % 3 == 0){
                arreglo.set(i, "Buzz");
            }
        }

        return arreglo;
    }
}
