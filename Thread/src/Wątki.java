
public class W¹tki
{
	
	
	public static void main(String[] args)
	{
		Thread watek1 = new Watek1();
		watek1.start();
		
		Runnable runnable = new Watek2();
		Thread watek2 = new Thread(runnable);
		watek2.start();

		
		
	}

}
