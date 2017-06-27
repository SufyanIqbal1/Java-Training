
public class Division 
{

	public static void main(String[] args) 
	{
		int A, B, C;
		A = B = C = 0;

		try 
		{
			A = Integer.parseInt(args[0]);
			A = Integer.parseInt(args[1]);
			C = A/B;
			System.out.println(C);
		}
		
		catch(NumberFormatException X)
		{
			System.out.println("Warning: Only Numeric Values");
		}

		catch(ArithmeticException X)
		{
			System.out.println("Warning: Can Not Divide By 0");
		}

		catch(ArrayIndexOutOfBoundsException Y)
		{
			System.out.println("Warning: Insert 2 Values");
		}

		catch(Exception Z)
		{
			System.out.println("Warning: Some Is Completley Wrong");
		}

	}

}
