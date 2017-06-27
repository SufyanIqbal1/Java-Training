	import java.awt.*;


public class Window 
{

	public static void main(String[] args) 
	{
		Frame Win = new Frame ("Windows XP");
		
		TextField T1 = new TextField(10);
		TextField T2 = new TextField(10);
		TextField T3 = new TextField(10);
		
		Button B1 = new Button(" = ");
		
		Event3 E = new Event3 (T1, T2, T3);
		
		FlowLayout FL = new FlowLayout();
		B1.addActionListener(E);
		
		Win.setLayout(FL);
		
		Win.add(new Label("Number 1: "));
		Win.add(T1);
		Win.add(new Label("    +"));
		Win.add(new Label("Number 2: "));
		
		Win.add(T2);
		Win.add(B1);
		Win.add(T3);
		
		Win.setSize(600, 100);
		Win.setVisible(true);

	}

}
