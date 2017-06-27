import java.util.Arrays;

public class ArrayTest 
{
	static int [] IntArray = new int[3];

	public static void main(String[] args) 
	{
		
		int [] IntArray = {47, 2, 34}; // ... Or Like this
		
		for (int i = 0; i < IntArray.length; i++)
		{
			System.out.println(i + "-" + IntArray[i]); 
		}
		
		Arrays.sort(IntArray);
		System.out.println();
		
		for (int i = 0; i < IntArray.length; i++)
		{
			System.out.println(i + "-" + IntArray[i] );
			System.out.println();
		}
		System.out.println("Min: " + IntArray[0]);
		System.out.println("Max: " + IntArray[2]);

	}

}
