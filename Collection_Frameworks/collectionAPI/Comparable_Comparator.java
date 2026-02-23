package collectionAPI;

import java.util.*;

// -------------------------------------------------
// Student Class implementing Comparable
// -------------------------------------------------
class Student implements Comparable<Student> {

    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // -------------------------------------------------
    // Comparable → Default Sorting Logic
    // Here we sort by ID (ascending)
    // -------------------------------------------------
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;   // ascending by id
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}


// -------------------------------------------------
// Comparator 1 → Sort by Age
// -------------------------------------------------
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;   // ascending age
    }
}


// -------------------------------------------------
// Comparator 2 → Sort by Marks (Descending)
// -------------------------------------------------
class MarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.marks > s2.marks)
            return -1;
        else if (s1.marks < s2.marks)
            return 1;
        else
            return 0;
    }
}


// -------------------------------------------------
// Main Class
// -------------------------------------------------
public class Comparable_Comparator {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul", 22, 75.5));
        list.add(new Student(1, "Amit", 20, 88.0));
        list.add(new Student(2, "Neha", 21, 90.5));

        // -------------------------------------------------
        //  Default Sorting (Comparable → by ID)
        // -------------------------------------------------
        Collections.sort(list);
        System.out.println("Sorted by ID (Comparable):");
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println();

        // -------------------------------------------------
        // Sorting using Comparator → by Age
        // -------------------------------------------------
        Collections.sort(list, new AgeComparator());
        System.out.println("Sorted by Age (Comparator):");
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println();

        // -------------------------------------------------
        // Sorting using Comparator → by Marks Desc
        // -------------------------------------------------
        Collections.sort(list, new MarksComparator());
        System.out.println("Sorted by Marks Desc (Comparator):");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

