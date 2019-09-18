package item_management;

import java.util.ArrayList;

public interface Bill {

	public Double calculateTotalPrice(ArrayList<Item> itemList);
	public ArrayList<Item> displayAllItem(ArrayList<Item> itemList);
	public Item displayItemByCode(ArrayList<Item> itemList,int itemCode);
	public ArrayList<Item> getNonDiscountedItems(ArrayList<Item> itemList);
	public ArrayList<Item> getCostlyItemPurchased(ArrayList<Item> itemList);
	
	
}
