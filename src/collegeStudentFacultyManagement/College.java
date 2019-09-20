package collegeStudentFacultyManagement;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;

public class College {

	ArrayList<Department> collegeDepartment = new ArrayList<>();
	String collegeName;
	String collegeCity;
	
	public ArrayList<Department> getCollegeDepartment() {
		return collegeDepartment;
	}

     

	public void setCollegeDepartment(ArrayList<Department> collegeDepartment) {
		this.collegeDepartment = collegeDepartment;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public String getCollegeCity() {
		return collegeCity;
	}



	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}



	@Override
	public String toString() {
		return "College [collegeDepartment=" + collegeDepartment + ", collegeName=" + collegeName + ", collegeCity="
				+ collegeCity + "]";
	}

	
	
	
	
	
	public static void main(String[] args) 
	{
		

		Student student1 = new Student("chandrasekhar", "M", "Bihar", 1210917, "ece");
		Student student2 = new Student("Ashok", "M", "Bihar", 121917, "ece");
		Student student3 = new Student("Anand", "M", "Bihar", 12117, "cse");
		ArrayList<Student> stuList1 = new ArrayList<>();
		ArrayList<Student> stuList2 = new ArrayList<>();
		
		stuList1.add(student1);
		stuList1.add(student2);
		stuList2.add(student3);
		
		Faculty faculty1 = new Faculty("pintu kumar", "M", "bihar", "b-tech", 10);
		Faculty faculty2 = new Faculty("pravat kumar", "F", "bihar", "m-tech", 15);
		
		
		Department d1 = new  Department();
		d1.setDepartmentName("cse");
		d1.setDepartmentCapasity(20);
		d1.setDepartmentFaculty(faculty1);
		d1.setDeparmentstudentList(stuList1);
		
		Department d2 = new  Department();
		d2.setDepartmentName("me");
		d2.setDepartmentCapasity(20);
		d2.setDepartmentFaculty(faculty2);
		d2.setDeparmentstudentList(stuList2);
		
		ArrayList<Department> dList = new ArrayList<>();
		dList.add(d1);
		dList.add(d2);
		
		College c = new College();
		c.setCollegeCity("patna");
		c.setCollegeDepartment(dList);
		c.setCollegeName("chandra college of engg");
		
		System.out.println("##################### Total Department Size is:"+c.addDepartment("cse", 10, faculty1));
	}

	
public int addDepartment(String dName,int capacity,Faculty faculty)
{          
	       System.out.println("########## before department add ##########");
	       for (Department department : collegeDepartment) 
	       {   System.out.println(department);
	    	   
			
		   }
	       
	        Department d = new Department();
  			d.setDepartmentName(dName);
  			d.setDepartmentCapasity(20);
  			d.setDepartmentFaculty(faculty);
  			collegeDepartment.add(d);
	        System.out.println("############## aftr department add ##############");
	        for (Department department : collegeDepartment)
	        {
				System.out.println(department);
			}
	        return collegeDepartment.size();
	
}

}