import java.util.Arrays;


public class program8 
{

	
	public static void main(String[] args)
	{
		int[] tablica = {1,4,2,7,3};
		int[] kopia = new int[5];
		kopia = Arrays.copyOf(tablica, tablica.length);
		Arrays.sort(kopia);
		tablica[0] = 1000;
		System.out.println(Arrays.toString(tablica));
		System.out.println(Arrays.toString(kopia));
	}

}
