
public class D2BII 
{
	public int convertBinary(int binaryNumber)
	{
		
	int decimal = 0;
    int p = 0;
    while(true)
    {
      if(binaryNumber == 0)
      {
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    return decimal;
	}

}
