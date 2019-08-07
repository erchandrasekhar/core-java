package day4;

import java.util.ArrayList;

public class AccountDemo {

	public static void main(String[] args) 
	{
		
		ArrayList<Account> accountList=new ArrayList<>();
		Account a1=new Account(100, "saving", 500000, 1);
		Account a2=new Account(101, "current", 500000, 2);
		Account a3=new Account(102, "saving", 500000, 1);
		Account a4=new Account(103, "saving", 500000, 1);
		Account a5=new Account(104, "saving", 500000, 1);
		accountList.add(a1);
		accountList.add(a2);
		accountList.add(a3);
		accountList.add(a4);
		accountList.add(a5);
		/*System.out.println(searchAccountByNumber(accountList, 102));*/
		
		Account a=new Account(14400, "saving", 500000, 1);
		
		System.out.println(replaceAccountByNumber(accountList,a));
	}
	
	public static int searchAccountByNumber(ArrayList<Account> objList,int number)
	{
		int i=-1;
		for (Account account : objList) 
		{
			if(account.getNumber()==number)
			{
				i=objList.indexOf(account);
			
				
				
			}
		}
		return i;
		
	}
	
	public static boolean replaceAccountByNumber(ArrayList<Account> acList,Account c)
	{
		boolean flag=false;
		for (Account account : acList)
		{
			if(account.getNumber()==c.getNumber())
			{
				account=c;
				flag=true;
				
			}
		}
		return flag;
	}
}
