
public class Kolo extends Figura
{
	private double promien;
	
	public double getPromien()
	{
		return promien;
	}
	
	public Kolo()
	{
		this(1.0);
	}
	public Kolo(double r)
	{
		this(r,"Granatowy",true);
	}
	public Kolo(double r, String k, boolean w)
	{
		super(k,w);
		promien = r;
	}
	public final double obliczObwod()
	{
		return 2*Math.PI*promien;
	}
	
	public final double obliczPole()
	{
		return Math.PI*Math.pow(promien, 2);
	}
	public String toString()
	{
		return getClass().getName()+"\nPromien: "+promien+" Obwod: "+obliczObwod()+ " Pole: "+obliczPole()+" "+super.toString();
	}
	public static void main(String[] args) 
	{
		Kolo kolo = new Kolo(2,"Zielony",false);
		System.out.println(kolo);
		

	}

	public void draw() 
	{
		System.out.println("Rysujê ko³o!");
	}

}
