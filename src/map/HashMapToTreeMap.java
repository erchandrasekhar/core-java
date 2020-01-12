package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapToTreeMap {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		/* Elements insertion order are not preserved and null key are accept  if two null key are inserted
	     than second null will accent */
		
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
		
		TreeMap<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();
		
		Set treeSet = map.entrySet();
		Iterator it = treeSet.iterator();
		while(it.hasNext())
		{
			Entry entry = (Entry)it.next();
			
		    System.out.println(entry.getKey()+" " +entry.getValue());
		}
		
	}

}
