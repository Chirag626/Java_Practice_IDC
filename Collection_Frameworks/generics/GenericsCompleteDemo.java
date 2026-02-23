package generics;
import java.util.*;

// ============================================================
// COMPLETE GENERICS DEMO - SINGLE FILE
// Covers almost all major generic concepts in one program
// ============================================================

/* ------------------------------------------------------------
   1️⃣ Generic Class with Single Type Parameter
------------------------------------------------------------ */
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}


/* ------------------------------------------------------------
   2️⃣ Generic Class with Multiple Type Parameters
------------------------------------------------------------ */
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println(key + " : " + value);
    }
}


/* ------------------------------------------------------------
   3️⃣ Generic Interface
------------------------------------------------------------ */
interface Container<T> {

    void add(T item);

    T get();
}


/* ------------------------------------------------------------
   4️⃣ Class Implementing Generic Interface
------------------------------------------------------------ */
class StringContainer implements Container<String> {

    private String value;

    public void add(String item) {
        value = item;
    }

    public String get() {
        return value;
    }
}


/* ------------------------------------------------------------
   5️⃣ Bounded Type Parameter (Upper Bound)
   T must extend Number
------------------------------------------------------------ */
class Calculator<T extends Number> {

    private T number;

    public Calculator(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }
}


/* ------------------------------------------------------------
   6️⃣ Generic Utility Class (Generic Methods)
------------------------------------------------------------ */
class Utility {

    // Generic Method
    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }

    // Unbounded Wildcard
    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Upper Bounded Wildcard (Producer)
    public static void printNumbers(List<? extends Number> list) {

        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Lower Bounded Wildcard (Consumer)
    public static void addNumbers(List<? super Integer> list) {

        list.add(100);   // Allowed
        list.add(200);
    }
}


/* ------------------------------------------------------------
   7️⃣ Main Class
------------------------------------------------------------ */
public class GenericsCompleteDemo {

    public static void main(String[] args) {

        System.out.println("----- Generic Class Example -----");

        // Generic Class
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());


        System.out.println("\n----- Multiple Type Parameters -----");

        Pair<String, Integer> pair = new Pair<>("Age", 25);
        pair.display();


        System.out.println("\n----- Generic Interface -----");

        Container<String> container = new StringContainer();
        container.add("Java Interface");
        System.out.println(container.get());


        System.out.println("\n----- Bounded Type (extends Number) -----");

        Calculator<Integer> calc = new Calculator<>(5);
        System.out.println("Square: " + calc.square());

        // Calculator<String> c = new Calculator<>("Hello"); ❌ Not allowed


        System.out.println("\n----- Generic Method -----");

        Integer[] numbers = {1, 2, 3};
        String[] words = {"A", "B", "C"};

        Utility.printArray(numbers);
        Utility.printArray(words);


        System.out.println("\n----- Wildcards -----");

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        Utility.printList(intList);       // Unbounded
        Utility.printNumbers(intList);    // Upper bound


        List<Number> numList = new ArrayList<>();
        Utility.addNumbers(numList);      // Lower bound
        System.out.println(numList);


        System.out.println("\n----- Type Safety Example -----");

        List<String> names = new ArrayList<>();
        names.add("Rahul");

        // names.add(100); ❌ Compile-time error

        System.out.println(names);
    }
}