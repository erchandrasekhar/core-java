package day2;

public class Employee {
	
	private int  id;

	private String  name;

	private String  designation;

	private int  ssnNo;

	private int  age;

	private double salary;

	
	/*creating getters and setters*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSsnNo() {
		return ssnNo;
	}

	public void setSsnNo(int ssnNo) {
		this.ssnNo = ssnNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*constructor using fields*/
	
	public Employee(int id, String name, String designation, int ssnNo, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.ssnNo = ssnNo;
		this.age = age;
		this.salary = salary;
	}

	
	
public Employee() {
		// TODO Auto-generated constructor stub
	}




@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", ssnNo=" + ssnNo + ", age="
			+ age + ", salary=" + salary + "]";
}

public static Double findAvgEmployeeForId(Employee e1,Employee e2){
		
		Double avg=0.0;
		return avg=(double) (e1.getId()+e2.getId())/2;
		
	}
	
public static Employee findMinEmployeeForId(Employee e1,Employee e2){
	
		Employee e=new Employee();
		
		if(e1.getId()>e2.getId())
		{
			e=e2;
		}
		else
		{
			e=e1;
		}
		
		return e;
}

	
}
