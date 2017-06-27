
public class modulus {

	public static void main(String[] args) {
		int Num, No1, No2, No3, No4;
		Num = 736;
		
		No1 = Num / 100;
		//System.out.println(No1);
		
		No2 = Num % 100;
		//System.out.println(No2);
		
		No3 = No2 / 10;
		//System.out.println(No3);
		
		No4 = No2 % 10;
		//System.out.println(No4);
		
		System.out.println(No1 + No3 + No4);

	}

}
