
public class printNumbers {

	public static void main(String[] args) {
		Words W = new Words();
		int Num = 1100;
		
		System.out.println("Digit: " +Num);
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
		
		System.out.println(word);
	}

}
