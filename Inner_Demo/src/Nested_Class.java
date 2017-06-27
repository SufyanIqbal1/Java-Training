
public class Nested_Class 
{
	public static void main (String [] args)
	{
		A1.B obj = new A1.B();
		obj.show();
	}

}

class A1
{
	int rollNum;
	String Name;

	static class B
	{
		public void show()

		{
			System.out.println("Hello A1");
		}
	}
}