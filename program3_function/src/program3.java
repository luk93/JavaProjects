
public class program3 
{

	public static void main(String[] args)
	{
		//wypisz();
		System.out.println("obwod kola = " +kolo(10));
		

	}
	public static void wypisz()
	{
		System.out.println("Ta funckja nic nie zwraca");
	}
	public static int zwroc()
	{
		return 10;
	}
	public static double kolo(double r)
	{
		double obwod=2*Math.PI*r;
		return obwod;
	}
}
