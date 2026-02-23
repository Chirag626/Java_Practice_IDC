/*
 * Collection Framework -->
 * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
   Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
   Java Collection framework provides many interfaces (Set, List, Queue, Dequeue).
   and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

What is Collection in Java ?
A Collection represents a single unit of objects, i.e., a group.which can store multiple data.
Collection is an Interface which is present in java.util package(1.2) version.

Syntax: public interface Collection<E> extends Iterable <E>.

Methods of Collection Interface --> public boolean add(Object obj), public boolean addAll(Collection c) and Many more.


What is a framework in Java ? 
It provides ready made architecture. and represents the library.
It represents a set of classes and interfaces.
It is optional.

What is Collection framework
The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
1. Interfaces and its implementations, i.e., classes
2. Algorithm

It contains two main parts(packages)
1) java.util.Collection --> In Collection We can store the data directly.
2) java.util.Map --> In Map we can store  the data in key-value pair.

Collection Interface --> It is the root interface (present in java.util.package) of all the collection objects.
Collections Class --> It is the utility class which contains only static methods.

Hierarchy
---------
												      Iterable
												          |
											          Collection("Collection" is an Interface whereas "Collections" is a class)
												          |   
								  I extends I             |	interface extends interface
							---------------------------------------------------------------
							|						      |					              | 
These 3 are Interfaces	  List				             Set					       Queue
					 		|							  |								  |	
These are Classes :		    |_ Array list	         	Hashset						Priority Queue
							|_ Linked list				  |_ Linked hashset               |
							|_ Vector					  |                            Dequeue (Interface)
							     |_ Stack                Sorted Set (interface)           |_Array Dequeue
							     							|_Navigable Set(Interface)
							     								  |_Tree Set
 */
package collectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_Interface {

	public static void main(String[] args)
	{
		// ArrayList al = new ArrayList();
//we can write like this because Collection is parent of List and List is a parent of Arraylist.but it doesn't support index value.
        Collection al = new ArrayList(); // Collection is an interface that means we can't create instantiate it directly so we will use like this. by using Array list class.
		al.add(10);	
		al.add("Chirag"); // add() method is used to insert an element in this collection.
		al.add('c');
		System.out.println(al+" \nThe Size of this List is: "+al.size());
		
		al.remove(1); //It is used to delete an element from the collection.
		
		System.out.println("new object added status : "+al.add(50)); // returns true if 200 added in array list "al" other wise false.
		
		
		List L = new ArrayList();
		L.add(40);
		L.add(50);
		L.add(20);
		
		// to get index values we can use List Interface as well like this.
		System.out.println("The value which is present index no. 1 is: "+L.get(1)); // In class List there is a method get(index: ) which return the values by giving indexes for example: in index no.1 there is value 30.
		System.out.println("The index no. of the value 20 is: "+L.indexOf(20)); // indexOf method returns the index number.
		
		L.addAll(al); //It is used to insert the specified collection elements in the invoking collection.
		System.out.println("addAll method : "+L);
		
		L.removeAll(al); // remove similar elements from array list L.
		L.addAll(al);
		System.out.println("After Similar elements removed from the list L is : "+L);
		System.out.println("Element is present or not status : "+L.contains(450)); // contain method checks the object is present or not if it's present return true otherwise false.
		
		Collection al2 = new ArrayList(); 
		al2.add('a');
		al2.add('b');
		System.out.println("\n"+al2);
		al2.clear(); // It removes the total number of elements from the collection.
		System.out.println("Check the collection empty status : "+al2.isEmpty()); // returns true if collection list is empty, otherwise false.
		System.out.println("You can see the list is empty : "+al2);
	}

}
