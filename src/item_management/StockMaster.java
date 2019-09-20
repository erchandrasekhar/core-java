package item_management;

public class StockMaster {

	private int stockId;
	private Item item;
	private int itemQuantity;
	public StockMaster(int stockId, Item item, int itemQuantity) {
		super();
		this.stockId = stockId;
		this.item = item;
		this.itemQuantity = itemQuantity;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
