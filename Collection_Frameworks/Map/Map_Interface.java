/*									MAP Interface
 											
 * A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. 
 * A Map should be unique keys.If you try to insert the duplicate key, it will replace the element of the corresponding key.
 * A Map can have duplicate Value.
 * A Map can store maximum one null value in key, but in value we can store any number of null values.
 * A Map doesn't follow Insertion and Sorting Order.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap.
 * Map doesn't inherit Collection Interface both are Different.
 * A single key value pair/combination  known as entry.


*/

package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args)
	{
		Map m = new HashMap(); // we can't create instance of MAP interface .but we are using HashMap implemented class.
	
		//	put method is used to insert an entry in the map.
		m.put(1, "Arjun"); // key and value both are objects, key must be unique.
		m.put(3, 400);
		m.put(2,"Bheem");
		m.put(null, null);  // Only one null value can store in the case of "Key".
		m.put(null, 7); 
		m.put(4, null);     // Multiple null values can be store in case of "Value".
		m.put(5,55.5);
		
//		m.clear(); clears the Map.
		System.out.println("Map 1 : "+m);
		
		System.out.println("Key Existence : "+m.containsKey(103)); // check the key is exist or not and return boolean values.
		System.out.println("Value Existence : "+m.containsValue(400)); // chect the value is exist or not and return boolean value.
		
		System.out.println(m.get(2)); // get() method returns the object/Value that contains the element associated with the key.
		
		m.replace(null, 7,10); // replace the value (key,old value,new value).
		m.replace(5, "XYZ"); // (key, new Value)
		System.out.println("Replace the value : "+m);
	
		System.out.println("Keys are for this Map : "+m.keySet()); // keySet() method returns all keys of the specific Map.
		
		Map <Integer,Integer>m2 = new HashMap();
		m2.put(6,500);
		m2.put(3, null);
		m2.put(4, 1000);
		m2.put(8,76);
//		m2.put(3, 400); // duplicate key not allowed.
//		m2.putAll(m); //It is used to insert the specified map in the map.
		
		m2.putIfAbsent(7, 500); // putIfAbsent() method is useful for adding a key-value pair to the map only if the key is not already present.
		System.out.println("\nMap2 : "+m2);
		System.out.println("Map are Equals : "+m2.equals(m)); // returns boolean value, to check both the maps are exact same or not.
		
		m2.remove(6, 500);
		System.out.println("After Remove the element : "+m2);
		
		//retrieve all the keys one by one
			for(Integer s : m2.keySet())
			{
				System.out.println("Key : " + s+" Value : "+m2.get(s)); // keySet return the keys and get method returns the object.
			}		
	}
}	 
