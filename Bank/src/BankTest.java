
public class BankTest 
{

	public static void main(String[] args) 
	{
		Bank HSBC, Natwest;
		
		HSBC = New Bank();
		Natwest = New Bank();
		
		HSBC.setDollar(95);
		Natwest.dollarRate();
		Natwest.setDollar(96);
		HSBC.convertMoney(100);
		Natwest.convertMoney(100);

	}


}
