package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Employee> map = new LinkedHashMap<Integer, Employee>();
		/* Elements insertion order are  preserved and null key are accept  if two null key are inserted
	     than second null will accent */
		map.put(null, new Employee(103, "kalpana", "darbhanga"));
		map.put(58, new Employee(100, "kalpana", "darbhanga"));
		map.put(null, new Employee(156, "kalpana", "darbhanga"));
		map.put(4, new Employee(101, "nilu", "darbhanga"));
		map.put(20, new Employee(102, "kalpana", "darbhanga"));
		map.put(68, new Employee(103, "kalpana", "darbhanga"));
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Entry entry = (Entry)itr.next();
			
		    System.out.println(entry.getKey()+" " +entry.getValue());
		}
		
	}
	
}
