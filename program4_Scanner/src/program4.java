import java.util.Scanner;

public class program4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj imie");
		String imie = input.nextLine();
		System.out.println("Witaj " +imie);
		System.out.println("Podaj wiek");
		int wiek = input.nextInt();
		System.out.println("wiek: " +wiek);
		System.out.println("Podaj wzrost [cm]");
		double wzrost = input.nextDouble();
		wzrost = wzrost/100;
		System.out.println("Podaj wage [kg]");
		double waga = input.nextDouble();
		double bmi = waga/(Math.pow(wzrost,2));
		System.out.println("Twoj indeks BMI: " +bmi);
	
	}

}
