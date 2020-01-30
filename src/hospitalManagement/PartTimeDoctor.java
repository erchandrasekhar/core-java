package hospitalManagement;

public class PartTimeDoctor extends Doctor{
  public PartTimeDoctor(int doctorId, String doctorName, int maxCount, String status, float yearOfExp,
			double salary) {
		super(doctorId, doctorName, maxCount, status, yearOfExp, salary);
		// TODO Auto-generated constructor stub
	}

private int getNoOfDay;

public int getGetNoOfDay() {
	return getNoOfDay;
}

public void setGetNoOfDay(int getNoOfDay) {
	this.getNoOfDay = getNoOfDay;
}

}
