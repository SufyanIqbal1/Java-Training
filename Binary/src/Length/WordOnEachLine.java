package Length;

public class WordOnEachLine 
{

	public static void main(String[] args) 
	{
		String N = "LONDON IS";
		for (int A = 0; A < N.length(); A++)
		{
			if (!(N.substring(A, A+1).equals(" ")))
				
			System.out.print(N.substring(A,A+1));
			
			else
				System.out.println();
		
		}

	}
}


