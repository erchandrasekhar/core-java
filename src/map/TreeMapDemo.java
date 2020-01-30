package map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
	/*	TreeMap<Integer, Employee> map = new TreeMap<Integer, Employee>();
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
		}*/
		
		
		
	    Comparator<Employee> seortBestOnId = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getId()-e2.getId()>0)
					return 1;
				else if(e2.getId()-e2.getId()<0)
					return -1;
				else
					return 0;
			}
		};
		
		Employee e1 = new Employee(108, "chandra", "spj");
		Employee e2 = new Employee(103, "nilu", "spj");
		Employee e3 = new Employee(105, "chanda", "spj");
		TreeMap<Employee ,String > treeMap = new TreeMap<Employee,String>(seortBestOnId);
		treeMap.put(e1,"kalpana"); 
		treeMap.put(e2,"nilu");
		treeMap.put(e3,"chandra");
		
		
		Set set = treeMap.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){

		Entry entry = (Entry) itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());

		}
		
	}
	
	
	
	

}
