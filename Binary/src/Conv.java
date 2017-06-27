
public class Conv {

	public static void main(String[] args) 
	{
		int BiNum = 1110;
		int DeciNum = 0;
		int i = 1;
		int Rem;
		
		while (BiNum != 0)
		{
			Rem = BiNum % 10;
			DeciNum = DeciNum + Rem*i;
			i = 1 * 2;
			BiNum = BiNum / 10;
			
		}
		System.out.println(DeciNum);

	}

}
