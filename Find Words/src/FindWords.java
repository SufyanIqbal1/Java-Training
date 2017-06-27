
public class FindWords 
{
		public static void main(String[] args) 
		{
			String name = "There are more are words in this sentence are";
			String Search = "are";
			String Pos = "";
			int Index = 0;
			int Count = 0;
			
			
			while (Index != -1)
			{
				Index = name.indexOf(Search, Index);
				
				if (Index != -1)
				{
					Count ++;
					Pos += (Index +1) + ".";
					Index += Search.length();
					
				}
			
			}
			System.out.println("Searching The Word: " + Search);
			System.out.println("Number of Words: "+ Count);
			System.out.println("Position Number: " + Pos);
		}
		
		
}
