
public class Prostokat extends Figura
{
	private double a,b;
	public Prostokat()
	{
		this(1.0, 1.0);
	}
	public Prostokat(double a, double b)
	{
		this(a,b,"Czarny",true);
		
	}
	public Prostokat(double a, double b, String k, boolean w)
	{
		super(k,w);
		this.a=a;
		this.b=b;
		
	}
	public double obliczObwod()
	{
		return (2*a)+(2*b);
	}
	public double obliczPole()
	{
		return a*b;
	}
	public String toString()
	{
		return getClass().getName()+"\nDlugosc boku: "+a+" Dlugosc podstawy: "+b+"\nPole: "+obliczPole()+" Obwod "+obliczObwod()+" "+super.toString();
	}
	
	public static void main(String[] args) 
	{
		Prostokat prostokat = new Prostokat(2.0,3.0,"niebieski",false);
		System.out.println(prostokat);
	}

	public void draw()
	{
	}

}
