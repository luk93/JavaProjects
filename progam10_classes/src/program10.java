
public class program10
{
	private double promien;
	private int id;
	private static int nextId;
	public program10()
	{
		this(1.0);
	}
	public program10(double r)
	{
		this(r,"cos");
	}
	public program10(double r, String j)
	{
		id=nextId;
		nextId++;
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
	public int getId()
	{
		return id; 
	}
	public static void main(String[] args) 
	{
		program10[] kolo = new program10[3];
		kolo[0] = new program10();
		kolo[1] = new program10(20);
		kolo[2] = new program10(2, "km");
		for(program10 x:kolo)
		{
			System.out.println("Kolo: "+x.getId());
			System.out.println("Promien kola wynosi: "+x.getPromien());
			System.out.println("Obwod kola wynosi: "+x.obliczObwodKola());
			System.out.println("Obwod kola wynosi: "+x.obliczPoleKola());
			System.out.println();
		}
		
	}
	static
	{
		nextId = 1;
	}

}
