
public class Range 
{

	public static void main(String[] args) 
	{
		int min = 10;
		int max = 15;
		
		for(int i = min; i <= max; i++) {
			System.out.println(i+ ": " + convertToWord(i));
		}
		
	}
		
	public static String  convertToWord(int Num)
	{
		Words W = new Words();
		//System.out.println("Digit: " +Num);
		String word = "";
		
		
		if (Num >= 1000)
		{
			word += W.Ones (Num/1000) + "Thousand";
			Num = Num - (Num / 1000*1000);
		}
		
		if (Num >= 100)
		{
			word += W.Ones (Num/100) + "Hundred";
			Num = Num - (Num / 100 * 100);
		}
		
		if (Num >= 20)
		{
		
			word += W.Ty (Num/10*10);
			Num = Num - (Num / 10 * 10);
		}
		
		if (Num >= 1)
		{
			word += W.Ones (Num);
		}
		
		return word;
	}

}

