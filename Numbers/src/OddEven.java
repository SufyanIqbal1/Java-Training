
public class OddEven 
{
	public void number ()
	{
		int A;
		for (A = 1; A < 10; A++)
		{
			System.out.println(A);
			if (A % 2 == 0)
		{
			System.out.println("Even");
			
			if (A > 5)
			{
				System.out.println("-");
			}
			else 
			{
				System.out.println("*");
			}
			
		}
		else 
		{
			System.out.println("Odd");
			if (A > 5)
			{
				System.out.println("!");
			}
			else 
			{
				System.out.println("?");
			}
		}
		}
	}
	
	public void nestedLoop ()
	{
		int A, B;
		A = 1;
		
		for (A=1; A <=10; A++)
		{
		//	{
		//		System.out.println(A);
		//	}
			for (B=1; B <=10; B++ )
			{
				System.out.println(B);	
			}
		}	
	}
	public void nestedLoopEvenOdd ()
			{
				
				for (int A=1; A <=10; A++)
				{
					if (A % 2 ==0)
					{
						System.out.println(A);
					}
					else 
					{
						for (int B=1; B <= A; B++ )	
						{
							System.out.print(B);	
						}
							System.out.println();
					}
		}
		
	}

}
