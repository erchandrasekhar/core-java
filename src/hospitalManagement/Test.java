package hospitalManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Patient p1 = new Patient(100, "chandra", "spj", 25);
		Patient p2 = new Patient(101, "chandra", "spj", 25);
		Patient p3 = new Patient(102, "chandra", "spj", 25);
		Patient p4 = new Patient(103, "chandra", "spj", 25);
		
		ArrayList<Patient> pList = new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		
		List<Doctor> dList = Arrays.asList(new Doctor(200, "bb jha", 20, "y", 60, 500000),
				new Doctor(201, "npk kumar", 25, "y", 50, 40000));
		
		HospitalManagement hm = new HospitalManagement(1, "apollo", pList,  dList);
		int t = hm.addPatient(new Patient(105, "chandrasekhar yadav","spj",25));
		System.out.println(t);
		Doctor dd = new Doctor(55, "sds", 20, "y", 20, 52);
		boolean result = hm.addDoctor(dd);
		System.out.println(result);
		
	}
}
