
public class errorHandling 
{
	public static void main(String [] args)
	{
		try{
			
			int Array[] = new int[4];
			Array[5]= 5;
			int C = 50/8;
			
			
			System.out.println(C);
		}
		
		catch(ArithmeticException X)
		{
			System.out.println("Warning: ArithmeticException");
		}
		
		catch(ArrayIndexOutOfBoundsException Y)
		{
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception Z)
		{
			System.out.println("Warning: Some Other exception");
		}
		
	}
}

