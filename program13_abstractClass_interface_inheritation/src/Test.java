

public class Test
{

	public static void main(String[] args)
	{
		Figura[] fig = new Figura[4];
		fig[0] = new Kolo();
		fig[1] = new Kolo (2.0);
		fig[2] = new Prostokat(2.0,5.0);
		fig[3] = new Prostokat (5.0,6.0,"Czerwony",false);
		
		for(int i=0; i<fig.length;i++)
		{
			System.out.println(fig[i].obliczPole());
			System.out.println(fig[i].obliczObwod());
			fig[i].draw();
		}
		
		

	}

}
