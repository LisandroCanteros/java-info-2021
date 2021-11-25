package com.informatorio;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Lisandro", "Canteros", LocalDate.of(2020, 1, 1)),
                new Alumno("Leandro", "Tombetta", LocalDate.of(2018, 12, 12)),
                new Alumno("Pepe", "Frog", LocalDate.of(2019, 1, 1)),
                new Alumno("Armando", "Paredes", LocalDate.of(1900, 12, 30)),
                new Alumno("Fulanito", "Martínez", LocalDate.of(2021, 1, 1)));

        Map<String, Integer> resultado = alumnos.stream()
                .collect(Collectors.toMap(alumno -> construirClaveAlumno(alumno), Alumno::getEdad));
        System.out.println(resultado);
    }

    private static String construirClaveAlumno(Alumno alumno){
        return alumno.getApellido().concat(" ").concat(alumno.getNombre());
    }
}
