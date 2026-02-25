/*
Stream is a sequence of elements that supports functional-style operations to process data.
* Stream can be used only once.
* Stream data store nahi karta.
* Stream original collection ko modify nahi karta.
* Stream lazy hota hai (jab tak terminal operation nahi aata, execute nahi hota).

Types of Operations
--------------------
1. Intermediate Operations
   * Return another Stream
   * Lazy execution
   * Multiple use ho sakte hain

Examples: filter() , map(), sorted(), distinct(), limit(), skip()

 2. Terminal Operations
    * Stream ko close kar dete hain
    * Final result produce karte hain

Examples: forEach(), collect(), count(), reduce(), anyMatch(), allMatch(), findFirst()
*/


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
                .filter(n -> n > 10)    // Intermediate operation: filter(Predicate) : filter() uses Predicate functional interface and returns boolean elements that match the condition.
                .forEach(e -> System.out.println(e)); // Terminal operation: forEach. Type 1: Lambda expression.


        System.out.println("\n----- Map Example -----");

        // Multiply each number by 2
        numbers.stream()
                .map(n -> n * 2) // Intermediate operation: map(Function).
                                // map() uses Function functional interface and Function takes an input and returns a transformed value.
                .forEach(System.out::println); // Terminal operation: forEach. Type 2: Method reference.

        System.out.println("\n----- Sorted + Distinct -----");

        numbers.stream()
                .distinct()     // Remove duplicates
                .sorted()       // sorted() sorts elements either in natural order(ascending) or using Comparator.
                .forEach(System.out::println);


        System.out.println("\n----- Collect Example -----");

        List<Integer> result =
                numbers.stream()
                        .filter(n -> n > 10)
                        .collect(Collectors.toList()); //collect() is used to convert stream back into a collection.

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
                        .reduce(0, (a, b) -> a + b); // reduce() is used to combine elements and produce a single result.

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
