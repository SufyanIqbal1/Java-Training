
public class BankTest 
{

	public static void main(String[] args) 
	{
		Bank HSBC, Natwest;
		
		HSBC = new Bank();
		Natwest = new Bank();
		
		HSBC.setDollar(1);
		Natwest.dollarRate();
		Natwest.setDollar(1);
		HSBC.convertMoney(100);
		Natwest.convertMoney(100);

	}



}
