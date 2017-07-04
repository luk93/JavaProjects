import java.util.Scanner;

public class SwitchCase
{

	public static void main(String[] args) 
	{
		int ocena;
		int jedynki=0,dwojki=0,trojki=0,czworki=0,piatki=0,szostki=0,inne=0;
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wprowadz oceny.\"q\" konczy wprowadzanie");	
		while(skaner.hasNextInt())
		{
			ocena = skaner.nextInt();
			switch (ocena)
			{
			case 1:
				jedynki++;
				break;
			case 2:
				dwojki++;
				break;
			case 3:
				trojki++;
				break;
			case 4:
				czworki++;
				break;
			case 5:
				piatki++;
				break;
			case 6:
				szostki++;
				break;
			default:
				inne++;
				break;
			}
			
		}
		System.out.println("Liczba 1: "+jedynki+"\nLiczba 2: "+dwojki+"\nLiczba 3: "+trojki+"\nLiczba 4: "+czworki+"\nLiczba 5: "+piatki+"\nLiczba 6: "+szostki+"\nLiczba innych : "+inne);
	}

}
