
public class Lambda_Class 
{
	public static void main (String [] args)
	{
		B obj = () -> System.out.println("Hello");
		obj.show();
	}

	interface  B
	{
		void show();

	}


} 