package abastract_keword.method;

public abstract class Sum { 
	//abstract class declaration 
	//,abstract class can contain abstract method or regular method
	
	public abstract int sumOfTwoNumber(int n1,int n2); //this is abstract method declaration
	public abstract int sumOfThreeNumber(int n1,int n2,int n3);
	
	public void regularMethod()
	{
		System.out.println("im regular method");
	}

}
