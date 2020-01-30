package hospitalManagement;

public class Doctor {
 private int doctorId;
 private String doctorName;
 private int maxCount;
 private String status;
 private float yearOfExp;
 private double salary;
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public int getMaxCount() {
	return maxCount;
}
public void setMaxCount(int maxCount) {
	this.maxCount = maxCount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public float getYearOfExp() {
	return yearOfExp;
}
public void setYearOfExp(float yearOfExp) {
	this.yearOfExp = yearOfExp;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Doctor(int doctorId, String doctorName, int maxCount, String status, float yearOfExp, double salary) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.maxCount = maxCount;
	this.status = status;
	this.yearOfExp = yearOfExp;
	this.salary = salary;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", maxCount=" + maxCount + ", status="
			+ status + ", yearOfExp=" + yearOfExp + ", salary=" + salary + "]";
}
 
 
}
