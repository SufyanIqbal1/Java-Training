
public class Annonymous_Class 
{
	public static void main (String [] args)
	{
		B obj = new B()
		{
			public void show()

			{
				System.out.println("Hi");
			}
		};
		obj.show();
	}

}

class B
{
	public void show()

	{
		System.out.println("Hello B2");
	}

}