package day3;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c[]=new Customer[5];
		c[0]=new Customer(100, "chandrasekhar", "16/041993", 40000, "chandra@gmail.com", 26);
		c[1]=new Customer(101, "parag", "16/041993", 40002, "chandra@gmail.com", 26);
		c[2]=new Customer(102, "sandeep", "16/041993", 40500, "chandra@gmail.com", 26);
		c[3]=new Customer(103, "avishek", "16/041993", 40060, "chandra@gmail.com", 26);
		c[4]=new Customer(104, "vikash", "16/041993", 40800, "chandra@gmail.com", 26);
		
		Customer cust=new Customer(10555, "vikash", "16/041993", 40800, "chandra@gmail.com", 26);
		
		/*System.out.println(searchCustomerById(c, 10088));
*/
	
		/*System.out.println(replaceCustomerById(c, cust));*/
		
		Customer[] cccc=searchCustomerByName(c, "parag");
		for (int i = 0; i < cccc.length; i++) {
			System.out.println(cccc);
		}
	
	}
	
	public static int searchCustomerById(Customer[] objArray, int id){
		int returnData =-1;
		
		for (int i = 0; i < objArray.length; i++) 
		{
			if(objArray[i].getId()==id)
			{
				returnData=1;
				
			}
			
			
		}
		
	
		return returnData;
		
		
		
	}
	
	
	public static boolean replaceCustomerById(Customer[] objArray,Customer c)
	{
		boolean  flag=false;
		for (int i = 0; i < objArray.length; i++) 
		{
			
			if(objArray[i].getId()==c.getId())
			{
		
			   objArray[i]=c;
			   flag=true;
			}
		}
		
		return flag;
	}
	
	public static Customer[] searchCustomerByName(Customer[] objCustomer,String name){
		
		Customer c[]=null;
		for (int i = 0; i < objCustomer.length; i++) 
		{
			
			if(objCustomer[i].getName().equals(name))
			{
				c=objCustomer;
				
			}
		}
		return c;
	}
	

	
}
