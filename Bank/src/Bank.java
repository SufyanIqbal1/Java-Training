
public class Bank 
{
	int A;
	static int count = 0;
	static Bank R;

	public void MSG()
	{
		System.out.println("Hello");
	}

	private Bank()
	{

	}

	public static Bank XYZ ()
	{
		if (count < 4)
		{
			R = new Bank();
			count = count +1;
			return R;
		}
		else
			System.out.println("Can't Create More!");
		return null;
	}

	static int Dollar;

	static
	{
		Dollar = 10 + 1 +15;
	}

	public void setDollar(int A)
	{
		Dollar = A;
		System.out.println("New Dollar Rate - $: " + A);
	}

	public void convertMoney(int A)
	{
		System.out.println("Converted Money: " + Dollar * A);
	}


}
