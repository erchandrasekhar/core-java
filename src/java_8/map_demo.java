package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class map_demo {
	
	public static void main(String[] args) {
		//stream().map() method is used to perform opration on it 
		List<Integer> number = (List<Integer>) Arrays.asList(1,2,3,4);
		List<Integer> squre =  (List<Integer>) number.stream().map( n -> n*n).collect(Collectors.toList());
		squre.forEach(sq -> System.out.println(sq));
		
		System.out.println("count /size "+squre.stream().count());
		
		
		List<Employee> empList = Arrays.asList(
				new Employee(100, "kalpana", "darbhanga"),
				new Employee(100, "anand", "spj"),
				new Employee(100, "chandra", "spj"),
				new Employee(100, "ganga", "samastipur"),
				new Employee(100, "gulab", "darbhanga"));
		
		
		empList.stream().map( emp -> emp.getName().concat("yadav")).collect(Collectors.toList());
		
		empList.forEach( e -> {
			if(e.getName().equals("kalpana"))
			{
				e.setName(e.getName()+" i love you kalpana ");;
				System.out.println(e);
			}
			
		});
	}

}
