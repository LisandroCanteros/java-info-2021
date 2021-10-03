package com.informatorio;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Ingrese el primer número");
        int num1 = scan.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scan.nextInt();

        for (int i = num1; i > 0; i--) {
            resultado += num2;
        }
        System.out.println(String.format("El resultado de hacer %d * %d mediante sumas sucesivas es %d", num1, num2, resultado));

    }
}
