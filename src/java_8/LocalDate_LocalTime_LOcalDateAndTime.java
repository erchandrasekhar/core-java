package java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate_LocalTime_LOcalDateAndTime {

	public static void main(String []args){
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate java 8 inhancement:"+localDate);
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDateTime);
	}
}
