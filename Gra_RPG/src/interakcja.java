import java.util.Scanner;


public class interakcja 
{
	public static void spotkanie(postac ty, postac przeciwnik) throws InterruptedException
	{
		System.out.println("NAPOTKANO: " +przeciwnik);
		Thread.sleep(1000);
		if(przeciwnik.getwrog()==1)
		{
		
			System.out.println("To wróg! WALKA!");
			Thread.sleep(3000);
			if(ty.getlvl()>przeciwnik.getlvl())
			{
				ty.addexp(10);
				System.out.println("Zwyciestwo, bez dwóch zdañ! EXP+10");
				Thread.sleep(1000);
							
			}
			else if(ty.getlvl()==przeciwnik.getlvl())
			{
				ty.addexp(15);
				ty.minushp(10);
				System.out.println("Bylo ciezko, ale udalo sie! EXP+15 HP-10");
				Thread.sleep(1000);
			}
			else 
			{
				ty.addexp(5);
				ty.minushp(20);
				System.out.println("Niestety, przegrales! HP -20 EXP+5");
				Thread.sleep(1000);
			}
		}
		if(przeciwnik.getwrog()==0)
		{
			System.out.println("To jakis neutralny gosc...\nPowita³ Ciê i szybko odszed³.");
			Thread.sleep(1000);
		}
		if(przeciwnik.getwrog()==2)
		{
			if(ty.gethp()<=90)
			{
				ty.plushp(10);
				System.out.println("To Twój przyjaciel!\nPo rozmowie odzyska³eœ 10 zdrowia.");
				Thread.sleep(1000);
			}
			else 
			{
				System.out.println("To Twój przyjaciel!\nPo rozmowie jestes w dobrym humorze, gotowy na przygody!");
				Thread.sleep(1000);
			}
		}
		if(przeciwnik.getwrog()==99)
		{
			System.out.println("TO KONIEC!");
			ty.dead();
		}
		if(przeciwnik.getwrog()==3)
		{
			if(ty.gethp()<=80)
			{
				ty.plushp(20);
				System.out.println("Masz spore szczêscie, to Kaplan. Uleczy³ Ciê.");
			}
			else if(ty.gethp()<=90)
			{
				ty.plushp(10);
				System.out.println("Masz spore szczêscie, to Kaplan. Uleczy³ Ciê.");
			}
			else System.out.println("Nic ci to nie dalo, ze spotkales Kaplana. Byles w pelni sil.");
		}
	}
	public static void nowylvl(postac ty)
	{
		if(ty.getlvl()==1)
		{
			if(ty.getexp()>=100)
			{
				ty.setlvl(2);
				System.out.println("\nGratulacje, awansowales na level 2!\n");
			}
		}
		if(ty.getlvl()==2)
		{
			if(ty.getexp()>=200)
			{
				ty.setlvl(3);
				System.out.println("\nGratulacje, awansowales na level 3!\n");
			}
		}
		if(ty.getlvl()==3)
		{
			if(ty.getexp()>=300)
			{
				ty.setlvl(4);
				System.out.println("\nGratulacje, awansowales na level 4!\n");
			}
		}
		if(ty.getlvl()==4)
		{
			if(ty.getexp()>=400)
			{
				ty.setlvl(5);
				System.out.println("\nGratulacje, awansowales na level 5!\n");
			}
			
		}
		if(ty.getlvl()==5)
		{
			if(ty.getexp()>=500)
			{
				ty.setlvl(6);
				System.out.println("\nGratulacje, awansowales na level 6! Mozesz przestac grac.\n");
			}
		}
	}
	public static void main(String[] args) 
	{

	}

	

}
