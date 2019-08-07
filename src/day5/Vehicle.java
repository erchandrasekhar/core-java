package day5;

public class Vehicle {
	
	private int number;

	private String  name;

	private double  price;

	private Customer  custDetails;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(Customer custDetails) {
		this.custDetails = custDetails;
	}

	public Vehicle(int number, String name, double price, Customer custDetails) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.custDetails = custDetails;
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", name=" + name + ", price=" + price + ", custDetails=" + custDetails
				+ "]";
	}
	
	
	
	public  boolean subtractCustomerSalary(double salary) throws NegativeValueException
	{
		boolean  flage=false;
	
		if(custDetails.getSalary()-salary>0)
		{
			flage=true;
		}
		else
		{
		 throw new NegativeValueException();	
		}
		
		return flage;
		
	} 

	
	
}
