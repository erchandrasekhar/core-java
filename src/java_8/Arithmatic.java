package java_8;

public class Arithmatic {
	
	public static void main(String[] args) {
		
		FunctionalInterface_Arithmatic addition = (int a, int b) -> a+b;
		
		
		FunctionalInterface_Arithmatic substration = (int a,int b) ->{
			return a-b;
		};
		
		System.out.println(substration.opration(45, 5));
		
	}

}
