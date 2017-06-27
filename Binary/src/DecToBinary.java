
public class DecToBinary 
{
	public void Binary2Decimal(int Y)
	{
		int BiNum = 111;
		int DeciNum = 0;
		int i = 1;
		int Rem;
		
		while (BiNum != 0)
		{
			Rem = BiNum % 10;
			System.out.print(Rem);
			DeciNum = DeciNum + Rem * i;
			System.out.print(DeciNum);
			i = 1 * 2;
			BiNum = BiNum / 10;
			
		}
	//	System.out.print(DeciNum);
	}
	
	
}
