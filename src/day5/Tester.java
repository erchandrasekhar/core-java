package day5;

public class Tester {

	public static void main(String[] args) throws NegativeValueException {
		
		   Customer c1=new Customer(1, "n1", "d1", 5000, "E@gmail.com", 20);
		   Customer c2=new Customer(2, "n2", "d2", 2500, "N@gmail", 21);
		    Vehicle v=new Vehicle(101, "v1", 200550, c1);
		    
		    System.out.println(v.subtractCustomerSalary(20888880));
}
}
