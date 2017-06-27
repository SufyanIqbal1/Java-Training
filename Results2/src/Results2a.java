
public class Results2a
{
	private int phy, che, mat, total;
	private float per;
	private int invalid;
	private int modulesFailed;
	
	public void showResults()
	{
		if (invalid != 1)
		{	
			System.out.println("Total Score: "+ total + "/450");
			System.out.println("Percentage: "+ per+" %");
			if (modulesFailed == 1)
			{
				System.out.println("Retake the Exam");
			}
			else if (modulesFailed == 2)
			{
				System.out.println("Repeat the Course");
			}
			else if	(modulesFailed == 3)
			{
				System.out.println("Go Home");
			}

		}
	}
	
	public void physics (int A)
	{
		if (A >= 0 && A <= 150)
			{
				phy = A;
				if (A < 70)
					{
						System.out.println("Failed Physics");
						modulesFailed ++;
					}
			}
		else
		{
			System.out.println("Incorrect Score for Physics, Please Correct the Score");
			invalid = 1;
		}
		
	}
	
	public void chemistry (int B)
	{
		if (B >= 0 && B <= 150)
			{
				che = B;
				if (B < 70)
				{
					System.out.println("Failed Chemistry");
					modulesFailed ++;
				}
			}
		else
		{
			System.out.println("Incorrect Score for Chemistry, Please Correct the Score");
			invalid = 1;
		} 
	}
	
	public void maths (int C)
	{
		if (C >= 0 && C <= 150)
			{
				mat = C;
				if (C < 70)
				{
					System.out.println("Failed Maths");
					modulesFailed ++;
				}
			}
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
