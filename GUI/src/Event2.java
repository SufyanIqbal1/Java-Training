import java.awt.*;
import java.awt.event.*;

public class Event2 implements ActionListener
{
	TextField X;
	
	public Event2 (TextField T)
	{
		X = T;
	}
	
	public void actionPerformed (ActionEvent T)
	{
		X.setText("Hello");
	}

}
