package day5;

public class VehicleDemo {
	
	public static void main(String[] args) throws NoNumberFoundException 
	{
		Customer c=new Customer(4444, "chandrasekhar yadav", "20/12/2019", 5000, "chandra@gmail.com", 26);
		Vehicle vv=new Vehicle(100, "tvs", 500000, c);
		
		Vehicle v[]=new Vehicle[5];
		
	     v[0]=new Vehicle(100, "tvs", 500000, c);
		 v[1]=new Vehicle(1030, "tvs", 500000, c);
		 v[2]=new Vehicle(10330, "tvs", 500000, c);
		 v[3]=new Vehicle(1040, "tvs", 500000, c);
		 v[4]=new Vehicle(1600, "tvs", 500000, c);
		
		System.out.println(replaceVehicleByNumber(v, vv));
		
		
	}
	
	
	public static boolean replaceVehicleByNumber(Vehicle []objVehicle,Vehicle v) throws NoNumberFoundException{
		boolean flag=false;
		int t=0;
		
		for (int i = 0; i < objVehicle.length; i++) 
		{
			if(objVehicle[i].getNumber()==v.getNumber())
			{
				t=0;
				objVehicle[i]=v;
				
				
				
			}
		}
		
		if(t==1)
		{
			flag=true;
		}
		else
		{   flag=false;
			throw new NoNumberFoundException();
			
		}
		return flag;
	}

}
