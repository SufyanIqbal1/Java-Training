//member class
public class InnerDemo 
{
	public static void main (String [] args)
	{
		A a = new A();
		A.B obj = a.new B();
		obj.show();
	}

}

class A
{
	int rollNum;
	String Name;

	class B
	{
		public void show()

		{
			System.out.println("Hello");
		}
	}
}