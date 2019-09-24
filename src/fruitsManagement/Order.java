package fruitsManagement;

public class Order {

	private int orderNumber;
	private String itemCode;
	private int orderQuantity;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Order(int orderNumber, String itemCode, int orderQuantity) {
		super();
		this.orderNumber = orderNumber;
		this.itemCode = itemCode;
		this.orderQuantity = orderQuantity;
	}
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", itemCode=" + itemCode + ", orderQuantity=" + orderQuantity
				+ "]";
	}
	
	
	
}
