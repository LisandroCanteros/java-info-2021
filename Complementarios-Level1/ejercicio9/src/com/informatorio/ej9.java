package com.informatorio;

import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String cadena = scan.nextLine();
        System.out.println("Ingrese la letra a contar");
        char letra = scan.next().charAt(0);
        scan.close();

        System.out.println(contarLetra(cadena, letra));
    }

    public static int contarLetra(String cadena, char letra){
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador += 1;
            }
        }
        return contador;
    }

}
