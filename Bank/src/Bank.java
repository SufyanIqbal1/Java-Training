
public class Bank 
{
	static int Dollar;
	int A;
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

}
