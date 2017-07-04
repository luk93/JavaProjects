import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest
{

	public static void main(String[] args)
	{
		String x="";
		ArrayList<String> wyrazy = new ArrayList<String>();
		wyrazy.add("To");
		wyrazy.add("Jest");
		wyrazy.add("Jakis");
		wyrazy.add("Tekst");
		System.out.println(wyrazy);	
		for (String s:wyrazy)
		System.out.print(s+ " ");
		System.out.println();
		wyrazy.add(1,"Nie");
		for (String s:wyrazy)
		System.out.print(s+ " ");
		System.out.println();
		wyrazy.remove(1);
		for (String s:wyrazy)
		System.out.print(s+ " ");
		System.out.println();
		wyrazy.remove("Jakis");
		for (String s:wyrazy)
		System.out.print(s+ " ");
		Scanner input = new Scanner(System.in);
		System.out.println("\nPodaj wyraz do wyszukania");
		x = input.nextLine();
		if(wyrazy.contains(x)==true)
		{
			System.out.println("Znaleziono wyraz! Jest to "+(wyrazy.indexOf(x)+1)+" slowo");
			
		}
		else System.out.println("Nie znaleziono wyrazu!");
				
		

	}

}
