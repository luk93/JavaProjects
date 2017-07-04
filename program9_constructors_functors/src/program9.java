
public class program9 
{
	private double promien;
	public program9()
	{
		promien = 1;
	}
	public program9(double r)
	{
		promien = r;
	}
	public program9(double r, String j)
	{
		promien = r;
		if (j.equals("km"))
		{
			promien=promien*1000;
		}
	}
	
	public void setPromien(double r)
	{
		promien = r;
	}
	public double getPromien()
	{
		return promien;
	}
	public double obliczObwodKola()
	{
		return 2*Math.PI*promien;
	}
	public double obliczPoleKola()
	{
		double pole;
		pole = Math.PI*promien*promien;
		return pole;
	}
	public static void main(String[] args) 
	{
		program9 kolo = new program9(5, "km");
		System.out.println("Promien kola wynosi: "+kolo.getPromien());
		System.out.println("Obwod kola wynosi: "+kolo.obliczObwodKola());
		System.out.println("Obwod kola wynosi: "+kolo.obliczPoleKola());
		
		
	}

}
