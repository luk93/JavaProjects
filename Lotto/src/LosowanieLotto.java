import java.util.Arrays;

public class LosowanieLotto 
{

	public static void main(String[] args) 
	{
		int[] wyniki;
		wyniki = Totek.losuj(5, 50);
		System.out.println(Arrays.toString(wyniki));
	}

}
