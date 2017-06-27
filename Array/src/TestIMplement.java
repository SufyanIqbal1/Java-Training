
public class TestIMplement 
{

	public static void main(String[] args) 
	{
		int [] Num = new int[] {47, 2, 34};
		
		SortImplement X = new SortImplement();
		
		if (X instanceof SortImplement)
			X.sort(Num);
		else
			System.out.println("Not Part of Sortable");

	}

}
