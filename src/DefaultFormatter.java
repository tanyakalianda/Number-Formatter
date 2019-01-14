
public class DefaultFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String formatted = "";	
		while (num >= 1000)
		{
			String number = Integer.toString(num);
			String lastThreeNum = number.substring(number.length()-3);
			formatted += "," + lastThreeNum;
			int remainingDigits = num/1000;
			num = remainingDigits;
		}
		String finalFormatted = "";		
		for(int i = formatted.length()-1; i >= 0 ; i--)
		{
			String letters =  formatted.substring(0, 2);
			finalFormatted += letters;
			length = formatted.length()-3;
		}
		return num + finalFormatted;
		
//		for(int i = formatted.length()-1; i >= 0 ; i--)
//		{	
	}
}
  //008909
  //012345

  //500,034