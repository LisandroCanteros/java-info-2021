package com.informatorio;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        int nro2 = scan.nextInt();

        int resultado = nro1 + nro2;
        System.out.println(String.format("El resultado de %d + %d es %d", nro1, nro2, resultado));

    }
}
