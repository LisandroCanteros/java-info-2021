package com.informatorio;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String salida = "";

        System.out.println("Ingrese un número");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            salida += i + " ";
            System.out.println(salida);
        }
    }
}
