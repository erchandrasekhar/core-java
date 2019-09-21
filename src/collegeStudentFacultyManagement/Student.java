package collegeStudentFacultyManagement;

public class Student extends Person{
	
	private int rollNo;
	private String dept;
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student(String name, String gender, String state, int rollNo, String dept) {
		super(name, gender, state);
		this.rollNo = rollNo;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", dept=" + dept + ", getName()=" + getName() + ", getGender()="
				+ getGender() + ", getState()=" + getState() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
