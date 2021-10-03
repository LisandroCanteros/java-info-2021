package com.informatorio;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Ingrese número a calcular factorial");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(String.format("El factorial de %d es: %d", num, factorial));
    }
}
