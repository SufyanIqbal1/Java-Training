package Length;

public class WordOnEachLineReverse 
{

	public static void main(String[] args) 
	{
		String N = "London Is Big";
		String Rev = "";
		for (int A = N.length() - 1; A >= 0; A--)
		{
			if (!(N.substring(A, A+1).equals(" ")))
			{
				Rev = N.substring(A, A+1) + Rev;
			}
			
			else
			{
					System.out.print(Rev);
					Rev = "";
					System.out.print(N.substring(A,A+1));
				
			}
				
		}
		System.out.print(Rev);
	}
}
