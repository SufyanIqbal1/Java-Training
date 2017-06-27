
public class Math5 
{
	public void Divide (int A, int B) throws MyExp
	{
		if (A < B)
		{
			MyExp E = new MyExp();
			throw E;
		}
	}

}
