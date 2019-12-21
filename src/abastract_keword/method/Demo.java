package abastract_keword.method;

public class Demo extends Sum{

	@Override
	public int sumOfTwoNumber(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@Override
	public int sumOfThreeNumber(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		return n1 + n2 + n3;
	}
	
	public static void main(String[] args)
	{
		Sum s = new Demo();
		System.out.println(s.sumOfThreeNumber(12, 12, 12));
		System.out.println(s.sumOfTwoNumber(12, 12));
		s.regularMethod();
	}

}
