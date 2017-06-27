
public class BTestA 
{

	public static void main(String[] args) 
	{
		BankA HSBC, Natwest;
		
		HSBC = new BankA();
		Natwest = new BankA();
		
		HSBC.setDollar(1);
		Natwest.dollarRate();
		Natwest.setDollar(1);
		HSBC.convertMoney(100);
		Natwest.convertMoney(100);
	}

}
