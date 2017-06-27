
public class Test 
{

	public static void main(String[] args) 
	{
		Bank HSBC, Barclays, Natwest, Lloyds;
		
		HSBC = Bank.XYZ();
		Barclays = Bank.XYZ();
		Natwest = Bank.XYZ();
		Lloyds = Bank.XYZ();
		
		
		HSBC.A = 75;
		System.out.println("=== HSBC ===");
		System.out.println(HSBC.A);
		HSBC.convertMoney(100);
		HSBC.setDollar(50);
		
		
		Natwest.A = 50;
		System.out.println("=== Natwest ===");
		System.out.println(Natwest.A);
		Natwest.convertMoney(100);
		Natwest.setDollar(10);
		

		Barclays.A = 20;
		System.out.println("=== Barclays ===");	
		System.out.println(Barclays.A);
		Barclays.convertMoney(100);
		Barclays.setDollar(25);
	
		
		Lloyds.A = 10;
		System.out.println("=== Lloyds ===");
		System.out.println(Lloyds.A);
		Lloyds.convertMoney(100);
		Lloyds.setDollar(30);
		
	}

}
