import java.util.Scanner;


public class program6 
{
	public static void main(String[] args) 
	{
		System.out.println("Podaj parametry y = ax2 + bx + c");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
	
		if(delta>0)
		{
			delta = Math.sqrt(delta);
			double x1 = (-b - delta)/(2*a);
			double x2 = (-b + delta)/(2*a);
			System.out.println("x1: " +x1+ " x2: " +x2);
		}
		if(delta==0)
		{
			double x0 = -b/(2*a);
			System.out.println("x0: " +x0);
		}
		if(delta<0)
		{
			System.out.println("Rownanie nie posiada pierwiastkow");
		}
	}	

}
