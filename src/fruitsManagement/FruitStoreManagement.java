package fruitsManagement;

import java.util.ArrayList;

public class FruitStoreManagement {

	private ArrayList<Customer> customerList = new ArrayList<>();
	private ArrayList<Fruits> fruitList = new ArrayList<>();
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	public ArrayList<Fruits> getFruitList() {
		return fruitList;
	}
	public void setFruitList(ArrayList<Fruits> fruitList) {
		this.fruitList = fruitList;
	}
	@Override
	public String toString() {
		return "FruitStoreManagement [customerList=" + customerList + ", fruitList=" + fruitList + "]";
	}
	
	/*main method is start here*/
	public static void main(String[] args) throws CustomerNotFoundException 
	{
		Order order1 = new Order(1210, "100", 2);
		Order order2 = new Order(1211, "101", 3);
		
		ArrayList<Order> orderList1 = new ArrayList<>();
		ArrayList<Order> orderList2 = new ArrayList<>();
		orderList1.add(order1);
		orderList2.add(order2);
		
		Fruits fruits1 = new Fruits("ABC1", "mango", 20, 500);
		Fruits fruits2 = new Fruits("ABC2", "apple", 5, 600);
		Fruits fruits3 = new Fruits("ABC3", "banna", 10, 400);
		Fruits fruits4 = new Fruits("ABC4", "grap", 6, 300);
		ArrayList<Fruits> fruitList =new ArrayList<>();
		fruitList.add(fruits1);
		fruitList.add(fruits2);
		fruitList.add(fruits3);
		fruitList.add(fruits4);
		
		Customer customer2 = new Customer(1212, "chandra", "samastipur", "7891331023",orderList1);
		Customer customer1 = new Customer(1218, "chandra", "samastipur", "7891331023",orderList2);
		
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		FruitStoreManagement fms = new FruitStoreManagement();
		fms.setCustomerList(customerList);
		fms.setFruitList(fruitList);
		
		Order order = new Order(12111, "1011", 2);
		
		System.out.println(fms.placeOrder(1212,order));
		
		
		System.out.println(fms.getOrderList(1212));
		
		System.out.println(fms.getPriceList("ABC1", 500));
	}
	
	/*methods are start here*/
	
	public boolean placeOrder(int customerNumber,Order order) throws CustomerNotFoundException
	{
		boolean flag = false;
		int t =0;
		if(!customerList.isEmpty())
		{   
			for (Customer customer : customerList) 
			{
				if(customer!=null)
				{   
					if(customer.getCustomerNumber()==customerNumber)
					{   
						System.out.println("order quantity:::::::"+order.getOrderQuantity());
						System.out.println("fruit list size before order is::::::"+fruitList.size());
						
						if(fruitList.size() > order.getOrderQuantity())
						{    System.out.println("size before order is :"+customer.getOrderList().size());
							 customer.getOrderList().add(order);
							 System.out.println("size after order is :"+customer.getOrderList().size());
							 System.out.println(fruitList.size());
							 flag = true;
							 System.out.println("you are here ");
							 /*fruits size should reduce here*/
							 System.out.println("fruit list size After order is::::::"+fruitList.size());
							 break;
						}
						else
						{
						  System.out.println("Oder Quantity is greater than avilable quantity");	
						}
						
						
					}
					else
					{   System.out.println(customer.getCustomerNumber());
						System.out.println("here2");
						flag = false;
						t = 1;
					
					}
					
				}
			}
		}
		
		else
		{
			System.out.println("Customer List is Empty ");
		}
		
		return flag;
		
	}
	
	public ArrayList<Order> getOrderList(int customeNumber)
	{
		ArrayList<Order> ordeeList = new ArrayList<>();
		
		for (Customer c : customerList)
		{
			 if(c.getCustomerNumber()==customeNumber)
			 {   
				 ordeeList = c.getOrderList();
				 break;
			 }
			 else
			 {
				 System.out.println("customer not found");
			 }
		}
		return ordeeList;
		
	}
	
	public Fruits getPriceList(String itemCode,int pricePerKg )
	{   
		Fruits f=null;
		
		for (Fruits fruits : fruitList) 
		{
			if(fruits.getItemCode().equals(itemCode) && fruits.getPricePerKg() == pricePerKg)
			{
				f = fruits;
				break;
			}
			else
			{
				System.out.println("something wrong");
			}
		}
		return f;
	}
	
	
	
}
