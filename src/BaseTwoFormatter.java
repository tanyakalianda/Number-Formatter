/**
 * 
 * @author Tanya Kalianda
 * Base Two Formatter
*/
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
		
		String reversed = "";
		for (int i = formatted.length()-1; i>=0; i--)
		{
			reversed += formatted.charAt(i);
		}
		
		return reversed;
	}
	
}
