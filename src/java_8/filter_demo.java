package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_demo {
	
	public static void main(String[] args) {
		
	
	List<Employee> empList = Arrays.asList(
			new Employee(100, "kalpana", "darbhanga"),
			new Employee(101, "anand", "spj"),
			new Employee(122, "chandra", "spj"),
			new Employee(103, "ganga", "samastipur"),
			new Employee(104, "gulab", "darbhanga"));
	
	System.out.println(empList.stream().filter(em -> em.getAddress().startsWith("spj") && em.getId() >=100).collect(Collectors.toList()));
	
	
	}	
	
}
