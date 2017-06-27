
public class Results2 
{
	private int phy, che, mat, total;
	private float per;
	private int invalid;
	
	public void showResults()
	{
		if (invalid != 1)
		{
			System.out.println("Total Score: "+ total + "/450");
			System.out.println("Percentage: "+ per+" %");
			
		}

	}
	
	public void physics (int A)
	{
		if (A >= 0 && A <= 150)
			phy = A;
		else
		{
			System.out.println("Incorrect Score for Physics, Please Correct the Score");
			invalid = 1;
		}
	}
	
	public void chemistry (int B)
	{
		if (B >= 0 && B <= 150)
			che = B;
		else
		{
			System.out.println("Incorrect Score for Chemistry, Please Correct the Score");
			invalid = 1;
		}
	}
	
	public void maths (int C)
	{
		if (C >= 0 && C <= 150)
			mat = C;
		else
		{
			System.out.println("Incorrect Score for Maths, Please Correct the Score");
			invalid = 1;
		}
		
	}
	
	public void calculation ()
	{
			total = phy + che + mat;
			per = (float) total * 100/450;
	}

}
