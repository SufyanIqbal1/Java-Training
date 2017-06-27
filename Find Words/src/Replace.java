
public class Replace 
{

	public static String Replace(String OldWord, String NewWord, String Input )
	{
	
	OldWord = "Hello How Are You";
	
	{	
	 int i = Input.indexOf(OldWord);
	 System.out.println(OldWord);

    if (i < 0) 
    {
        return Input;
    }
    System.out.println(NewWord);
    String PartBefore = Input.substring(0, i);
    String PartAfter  = Input.substring(i + OldWord.length());
    return PartBefore + NewWord + 
           Replace(OldWord, NewWord, PartAfter); // <<-- Note recursion here 
    
    
    
	}
	}
}


