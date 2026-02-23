/*
Java LinkedList class uses a doubly linked list to store the elements. 
It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:
-----------------------------------------------
Java LinkedList are index based Data structure.
Java LinkedList can store heterogeneous / different datatypes elements.
Java LinkedList class can contain duplicate elements and store mutliple null values.
Java LinkedList class maintains/follows insertion order but doesn't follows sorting order.
Java LinkedList are non synchronized. it means multiple thread can access an object simultaneously.   
Java LinkedList aren't thread safe.
Java LinkedList doesn't give the gurantee of Data Consistency.
 
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.

Hierarchy of LinkedList class: 
Java LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.
In the case of a doubly linked list, we can add or remove elements from both sides.

Constructors of Java LinkedList

1) LinkedList() : It is used to construct an empty list.
2) LinkedList(Collection<? extends E> c) : It is used to construct a list containing the elements of the specified collection, in the order, they are returned by the collection's iterator.

Disadvantage : 
1) It can occupy extra space for previous node address.


*/

package collectionAPI;
import java.util.LinkedList;

public class Linked_List
{
     public static void main(String[] args) 
    {
        LinkedList l = new LinkedList();
        l.add(0,10);
        l.add(1,20);
        l.add(30);
        l.add('a');
        l.add(null);
        System.out.println("List 1 : "+l);


        LinkedList l1 = new LinkedList();
        l1.add('c');
        l1.add('a');
        l.addAll(2,l1);    
        System.out.println("List 2 : "+l);

        
        System.out.println(l.containsAll(l1)); 
        System.out.println(l1.get(1));
        l.set(0, 45);
        System.out.println(l);


        //add elements
        l.addFirst(l1);
        System.out.println(l);
        // l1.addFirst(l1);
        // System.out.println(l1);  output : [(this Collection), c, a]

        // l1.addLast(l);
        // System.out.println(l1); output : [c, a, [45, 20, 30, null]]
        
        System.out.println(l.getFirst());  // retrieve first element from the list.
        System.out.println(l.getLast());  // retrieve last element from the list.

        l.removeFirst();
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

       System.out.println( l.getFirst());
       System.out.println(l1.getLast());
       System.out.println(l1.getClass());

       
    }    
}
