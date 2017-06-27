
public class Exam 
{
	int Phy, Che, Mat;
	float Total, Percent;
	
	public void Calculate ()
	{
		Total = Phy + Che + Mat;
		Percent = Total * 100 / 450;  
	}
	
	public void ShowResult()
	{
		System.out.println("Total: " + Total);
		System.out.println("Pecentage: " + Percent);
	}

}
