import java.util.Scanner;

public class program5
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj wzrost [cm]");
		double wzrost = input.nextDouble();
		wzrost = wzrost/100;
		System.out.println("Podaj wage [kg]");
		double waga = input.nextDouble();
		double bmi = waga/(Math.pow(wzrost,2));
		System.out.println("Twoj indeks BMI: " +bmi);
		if(bmi<18.5)
			{
			System.out.println("Za niskie BMI");
			}
		else if(bmi>25)
			{
			System.out.println("Za wysokie BMI");
			}
		else 
			{
			System.out.println("BMI jest ok");
			}
	
	}

}
