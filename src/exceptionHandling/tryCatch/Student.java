package exceptionHandling.tryCatch;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String name;
	private Double mark;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public Student(int studentId, String name, Double mark) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", mark=" + mark + "]";
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(100, "chandra", 500.00));
		studentList.add(new Student(101, "hftf", 500.00));
		System.out.println(avrageMarksOfAllStudent(studentList));
	}
	
	public static double avrageMarksOfAllStudent(ArrayList<Student> studentList)
	{   Double avg = 0.0;
	    double marks = 0.0;
		for (Student student : studentList) 
		{
		    marks = marks + student.getMark();	
		    
		}
		try 
		{
			avg = marks/0;	
		} catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("something wrong here");
		}
		
		
		return avg;
	} 
}
