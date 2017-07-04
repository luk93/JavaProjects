import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Totek 
{
		
	public static int[] losuj(int k, int m)
	{
		Random liczbaLosowa = new Random();
		ArrayList<Integer> pula = new ArrayList<Integer>();
		int[] wylosowaneLiczby = new int[k];
		int counter = m;
		
		for(int i=1; i<=m; i++)
			pula.add(i);
		for(int j=0; j<k; j++)
		{
			int index = liczbaLosowa.nextInt(counter);
			wylosowaneLiczby[j] = pula.get(index);
			pula.remove(index);				
		}
		return wylosowaneLiczby;
	}
}
