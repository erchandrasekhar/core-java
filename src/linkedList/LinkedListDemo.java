package linkedList;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Employee> empList = new LinkedList<>();
		
		empList.add(new Employee(100, "anand", "home")); //adding element into LinkedList
		empList.add(new Employee(101, "kalpana", "home"));
		empList.addFirst(new Employee(100, "chandra", "ece")); // this method is add element at first
		empList.addLast(new Employee(200, "sdsds", "sdsadsad")); // add elements at last position 
		
		System.out.println("size of linkedList:"+empList.size()); // size of linkedlist
		System.out.println(empList.isEmpty()); // check LinkedList is Empty or not return true and false
		System.out.println(empList.get(2)); // get element at specific index
		
		//System.out.println(empList.contains(new Employee(100, "anand", "home")));
		System.out.println(empList.hashCode());
		System.out.println(empList.remove(1));
		
		System.out.println(empList.getClass());
		System.out.println(empList.set(1, null));
		System.out.println(empList.size());
		System.out.println(empList+"\n");
		
		
		
				
	}

}
