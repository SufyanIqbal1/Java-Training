
public class cashChange {

	public static void main(String[] args) {
		double Bill, Cash, Change;
		int Cash50, Cash20, Cash10, Cash5, Cash2, Cash1, Cash050, Cash020, Cash010, Cash05, Cash02;
		double Cash01;
		Bill = 0.01;
		Cash = 1;
		
		Change = Cash - Bill;
		System.out.println("Change To Give: " + "£" + Change);
		
		if (Change >= 50)
		{
			Cash50 = (int) (Change / 50);
			Change = Change - (Cash50 * 50);
			System.out.println(Change);
			System.out.println("£50:" + Cash50);
		}
		
		if (Change >= 20)
			
		{
			Cash20 = (int) (Change / 20);
			Change = Change - (Cash20 * 20);
			System.out.println("£20:" + Cash20);
		}
		
		if (Change >= 10)
		{
			Cash10 = (int) (Change / 10);
			Change = Change - (Cash10 * 10);
			System.out.println("£10:" + Cash10);
		}
		
		if (Change >= 5)
		{
			Cash5 = (int) (Change / 5);
			Change = Change - (Cash5 * 5);
			System.out.println("£5:" + Cash5);
		}
		
		if (Change >= 2)
		{
			Cash02 = (int) (Change / 2);
			Change = Change - (Cash02 * 2);
			System.out.println("£0.20:" + Cash02);
		}
		
		if (Change >= 1)
		{
			Cash1 = (int) (Change / 1);
			Change = Change - (Cash1 * 1);
			System.out.println("£1:" + Cash1);
		}
		
		if (Change >= 0.50)
		{
			Cash050 = (int) (Change / 0.5);
			Change = Change - (Cash050 * 0.5);
			System.out.println("£0.50:" + Cash050);
		}
		
		if (Change >= 0.20)
		{
			Cash020 = (int) (Change / 0.2);
			Change = Change - (Cash020 * 0.20);
			System.out.println("£0.20:" + Cash020);
		}
		
		if (Change >= 0.10)
		{
			Cash010 = (int) (Change / 0.1);
			Change = Change - (Cash010 * 0.1);
			System.out.println("£0.10:" + Cash010);
		}
		
		if (Change >= 0.05)
		{
			Cash05 = (int) (Change / 0.05);
			Change = Change - (Cash05 * 0.05);
			System.out.println("£0.05:" + Cash05);
		}
		
		if (Change >= 0.02)
		{
			Cash02 = (int) (Change / 0.02);
			Change = Change - (Cash02 * 0.02);
			System.out.println("£0.02:" + Cash02);
		}
		
		if (Change >= 0.01)
		{
			Cash01 = (int) (Change / 0.01);
			Change = Change - (Cash01 * 0.01);
			System.out.println("£0.01:" + (int) Cash01);
		}

	}

}
