/*
 ArrayList :-It is an index based data structure like array. 
 Java ArrayList class uses a dynamic array for storing the elements. 
 It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. 
 It is found in the java.util package. It is like the Vector in C++.
 It inherits the AbstractList class and implements List interface.
 Initial capacity of Array list is 10. it means it can store ten elements. but we can give more capacity.
 The important points about the Java ArrayList class are:
 --------------------------------------------------------
 ArrayList class can contain duplicate elements.
 ArrayList class maintains/follows insertion order.
 ArrayList can store different data types or heterogeneous data type.
 ArrayList can store any number of null values.
 ArrayList Doesn't follow the sorting order.
 ArrayList are non synchronized. it means multiple thread can access an object simultaneously.   
 ArrayList aren't thread safe.
 ArrayList doesn't give the gurantee of Data Consistency.
 
  In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
We can not create an array list of the primitive types, such as int, float, char, etc. 
It is required to use the required wrapper class in such cases. For example:
ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  
Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.

 */

package collectionAPI;

import java.util.ArrayList;

public class Array_List 
{
   public static void main(String[] args) 
   {
      // ArrayList al = new ArrayList(); // initial capacity 10. 
       ArrayList al = new ArrayList(5); // arraylist capacity with capacity 5 that means this arraylist can store 5 elements.
       al.add(25); //first element always store on index 0 if we using manually indexing.otherwise it's showing error.
       al.add(45);
       al.add(0,"Thor");
       al.add('c');
       al.add(55.5);
       al.add(4555);

       System.out.println("ArrayList 1 : "+al);

       ArrayList al2 = new ArrayList(al); // by using "Collection c" constructor that means we can store all values from one Arraylist al to another Arraylist al2.
       al2.add(0,11); // by using manually indexing
       al2.add('c'); // storing duplicate value.
       // storing any number of null values.
       al2.add(null);
       al2.add(null);

       System.out.println("ArrayList 2 : "+al2);

       // we can add one arraylist elements to another arraylist.
       al.addAll(al2); // arraylist al ke andar al2 ke saare elements add krwa diye.
       al.add("Chirag");
       al.add(100);
       System.out.println("Arraylist  : "+al);

       al.remove("Chirag"); // remove particular object or by giving index number.
       al.removeAll(al2); // remove all similar elements from the arraylist. here all similar elements remove from al.
       System.out.println(al);

       ArrayList al3 = new ArrayList();
       al3.addAll(al2);
       System.out.println("ArrayList 3 : "+al3);
       al3.clear(); // clear method used to remove all the elements from the arraylist and prints empty list.
       System.out.println("after removing all elements from ArrayList 3 : "+al3);

// to check elements  is present or not.
      System.out.println(al3.contains("chirag")); //return boolean value.
      System.out.println(al2.contains("Thor"));

      // to get the values from the arraylist by providing index number.
      System.out.println(al2.get(5));

      // set method is used to replace the old element to new element by giving index no.
      al2.set(0, "85"); // 11 replace by 85 in arryalist 2.
      System.out.println(al2);

      // indexOf method returns the indexvalue. if the value/object is not present then it will give -1.
      System.out.println(al2.contains(25));
      System.out.println(al2.indexOf(25));

      }
}
