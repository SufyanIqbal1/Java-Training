
public class Test {

	public static void main(String[] args) {
		One X;
		
		X = new One();
		
		X.A = 15;
		X.B = 24;
		X.C = X.A + X.B;
		System.out.println(X.C);
		X.message();
	}

}