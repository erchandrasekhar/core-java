package fruitsManagement;

public class Fruits {

	private String itemCode;
	private String name;
	private int availableQuantity;
	private int pricePerKg;
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public float getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public Fruits(String itemCode, String name, int availableQuantity, int pricePerKg) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.pricePerKg = pricePerKg;
	}
	@Override
	public String toString() {
		return "Fruits [itemCode=" + itemCode + ", name=" + name + ", availableQuantity=" + availableQuantity
				+ ", pricePerKg=" + pricePerKg + "]";
	}
	
	

}


