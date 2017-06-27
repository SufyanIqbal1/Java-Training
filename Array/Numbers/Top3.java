public class Top3 
{
	int [] IntArray = new int[20];

	public static void main(String[] args) 
	{

		int [] IntArray = {5, 15, 32, 45, 77, 180, 90, 34, 44, 180, 60, 23, 56};
		int max1 = IntArray [0];
		int max2 = IntArray [0];
		int max3 = IntArray [0];


		for (int i = 1; i < IntArray.length; i++)
		{
			if (IntArray [i] > max1)
			{
				max2 = max1;
				max1 = IntArray [i];
			}

			if (IntArray [i] > max2 && IntArray [i] < max1)
			{
				max3 = max2;
				max2 = IntArray [i];
			}

			if (IntArray [i] > max3 && IntArray [i] < max2)
			{
				max3 = IntArray [i];
			}

		}
		System.out.println("1st Highest Number: " + max1);
		System.out.println("2nd Highest Number: " + max2);
		System.out.println("3nd Highest Number: " + max3);
	}
}
