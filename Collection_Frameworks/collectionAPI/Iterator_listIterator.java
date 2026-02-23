/*
 * Iterator and listIterator both are cursor.
 * 
 * Iterator ----> We can get iterator by using iterator() method.
    Syntax : Iterator i = l.iterator();
 * Iterator can be used with any collection Object.
 * Iterator methods are hasNext(),next(),remove().
 * By using Iterator cursor we can retrieve the elements only in forward direction.
 * We can read and remove the elements.
    
 * ListIterator ----> We can get ListIterator by using listIterator() method.
  Syntax : ListIterator  itr =  l.listIterator();
 * listIterator can be used only with List implemented clauses i.e. ArrayList,Linked list,Vector,Stack.
 * listIterator main methods are hasNext(),next(),remove(),hasPrevious(),previous(),set().
 * By using lisIterator cursor we can retrieve the elements in forward and backward direction.
 * We can read,remove,replace and add the elements.
 */

package collectionAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Iterator_listIterator 
{
	public static void main(String[] args)
	{
		// Iterator
		System.out.println("Iterator Examples : ");
		List l  = new ArrayList ();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add('c');

		System.out.println(l);

		Iterator it = l.iterator();
	 // System.out.println(it.hasNext());  //if value present in iterator then return true.
		while(it.hasNext()) // return boolean value. 
		{
			System.out.println(it.next()); // return next object.
		}
		it.remove();
		
		
		
		//listIterator
		System.out.println("ListIterator Examples : ");
		List li  = new ArrayList ();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add("Tony");
		li.add("Evans");
		
		ListIterator  li1 = li.listIterator();
		System.out.println(li);
		
//		System.out.println("Forward traversal"); // for backward traversal we use this loop to move the cursor.
//		while(li1.hasNext())
//		{
//			System.out.println(li1.next());
//		}

		  // or  to move the cursor.....
		li1.next(); // jitne objects honge list mein unke cursor ko move karane ke lie .next() method ka use hoga. ya fir loop.  
		li1.next();
		li1.next();
		li1.next();
		li1.next();
	
		
		System.out.println("------------------");
// if we directly use this then no value will be print  because the cursor which is on the top can't traverse back so to move the cursor either we simply use .next() method or using a loop.for first forward the value then backward. 
		System.out.println("Backward Traversal: "); 
		while(li1.hasPrevious())
		{
			
			System.out.println(li1.previous());
		}
		
		li1.set("Captain"); // set operation replace the element from the top value of a list. in this case 100 will replace by "Captain".
		System.out.println("Set method: "+li);
	}
}
