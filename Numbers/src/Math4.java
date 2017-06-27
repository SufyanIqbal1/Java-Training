
public class Math4 
{
	public void timestable(int A, int B)
	{
		System.out.println( A + " - Times Table");
		System.out.println( "==================");
		for (int X=1; X <= B; X++)
		{
			int answer = A * X;
			System.out.println(" " + A + " X " + X + " = " +answer);
			 
		}
	}
}
