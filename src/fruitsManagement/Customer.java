package fruitsManagement;

import java.util.ArrayList;

public class Customer {

	private int customerNumber;
	private String customerName;
	private String address;
	private String mobileNumber;
	private ArrayList<Order> orderList = new ArrayList<>();
	
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}
	
	
	public Customer(int customerNumber, String customerName, String address, String mobileNumber,
			ArrayList<Order> orderList) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", orderList=" + orderList + "]";
	}
	
	
}
