
public class BaseTwoFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String formatted = "";
		while (num > 0)
		{
			int number = num % 2;     
			formatted += number;
			
			num = num/2;
		}
		return formatted;
	}
	
}
