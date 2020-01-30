package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorted_demo {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List number = Arrays.asList(2,5,8,9);
		
		System.out.println(number.stream().sorted().collect(Collectors.toList()));
		System.out.println(number.stream().findAny());
		
		//number.stream().sorted((n1,n2) -> ( (n1<n2?1:(n1>n2):-1:0)).
		
		
		List<Employee> empList = Arrays.asList
				(
				new Employee(100, "kalpana", "darbhanga"),
				new Employee(45, "anand", "spj"),
				new Employee(87, "chandra", "spj"),
				new Employee(222, "ganga", "samastipur"),
				new Employee(222222, "gulab", "darbhanga")
				);
		
		
		empList.stream().forEach(e -> System.out.println(e));
		
		List slist = empList.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
	    System.out.println(" "
	    		+ "############"
	    		   
	    		+ "###################");
		slist.forEach(s -> System.out.println(s));
		
		
	}
	
	
	
	
	
}
