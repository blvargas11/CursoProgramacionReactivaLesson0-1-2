package Clase1_Checkpoint;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Prueba1 {
    public static void main(String[] args) {

        List<Item> inventory = Arrays.asList(
                new Item("apple", 9.99),
                new Item("orange", 7.99),
                new Item("watermelon", 11.99),
                new Item("apple", 9.99),
                new Item("apple", 9.99),
                new Item("orange", 7.99),
                new Item("lemon", 6.99),
                new Item("apple", 9.99),
                new Item("watermelon", 11.99),
                new Item("papaya", 11.99),
                new Item("banana", 9.99)

        );

        Map<Double, List<Item>> groupByPriceMap = inventory.stream()
                .collect(Collectors.groupingBy(Item::getPrice));

        System.out.println(groupByPriceMap);

        Map<Double, Set<String>> groupByPriceAndItemName2 = groupByPriceAndItemName(inventory);

        System.out.println(groupByPriceAndItemName2);


    }

    private static Map<Double, Set<String>> groupByPriceAndItemName(List<Item> list) {
        return list.stream().collect(Collectors.groupingBy(item -> item.getPrice(), Collectors.mapping(item -> item.getName(), Collectors.toSet())));
    }
}
