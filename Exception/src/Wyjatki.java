import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {

	public static void main(String[] args) {
		boolean isNotCorrect = true;
		Scanner skaner = new Scanner(System.in);
		do {
			try {
				System.out.println("Wprowadz licznik");
				int l = skaner.nextInt();
				System.out.println("Wprowadz mianownik");
				int m = skaner.nextInt();
				System.out.println("Wynik dzielenia: " + l + " / " + m + " = " + l / m);
				isNotCorrect = false;
			} catch (ArithmeticException ae) {
				System.err.println("Dzielenie przez 0!");
			} catch (InputMismatchException ime) {
				System.err.println("Zle dane wejsciowe!");
				skaner.nextLine();
				System.out.println("Wprowadz dane ponownie");
			}
			
		} while (isNotCorrect);
		skaner.close();
	}

}
