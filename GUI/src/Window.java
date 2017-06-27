import java.awt.*;

public class Window 
{

	public static void main(String[] args) 
	{
		Frame Win = new Frame ();
		
		TextField T1 = new TextField();
		Button B1 = new Button("CLICK");
		Event2 E = new Event2(T1);
		B1.addActionListener(E);
		Win.add(T1, BorderLayout.NORTH);
		Win.add(B1, BorderLayout.CENTER);
		Win.setSize(300, 500);
		Win.setVisible(true);

	}

}
