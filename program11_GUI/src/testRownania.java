
import java.util.Scanner;
public class testRownania
{

	public static void main(String[] args) 
	{
		System.out.println("Podaj parametry a, b, c");	
		Scanner skaner = new Scanner(System.in);
		int a = skaner.nextInt();
		int b = skaner.nextInt();
		int c = skaner.nextInt();
		program11 r = new program11(a,b,c);
		System.out.println(r.rozwiaz());
		System.out.println(r);
		r.setA(10);
		r.setB(-20);
		r.setC(-30);
		System.out.println(r.rozwiaz());
		System.out.println(r);
	}

}
