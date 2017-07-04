
public class Wyliczenie 
{
	public enum dzienTygodnia 
	{
		Poniedzialek(1,"pon"),Wtorek(2,"wt"),Sroda(3,"œr"),Czwartek(4,"czw"),Piatek(5,"pt"),Sobota(6,"sob"),Niedziela(7,"ndz");
		private int numer;
		private String skrot;
		private dzienTygodnia(int x, String y)
		{
			numer = x;
			skrot = y;
		}
		public String toString()
		{
			return (numer+ " dzien tygodnia: "+ super.toString()+ " skrot: "+skrot);
		}
	}
	public static void main(String[] args) 
	{
		dzienTygodnia dzien = dzienTygodnia.Piatek;
		
		for(dzienTygodnia d:dzienTygodnia.values())
			System.out.println(d);
		
	}


}
