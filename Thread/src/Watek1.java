
public class Watek1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pierwszy w¹tek"); 
	}

}
