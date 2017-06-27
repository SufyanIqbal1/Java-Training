
public class BankA 
{
	static int Dollar;
	static int X;
	public void setDollar(int A)
	{
		Dollar = A;
	}
	public void convertMoney (int M)
	{
		System.out.println(M * Dollar);
	}
	public void dollarRate()
	{
	System.out.println("Dollar: " + Dollar);
	}
	public static void What()
	{
		X = 15;
	}

}
