class Outer 
{
	String A = "Java";
	String B = "2";

	public static void main(String[] args) 
	{ 
		Outer X = new Outer();  
	}
	Outer() 
	{
		Inner Y = new Inner();  
	}

	class Inner 
	{
		String A = "Certification";
		String B = "Exam";

		Inner() 
		{
			System.out.println(Outer.this.A);
			System.out.println(this.A);
			System.out.println(B);   
		}
	}
}
