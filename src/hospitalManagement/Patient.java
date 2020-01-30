package hospitalManagement;

public class Patient {

	private int patientId;
	private String patientName;
	private String address;
	private float age;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public Patient(int patientId, String patientName, String string, float age) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", address=" + address + ", age="
				+ age + "]";
	}
	
	
	
}
