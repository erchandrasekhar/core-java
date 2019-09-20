package collegeStudentFacultyManagement;

import java.util.ArrayList;

public class Department {

	private String departmentName;
	private int departmentCapasity;
	private Faculty departmentFaculty;
	private ArrayList<Student> deparmentstudentList;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentCapasity() {
		return departmentCapasity;
	}
	public void setDepartmentCapasity(int departmentCapasity) {
		this.departmentCapasity = departmentCapasity;
	}
	public Faculty getDepartmentFaculty() {
		return departmentFaculty;
	}
	public void setDepartmentFaculty(Faculty departmentFaculty) {
		this.departmentFaculty = departmentFaculty;
	}
	public ArrayList<Student> getDeparmentstudentList() {
		return deparmentstudentList;
	}
	public void setDeparmentstudentList(ArrayList<Student> deparmentstudentList) {
		this.deparmentstudentList = deparmentstudentList;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentCapasity=" + departmentCapasity
				+ ", departmentFaculty=" + departmentFaculty + ", deparmentstudentList=" + deparmentstudentList + "]";
	}
	
	
}
