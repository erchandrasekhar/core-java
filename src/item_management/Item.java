package item_management;

public class Item {

	private int itemCode;
	private String itemName;
	private int quantity;
	private boolean discountFlag;
	private double discount;
	private double totalPrice;
	private double rate;
	
	
	public Item(int itemCode, String itemName, int quantity, boolean discountFlag, double totalPrice,double rate,double discount) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.discountFlag = discountFlag;
		this.totalPrice = totalPrice;
		this.rate = rate;
		this.discount = discount;
	}
	

	public Item() {
		// TODO Auto-generated constructor stub
	}


	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isDiscountFlag() {
		return discountFlag;
	}

	public void setDiscountFlag(boolean discountFlag) {
		this.discountFlag = discountFlag;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", discountFlag="
				+ discountFlag + ", discount=" + discount + ", totalPrice=" + totalPrice + ", rate=" + rate + "]";
	}
	
	
}
