package day2;

public class EmployeeDemo {
	
	public static void main(String[] args) 
	
	{
		
		Employee e1=new Employee(100, "chandrasekhar", "ase", 222, 26, 400000);
		Employee e2=new Employee(200, "chandrasekhar", "ase", 222, 26, 400000);
		
		//System.out.println(Employee.findAvgEmployeeForId(e1, e2));
		
		System.out.println(Employee.findMinEmployeeForId(e1, e2));
	}

	
	
}
