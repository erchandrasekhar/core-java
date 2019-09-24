package collegeStudentFacultyManagement;
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

	
	
	
	
	
	public static void main(String[] args) throws QualificationNotMatched, ExperienceNotFoundException 
	{
		

		Student student1 = new Student("chandrasekhar", "M", "Bihar", 1210917, "ece");
		Student student2 = new Student("Ashok", "M", "Bihar", 121917, "ece");
		Student student3 = new Student("Anand", "M", "Bihar", 12117, "cse");
		Student student4 = new Student("Ananfd", "M", "Bihar", 12117, "cse");
		ArrayList<Student> stuList1 = new ArrayList<>();
		ArrayList<Student> stuList2 = new ArrayList<>();
		
		stuList1.add(student1);
		stuList1.add(student2);
		stuList2.add(student3);
		stuList2.add(student4);
		
		Faculty faculty1 = new Faculty("pintu kumar", "M", "bihar", "b-tech", 10);
		Faculty faculty2 = new Faculty("pravat kumar", "F", "bihar", "b-tech", 15);
		Faculty faculty4 = new Faculty("kalpana yadav", "F", "bihar", "b-tech", 20);
		
		
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
		
		Department d3 = new  Department();
		d2.setDepartmentName("me");
		d2.setDepartmentCapasity(18);
		d2.setDepartmentFaculty(faculty4);
		d2.setDeparmentstudentList(stuList2);
		
		ArrayList<Department> dList = new ArrayList<>();
		dList.add(d1);
		dList.add(d2);
		dList.add(d3);
		College c = new College();
		c.setCollegeCity("patna");
		c.setCollegeDepartment(dList);
		c.setCollegeName("chandra college of engg");
		
		System.out.println("##################### Total Department Size is:"+c.addDepartment("cse", 10, faculty1));
		
		System.out.println("################# student size is ################");
		int t = c.addStudent("cse", student4);
		System.out.println("final list is :"+t);
		
		
		System.out.println(c.upgradeFaculty("cse", faculty4));
		
		System.out.println(c.getStudentCountFromState("bihar"));
		
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

public int addStudent(String department,Student studend)
{  int studentCount = 0;
     
    for (Department d : collegeDepartment)
    {
		if (d.getDepartmentName().equals(department))
		{
			System.out.println("before adding student student size was:"+d.getDeparmentstudentList().size());
			d.getDeparmentstudentList().add(studend);
			studentCount = d.getDeparmentstudentList().size();
			System.out.println("after adding student to department size is:"+d.getDeparmentstudentList().size());
		}
		break;
		
	}
    return studentCount;

}

public boolean upgradeFaculty(String departmentName,Faculty faculty) throws QualificationNotMatched, ExperienceNotFoundException
{
	boolean flag = false;
	
	if(!collegeDepartment.isEmpty())
	{
		for (Department department : collegeDepartment) 
		{
			if (department!=null) 
			{
				if(department.getDepartmentFaculty().getQualification().equals(faculty.getQualification()))
				{
					System.out.println("current faculty exp:"+department.getDepartmentFaculty().getExperienc()+":::new faculty experience"+faculty.getExperienc());
				    if(faculty.getExperienc() > department.getDepartmentFaculty().getExperienc())
				    {
				    	department.setDepartmentFaculty(faculty);
				    	System.out.println("newly faculty is ################################:"+department.getDepartmentFaculty().getName());
				    	flag = true;
				    	break;
				    }
				    else
				    {
				    	throw new ExperienceNotFoundException();
				    }
				}
				else
				{   flag = false;
					throw new QualificationNotMatched();
				}
			}
		}
	}
	else
	{
		System.out.println("#### department is Empty ###");
	}
	
	return flag;
	
}


public int getStudentCountFromState(String state)
{
	int studentCount = 0;
	for(Department department:collegeDepartment)
	{
	ArrayList< Student> currentstudentList =department.getDeparmentstudentList();
	
	System.out.println("here"+currentstudentList);
	for(Student student1 :currentstudentList)
	{
		if(student1.getState().equalsIgnoreCase(state))
		{
			studentCount++;
		}
		
		break;
	}
	}
	return studentCount;
}

}