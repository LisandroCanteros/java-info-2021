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

        int resta = nro1 - nro2;
        System.out.println(String.format("El resultado de %d - %d es %d", nro1, nro2, resta));

        int multiplicacion = nro1 * nro2;
        System.out.println(String.format("El resultado de %d * %d es %d", nro1, nro2, multiplicacion));

        double division = nro1 / nro2;
        System.out.println(String.format("El resultado de %d / %d es %.2f", nro1, nro2, division));

        int modulo = nro1 % nro2;
        System.out.println(String.format("El resultado de %d %% %d es %d", nro1, nro2, modulo));

    }
}
