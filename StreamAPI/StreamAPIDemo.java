package StreamAPI;

import java.util.*;
import java.util.stream.*;

public class StreamAPIDemo {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // Source Collection
        // ----------------------------------------------------
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 5, 30);

        System.out.println("----- Filter Example -----");

        // Filter numbers greater than 10
        numbers.stream()
                .filter(n -> n > 10)   // Intermediate
                .forEach(e -> System.out.println(e);  // Type 1 to use forEach


        System.out.println("\n----- Map Example -----");

        // Multiply each number by 2
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println); // Terminal type 2 to use forEach


        System.out.println("\n----- Sorted + Distinct -----");

        numbers.stream()
                .distinct()     // Remove duplicates
                .sorted()       // Sort ascending
                .forEach(System.out::println);


        System.out.println("\n----- Collect Example -----");

        List<Integer> result =
                numbers.stream()
                        .filter(n -> n > 10)
                        .collect(Collectors.toList());

        System.out.println(result);


        System.out.println("\n----- Count Example -----");

        long count =
                numbers.stream()
                        .filter(n -> n > 10)
                        .count();

        System.out.println("Count: " + count);


        System.out.println("\n----- Reduce Example -----");

        // Sum of all numbers
        int sum =
                numbers.stream()
                        .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);


        System.out.println("\n----- anyMatch / allMatch -----");

        boolean anyGreater =
                numbers.stream()
                        .anyMatch(n -> n > 25);

        System.out.println("Any number > 25: " + anyGreater);


        System.out.println("\n----- findFirst -----");

        Optional<Integer> first =
                numbers.stream()
                        .filter(n -> n > 10)
                        .findFirst();

        first.ifPresent(System.out::println);


        System.out.println("\n----- Working with Strings -----");

        List<String> names = Arrays.asList("Chirag", "Anuj", "Sumit", "Aman","Chetan");

        names.stream()
                .filter(name -> name.startsWith("C"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        System.out.println("\n----- Parallel Stream -----");

        numbers.parallelStream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
