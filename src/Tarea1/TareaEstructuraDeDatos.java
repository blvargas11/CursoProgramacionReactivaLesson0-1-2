package Tarea1;

import java.util.*;

public class TareaEstructuraDeDatos {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(7);
        numeros.add(5); // No se permiten duplicados

        Map<String, Integer> edades = new HashMap<>();
        edades.put("Alice", 25);
        edades.put("Bob", 30);
        int edadBob = edades.get("Bob"); // Recuperar el valor asociado con la clave "Bob"

        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(3);
        numeros2.add(1);
        numeros2.add(5);
        Collections.sort(numeros2); // Ordena la lista



    }
}
