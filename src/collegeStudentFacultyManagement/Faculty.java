package collegeStudentFacultyManagement;

public class Faculty extends Person{

	private String qualification;
	private double experienc;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getExperienc() {
		return experienc;
	}
	public void setExperienc(double experienc) {
		this.experienc = experienc;
	}
	public Faculty(String name, String gender, String state, String qualification, double experienc) {
		super(name, gender, state);
		this.qualification = qualification;
		this.experienc = experienc;
	}
	@Override
	public String toString() {
		return "Faculty [qualification=" + qualification + ", experienc=" + experienc + "]";
	}
	
	
}
