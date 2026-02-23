/*
Java HashSet class is used to create a collection that uses a hash table for storage. 
It inherits the AbstractSet class and implements Set interface. 
The Set interface inherits Collection and Iterable interfaces in hierarchical order.

Note:
HashSet acutally stores the values in Map which can store the elements in key and value pair that is the reason behind that hashset doesn't contain duplicate values because keys are always unique.


The important points about Java HashSet class are:
* HashSet stores the elements by using a mechanism called hashing.
* HashSet contains unique elements only.while SET Contains duplicate elements. 
* HashSet does not allow multiple null value.
* HashSet class is non synchronized.
* HashSet can store heterogeneous/different type data types.
* HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
* HashSet is the best approach for search operations.
* The initial default capacity of HashSet is 16, and the load factor is 0.75.
 
*/
package collectionAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_SET {

    public static void main(String[] args) {
        HashSet h = new HashSet();

        h.add('a');
        h.add(45);
        h.add('b');
        h.add(45); // duplicate element.
        System.out.println(h); //duplicacy not allowed.
        
        Iterator i = h.iterator();
        
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
        ArrayList al = new ArrayList();
        al.add('c');
        al.add(99);

        System.out.println( h.contains(99));
        h.addAll(al);
        System.out.println( h.containsAll(al));

        System.out.println(h.size());

        h.clear();
        System.out.println(h.isEmpty());
        // System.out.println(h);
    }
    
}
