package hospitalManagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {

	private int hospitalId;
	private String hospitalName;
	private ArrayList<Patient> patientList;
	private List<Doctor> doctorList;
	public HospitalManagement(int hospitalId, String hospitalName, ArrayList<Patient> patientList,
			List<Doctor> doctorList) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.patientList = patientList;
		this.doctorList = doctorList;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public ArrayList<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(ArrayList<Patient> patientList) {
		this.patientList = patientList;
	}
	public List<Doctor> getDoctorList() {
		return doctorList;
	}
	public void setDoctorList(ArrayList<Doctor> doctorList) {
		this.doctorList = doctorList;
	}
	
	
	// add patient to patient list 
	public int addPatient(Patient p)
	{  int t = 1;
		for (Patient patient : patientList) 
		{
			if(patient!=null)
			{
				if(patient.getPatientId()==p.getPatientId())
				{
					t =0;
				}
			}
		}
	
	
		if(t==1)
		{   
			System.out.println("######### patient List before add ##########");
			System.out.println(patientList);
			patientList.add(p);
			System.out.println("This Patient is add:"+p);
			
			System.out.println("######### patient List After add ##########");
			System.out.println(patientList);
		}
		return t;
	}
	// add doctor to doctor list
	
	public boolean addDoctor(Doctor d){
		boolean flag = true;
		try {
			
			
			
			for (Doctor doctor : doctorList) 
			{
				if(doctor.getDoctorId()==d.getDoctorId()){
					flag = false;
				}
			}
			if(flag == true){
			doctorList.add(d);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
}
