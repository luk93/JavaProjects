import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class program12 
{

	public static void main(String[] args) 
	{
		/**long t1 = System.currentTimeMillis();
		for(int i=0; i<100000000; i++)
		{
			double x=Math.pow(Math.random(), Math.random());
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println((t2-t1)/1000.0);*/
		GregorianCalendar data = new GregorianCalendar();
		GregorianCalendar urodziny = new GregorianCalendar(2017, 10, 20);
		int rok = data.get(Calendar.YEAR);
		int miesiac = data.get(Calendar.MONTH);
		System.out.printf("%tc",new Date());
		System.out.println();
		System.out.println(rok+ " " +miesiac);
		System.out.printf("%tc",urodziny);
		if(data.before(urodziny))
		{
			System.out.println("\nPrzed urodzinkami");
		}
		
	}

}
