/*
 * Hashing : It is the process of converting an object into an integer value. The integer value helps in indexing and faster searches.
 * 
 * 												HashMap(JDK version 1.2)
 
 * Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. 
 * HashMap class extends AbstractMap class and implements Map interface.
 * It is easy to perform operations using the key index like updation, deletion, etc. HashMap class is found in the java.util package.
 * HashMap stores the data according to the Hastable and we can say that Hashtable is an underline DataStructure of HashMap.
 
  Properties :
 *  HashMap in Java is like the legacy Hashtable class, but it is not synchronized.
 *  Java HashMap contains values based on the key.
 *  Java HashMap contains only unique keys. If you try to insert the duplicate key, it will replace the element of the corresponding key.
 *  Java HashMap may have one null key and multiple null values.
 *  Java HashMap doesn't follow insertion and sorting order.
 *  Java HashMap stores Heterogeneous elements.
 *  The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 
 Note :
 * HashSet contains only values whereas HashMap contains an entry(key and value).	
 * Entry is an Interface which is present in Map interface. Each pair of key and values known as entry.
 * By using entry methods we can get the pair of key and value.
 
 */
package Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) 
	{
		HashMap h = new HashMap();
		h.put(1, 'a');
		h.put(3, 100);
		h.put(2, "tony");
		h.put(null,null);
		
		System.out.println("HashMap 1 : "+h);
		System.out.println("Contains Key : "+h.containsKey(3));
		System.out.println("Contains Value : "+h.containsValue("Box"));
		h.remove(null, null);
		h.replace(2, "Tony Stark"); //It replaces the specified value for a specified key
		System.out.println("After remove and replace : "+h);
		
		System.out.println(h.get(3)); //This method returns the object that contains the value associated with the key.
	
		
		
// 				                   OLD Trick
		
//		System.out.println("\nIteration 1 ");
//		Set s = h.entrySet(); // entrySet method returns the key and values,returns a Set view [ ].
//		Iterator it = s.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//		System.out.println(h.keySet()); // returns the keys.
		 // to retrieve key and value separately.
//		System.out.println("\nIteration 2");
//		it = s.iterator();
//		while(it.hasNext())
//		{
//			Map.Entry etr = (Map.Entry) it.next(); // we are storing the object in the Map.Entry interface and typeCast it so that it can gives the key and value separately.
//			System.out.println("Key : "+etr.getKey()); // Returns the key corresponding to this entry.
//			System.out.println("Value : "+etr.getValue()); //Returns the value corresponding to this entry. If the mappinghas been removed from the backing map (by the iterator's remove operation), the results of this call are undefined.
//		}
//		
		
		
//                                 New Trick
		HashMap<Integer,Character> h2 = new <Integer,Character> HashMap();
		h2.put(101,'A');
		h2.put(102,'C');
		h2.put(104,'B');
		h2.put(103,'D');
		
		System.out.println("\nHashMap 2 "+h2);
		// Retrieve values one by one.
		for(Map.Entry m : h2.entrySet()) // entrySet method returns the key and values,returns a Set view [ ].
		{
			// getKey() Returns the key and getValue() Returns the Value corresponding to this entry.
			System.out.println("Key : "+m.getKey()+"-->"+"Value : "+m.getValue());
		}
		
	}

}
