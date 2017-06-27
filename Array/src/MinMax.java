
public class MinMax 
{

	public static int maxValue(char[] chars) 
	{
		    int max = chars[0];
		    for (int ktr = 0; ktr < chars.length; ktr++) 
		    {
		        if (chars[ktr] > max) 
		        {
		            max = chars[ktr];
		        }
		    }
		    return max;
		}

	}
