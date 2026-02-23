/*
 * SET : Set Interface in Java is present in java.util package. It extends the Collection interface. 
 * Set is not an index based data structure . It stores the data according to the hash code values.
 * Set does not allow to store duplicate elements.
 * Set can store only(at most) one null value.
 * Set does not follows the insertion order.
 * We can iterate the Set elements one by one by using Iterator.
 * Set is implemented by HashSet, LinkedHashSet, and TreeSet.
 
 *  Set can be instantiated as:
	Set<data-type> s1 = new HashSet<data-type>();  
	Set<data-type> s2 = new LinkedHashSet<data-type>();  
	Set<data-type> s3 = new TreeSet<data-type>();  
 
 */
package collectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SET_Example 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		// set is not index based data structure so we can't add by giving index no's.
	//	s.add(0,100);  Wrong

		s.add(100); // Right
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(400);
		s.add(null); // Set can store only one null value
		s.add(null);
		System.out.println("Set : "+s); // Set doesn't follow sequence like list, it can't store duplicate elements.
	
		System.out.println("\nIterator in Set: ");
		Iterator itr = s.iterator(); // retrieve value one by one.
		while(itr.hasNext()) // .hasNext() method return boolean value if the element present in our list.
		{
			System.out.println(itr.next()); // .next() method simply print the value.
 		}
		 
	}

}
