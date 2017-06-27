package Length;

public class PrintNumberofWords {

	public static void main(String[] args) 
	{
		String N = "LONDON IS";
		int Spaces = 1;
		for (int A = 0; A < N.length(); A++)
		{
			String M = N.substring(A, A+1);
			if (M.equals(" "))
					Spaces ++;
		}
		System.out.println(Spaces + " : Words");

	}

}
