
public class DecimalFormatter implements NumberFormatter
{
	public String format(int num)
	{

		String formatted = "";	
		while (num >= 1000)
		{
			String number = Integer.toString(num);
			String lastThreeNum = number.substring(number.length()-3);
			formatted += "." + lastThreeNum;
			int remainingDigits = num/1000;
			num = remainingDigits;
		}
		
		return num + formatted;
	}
}
