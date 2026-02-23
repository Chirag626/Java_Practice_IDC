/* LIST : 
 * List Interface in Java is present in java.util package. It extends the Collection interface.
 * List is an Index base Data Structure.in which we can store the ordered collection of objects.
 * List can store duplicate elements.
 * List can store any no. of null values.
 * List follows the insertion order.
 * We can iterate (get) the list Iterator and ListIterator.
 * List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
  
 * To instantiate the List interface, we must use :
	List <data-type> list1= new ArrayList();  
	List <data-type> list2 = new LinkedList();  
	List <data-type> list3 = new Vector();  
	List <data-type> list4 = new Stack();
 */


package collectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LIST_Examples {

	public static void main(String[] args) 
	{
		List L = new ArrayList();
		//L.add(1,10) it throws an exception because we add 10 at index 1 but the index 0 is empty so first we need to fill index 0 then 1.
		
		L.add(10); //by default added object 10 at index 0,1....so on .
		L.add(1,30); // here we add manually 30 at index 1.
		L.add(60);
		L.add(30); // List can store duplicate values.
		L.add(null);
		L.add(null); // List can store multiple null value.
		System.out.println("List : "+L); // List follow a Sequence.
		
		
		System.out.println("\nIterator method in List : ");
		Iterator it = L.iterator(); // retrieve value one by one.
		while(it.hasNext()) // .hasNext() method return boolean value if the element present in our list.
		{
			System.out.println(it.next()); // .next() method simply print the value.
 		}
		
		System.out.println("\nListIterator method in list : ");
		ListIterator itr = L.listIterator();
		
		while(itr.hasNext()) // in listIterator have hasPrevious() method
		{
			System.out.println(itr.next());
		}

	}

}
