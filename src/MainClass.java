
public class MainClass 
{

	public static void main(String[] args)
	{
		DefaultFormatter tk = new DefaultFormatter();
		DecimalFormatter tka = new DecimalFormatter();
		BaseTwoFormatter t = new BaseTwoFormatter();
		
		System.out.println(tk.format(10345810));
		
		System.out.println(tka.format(13458986));
		
		System.out.println(t.format(2));

	}

}
