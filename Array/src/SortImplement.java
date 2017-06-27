
public class SortImplement implements SortIt
{

	@Override
	public void sort(int[] Num) 
	{
		int max = Num [0];
		int min = Num [0];
		
		for (int i = 1; i < Num.length; i++)
		{
			if (Num [i] > max)
				max = Num[i];
			else if (Num[i] < min)
				min = Num[i];
		}
		System.out.println("Max Number: " + max);
		System.out.println("Min Number: " + min);
	}

}
