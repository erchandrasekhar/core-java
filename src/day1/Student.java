package day1;

public class Student {
	
	private int id;
	private String name;
	private Boolean status;
	private String email;
	
	
	
	public static void main(String[] args) 
	{
		Student student = new Student();
		student.id=100;
		student.name="Chandrasekhar Yadav";
		student.email="email@gmail.com";
		student.status=true;
		
		System.out.println("Student Name::"+student.name);
		System.out.println("Student Email:"+student.email);
		System.out.println("Student Status:"+student.status);
		
	}

}
