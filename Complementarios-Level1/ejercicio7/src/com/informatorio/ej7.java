package com.informatorio;

import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String cadena = "";

        System.out.println("Ingrese una cadena de caracteres");
        cadena = scan.nextLine();

        System.out.println(stringToMayus(cadena));
        scan.close();
    }

    public static String stringToMayus(String entrada){
        String salida = "";

        for (int i = 0; i < entrada.length(); i++) {
            if (Character.isLetter(entrada.charAt(i)) && Character.isLowerCase(entrada.charAt(i))) {
                int charMayus = (int) entrada.charAt(i) - 32;
                salida += (char) charMayus;
            }else {
                salida += entrada.charAt(i);
            }
        }
        return salida;
    }
}
