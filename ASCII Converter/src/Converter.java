
public class Converter {
	
	public void ASCII (String S)
	{
		System.out.println(S);
		char Ch1 = ' ';
		char Ch2 = ' ';
		
		for (int A = 0; A <S.length(); A++)
		{
			Ch1 = S.charAt(A);
			if ((int) Ch1 >= 97 && (int) Ch1 <= 122)
			{
				int Num = (int) Ch1 - 32;
				Ch2 = (char) Num;						//Lower case
				System.out.print(Ch2);
			}
			
			else if ((int) Ch1 >= 65 && (int) Ch1 <= 90)
			{
				int Num = (int) Ch1 + 32;
				Ch2 = (char) Num;						//Upper Case
				System.out.print(Ch2);
			}
			
			else if ((int) Ch1 >= 48 && (int) Ch1 <= 57)
			{
				int Num = (Character.getNumericValue((int)Ch1))*2;					//Numbers
				System.out.print(Num);
			}
			
			else 
			{
				System.out.print(Ch1);
			}
				
		}
	}
}

