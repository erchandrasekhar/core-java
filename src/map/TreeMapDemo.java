package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> map = new TreeMap<Integer, Employee>();
		//TreeMap insert elements according to acceding order of key and null key are not allowed
		
		map.put(58, new Employee(100, "kalpana", "darbhanga"));
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
