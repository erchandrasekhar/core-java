package item_management;

import java.util.ArrayList;


public class BillManagement implements Bill{
   
	/*Billing of Item according to item selected by public*/
	public Double calculateTotalPrice(ArrayList<Item> itemList)
	{
		double totalPrice = 0;
		
		if(!itemList.isEmpty() && itemList.size()>0)
		{
		
			for (Item item : itemList)
			{
			  if(item!=null)
			   {
				    if(item.isDiscountFlag()==true)
					{
						totalPrice = totalPrice + (item.getRate()*(item.getQuantity())-item.getDiscount());
						System.out.println(item.getItemName()+" This Product Have Discount Of "+item.getDiscount());
					}
					else 
					{
						totalPrice = totalPrice + (item.getRate()*(item.getQuantity()));
						System.out.println(item.getItemName()+" This Product Have No Discount ");
					}
			
			    }
			}
		}
		else
		{
			System.out.println("Empty item cannot procced for billing");
		}
		
		return totalPrice;
		
	}

	@Override
	public ArrayList<Item> displayAllItem(ArrayList<Item> itemList) {
		ArrayList<Item> itemListForReturn = new ArrayList<>();
		if(!itemList.isEmpty() && itemList.size()>0)
		{
			for (Item item : itemList) 
			{
				if(item!=null)
				{
					if(item.getQuantity()%2==0)
					{
						itemListForReturn.add(item);
					}
				}
			}
		}
			
		
		return itemListForReturn;
	}

	@Override
	public Item displayItemByCode(ArrayList<Item> itemList, int itemCode) 
	{   Item itemForReturn = new Item();
		if(!itemList.isEmpty() && itemList.size()>0)
		{
			for(Item item:itemList)
			{
				if(item!=null)
				{
				   if(item.getItemCode()==itemCode)
				   {
					   itemForReturn = item; 
				   }	
				}
			}
		}
		return itemForReturn;
	}

	@Override
	public ArrayList<Item> getNonDiscountedItems(ArrayList<Item> itemList) {
		ArrayList<Item> itemListForReturn = new ArrayList<>();
		if(!itemList.isEmpty() && itemList.size()>0)
		{
			for (Item item : itemList) 
			{
				if(item!=null)
				{
					if(item.isDiscountFlag()==false)
					{
						itemListForReturn.add(item);
					}
				}
			}
		}
			
		
		return itemListForReturn;
	}

	@Override
	public ArrayList<Item> getCostlyItemPurchased(ArrayList<Item> itemList) {
		ArrayList<Item> itemForReturn = new ArrayList<>();
		
		if(!itemList.isEmpty() && itemList.size()>0)
		{
			for (Item item : itemList) 
			{
				if(item!=null)
				{
					if(item.getRate()>1000)
					{
						itemForReturn.add(item);	
					}
				}
			}
		}
		
		return itemForReturn;
	}
	
	
}
