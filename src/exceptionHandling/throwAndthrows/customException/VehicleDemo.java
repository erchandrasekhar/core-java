package exceptionHandling.throwAndthrows.customException;

public class VehicleDemo {
	
	
	
	public static void main(String[] args) throws NoNumberFoundException 
	{
		Vehicle []v = new Vehicle[4];
		v[0] = new Vehicle(100, "alto", 5000000);
		v[1] = new Vehicle(200, "maruti", 60000);
		v[2] = new Vehicle(300, "safari", 5000004);
		v[3] = new Vehicle(400, "tata nano", 2500000);
		
		Vehicle vv = new Vehicle(555, "new vehicle", 54444444);
		System.out.println(replaceVehicleByNumber(v, vv));
		
	
	}

	public static boolean replaceVehicleByNumber(Vehicle v[] ,Vehicle vv) throws NoNumberFoundException 
	{
       boolean flag = false;
       int t = 1;
       for(int i = 0; i < v.length; i++)
       {
         if(v[i].getNumber() == vv.getNumber())
         {
        	 v[i] = vv;
          flag = true;
          t =t+1; 
         }
        
       }
       
       System.out.println("################ New Vehicle List ###############");
       for (int i = 0; i < v.length; i++) 
       {
		 System.out.println(v[i]);
	   }
       
       if(t==1)
       {
    	  throw new NoNumberFoundException(vv.getNumber());
       }
       
       
	return flag;
      
	}

}
