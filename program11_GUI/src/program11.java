
public class program11 
{
	private int a,b,c;
	public program11(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String rozwiaz()
	{
		String rozwiazanie = "";
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta>0)
		{
			delta = Math.sqrt(delta);
			double x1 = (-b - delta)/(2*a);
			double x2 = (-b + delta)/(2*a);
			rozwiazanie =("Rownanie posiada 2 pierwiastki rzeczywiste x1: " +x1+ " x2: " +x2);
		}
		if(delta==0)
		{
			double x0 = -b/(2*a);
			rozwiazanie = ("Rownianie posiada 1 pierwiastek rzeczywisty x0: " +x0);
		}
		if(delta<0)
		{
			rozwiazanie = ("Rownanie nie posiada pierwiastkow rzeczywistych");
		}
		return rozwiazanie;
	}
	public String toString()
	{
		return ("Rownanie kwadratowe: y = "+a+ "x2 + "+b+"x + "+c);
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public void setC(int c)
	{
		this.c=c;
	}
	public static void main(String[] args)
	{
		program11 rownanie = new program11(1,4,20);
		System.out.println(rownanie.rozwiaz());
		
	}

}
