public class StringTest 
{

	public static void main(String[] args)
	{
		String message = "I am going to Newport ";
		String Rep = "am";
		String name = "abc";
		String currentWord = "";
		String result = "";

		for (int i = 0; i < message.length(); i++)
		{
			char ch = message.charAt(i);
			if (ch != ' ')
			{
				currentWord = currentWord + ch;
			}

			else
			{
				if (currentWord.equals(Rep))
				{
					result = result + name + " ";
				}

				else
				{
					result = result + currentWord + " ";
				}

				currentWord = "";
			}
		}

		System.out.println(result);
	}

}