package item_management;

import java.util.ArrayList;

public class BillDemo {

	public static void main(String[] args) 
	{
		Item item1 = new Item(1210917, "mobile", 2, true, 0, 1000, 100);
		Item item2 = new Item(1210919, "laptop", 1, false, 0, 5000, 0);
		Item item3 = new Item(12105917, "chair", 3, false, 0, 1000, 100);
		Item item4 = new Item(12109157, "table", 1, true, 0, 5555, 50);
		Item item5 = new Item(12109175, "bag", 2, true, 0, 1000, 100);
		
		ArrayList<Item> itemList = new ArrayList<>();
		
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);
		
		
		BillManagement bm = new BillManagement();
		
		Double totalPrice = bm.calculateTotalPrice(itemList);
		
		System.out.println("############## TotalPrice Of The Items Selected By Consumer  ###########");
		System.out.println("totalPric of the two product is:"+totalPrice);
		
		System.out.println("############## List of Item Whoes Quantity Divizible by 2 ###########");
		ArrayList<Item> list = bm.displayAllItem(itemList);
		for (Item item : list) 
		{
			System.out.println(item);
		}
		
		
		System.out.println("############## ###########Get Item By Item ItemCode ###############################");
		
		System.out.println(bm.displayItemByCode(itemList, 1210917));
		
		System.out.println("############## ###########Get getNonDiscountedItems List ###############################");
		ArrayList<Item> list1 = bm.getNonDiscountedItems(itemList);
		for (Item item : list1) 
		{
			System.out.println(item);
		}
		
		System.out.println("################################# Item which Rate is grater than 1000 ###############################");
		
		System.out.println(bm.getCostlyItemPurchased(itemList));
	}
}
