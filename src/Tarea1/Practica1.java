package Tarea1;

import java.util.*;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Practica1 {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        // EJERCICIO 1
        int sum;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        sum = numbers.stream().filter(number -> number % 2 ==0).mapToInt(number -> number).sum();
        System.out.println(sum);

        //EJERCICIO 2
        String cadena = "Cadena de texto para practicar con conjuntos en Java";

        Set<Character> letrasUnicas = cadena.chars()
                .filter(Character::isLetter)
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.toSet());
        logger.log(Level.INFO,"Letras Unicas: "+letrasUnicas.size()+" Letras: "+ letrasUnicas);
        logger.log(Level.INFO,"Este es un mensaje de registro");

        //EJERCICIO 2.2
        System.out.println(System.lineSeparator() +"................... EJERCICIO 2.2 .......................");

        String cadenaTexto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non tortor eget ligula " +
                "gravida lacinia. Suspendisse potenti. Integer lacinia justo et velit varius, eget venenatis justo " +
                "vulputate. In in malesuada sapien, vel commodo tortor. Vestibulum ante ipsum primis in faucibus orci " +
                "luctus et ultrices posuere cubilia Curae; Aliquam sed nunc id augue varius hendrerit. Sed feugiat " +
                "lacinia mi, quis congue odio.\n";
        String[] palabras = cadenaTexto.split("[\\s\\p{Punct}]+");;
        Set<String> palabrasUnicas = Arrays.stream(palabras).collect(Collectors.toSet());
        System.out.println("Palabras: " + palabrasUnicas);
        palabrasUnicas.forEach(palabra -> System.out.println(palabra));

        //EJERCICIO 2.3
        System.out.println(System.lineSeparator() +"................... EJERCICIO 2.3 .......................");

        Map<String, Long> palabrasUnicas2 = Arrays.stream(palabras)
                        .map(palabra -> palabra.toLowerCase())
                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Palabras: " + palabrasUnicas2);

    }
}
