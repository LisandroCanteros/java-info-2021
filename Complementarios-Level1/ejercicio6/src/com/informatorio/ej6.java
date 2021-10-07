package com.informatorio;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la base");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el exponente");
        int num2 = scan.nextInt();

        System.out.println(potencia(num1, num2));
        scan.close();
    }

    public static int potencia(int a, int b){
        int resultado = a;
        for (int i = 1; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
}
