package Clase2_IntroduccionProgramacionFuncional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class TallerLambda {
    public static void main(String[] args) {

        //Realicé las actividades del Lesson1 utilizando directamente el paquete
        //java.util.function
        //Por lo tanto aplicaria para el Lesson1 y Lesson2
        Logger logger = Logger.getLogger(TallerLambda.class.getName());

        //1. Escriba un programa que implemente una función lambda para encontrar la suma de dos enteros.
        BiFunction<Integer, Integer, Integer> suma = (number1, number2) -> number1 + number2;
        int number1 = 10;
        int number2 = 30;

        logger.info("La suma de " + number1 + " + " + number2 + " es: " + suma.apply(number1, number2));

        //2. Escriba un programa para implementar una expresión lambda
        // para ordenar una lista de strings en orden alfabético.
        List<String> letters = Arrays.asList("F", "G", "H", "I", "E", "B", "C", "D", "A");

        Collections.sort(letters, (s1, s2) -> s1.compareTo(s2));

        logger.info("Lista ordenada: " + letters);

        //3. Escriba un programa en Java para implementar una expresión
        // lambda para chequear si un número es primo.
        int numero = 4;

        IntPredicate esPrimo = n -> n > 1 && java.util.stream.IntStream.range(2, (int) Math.sqrt(n) + 1)
                .noneMatch(i -> n % i == 0);

        logger.info(numero + (esPrimo.test(numero) ? " es primo." : " no es primo."));

        //4. Escriba un programa en Java para implementar una expresión lambda
        // para chequear si un string dado es palíndromo.
        String cadena = "radar";

        Predicate<String> esPalindromo = s -> s.replaceAll("\\s", "")
                .equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        logger.info("'" + cadena + "' " + (esPalindromo.test(cadena) ? "es un palíndromo." : "no es un palíndromo."));

    }


    private static boolean esPrimo(int numero) {
        return numero > 1 && IntStream.range(2, (int) Math.sqrt(numero) + 1)
                .noneMatch(i -> numero % i == 0);
    }

}
