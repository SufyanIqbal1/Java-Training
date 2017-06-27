
public class ASCII 
{
	public void Binary()
	{
		String Ans = "";
		int Num = 256;
		int Rem = 0;
		
		while (Num >= 2)
		{
			Rem = Num % 2;
			Num = Num / 2;
			Ans = Rem + Ans ;
		}
		
			Ans = Num + Ans;
			System.out.println(Ans);
			
	}
	

}
