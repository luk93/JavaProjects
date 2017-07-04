import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fabula 
{
	static Scanner skaner = new Scanner(System.in);
	static int temp=0;
	static int trudnosc=2;

	public static int losuj(int k)
	{
		System.out.println("Kontyuowac podró¿?(tak-1/nie-2)");
		int odpowiedz = skaner.nextInt();
		if(odpowiedz==1)
		{
			Random los = new Random();
			int wylosowanaLiczba = los.nextInt(k);
			if(trudnosc==2)
			{
				return wylosowanaLiczba;
			}
			else
			{
				if(wylosowanaLiczba==29)
				{
					System.out.println("Gurux uratowa³ Ciê przed Kostuch¹!");
					return 28;
				}
				else return wylosowanaLiczba;
				
				
			}
		}
		else if(odpowiedz==2)
		{
			System.out.println("Koniec, póki co");
			temp=1;
			return 29;
		}
			
		else 
		{
			System.out.println("Niezdecydowanym mówimy nie");
			temp=1;
			return 29;
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
				
				
				//postac(String nazwa, int lvl, int hp, int exp, int wrog)
				ArrayList<postac> lista = new ArrayList<postac>();
				//Spis wrogow(0-11):
				lista.add(new postac("Komar",0,1,0,1));
				lista.add(new postac("Mucha",0,1,0,1));
				lista.add(new postac("Wilk",1,100,0,1));
				lista.add(new postac("Dziki Pies",1,100,0,1));
				lista.add(new postac("Dziki Kogut",1,100,0,1));
				lista.add(new postac("Ma³y Dzik",1,100,0,1));
				lista.add(new postac("Bandyta",2,100,0,1));
				lista.add(new postac("Pirat",2,100,0,1));
				lista.add(new postac("Du¿y Dzik",2,100,0,1));
				lista.add(new postac("Ork",3,100,0,1));
				lista.add(new postac("Grozny Bandyta",3,100,0,1));
				lista.add(new postac("Nekromanta",3,100,0,1));
				//Spis neutrali(12-23):
				lista.add(new postac("Pies",1,100,0,0));
				lista.add(new postac("Myœliwy",1,100,0,0));
				lista.add(new postac("Drwal",1,100,0,0));
				lista.add(new postac("Kobieta",2,100,0,0));
				lista.add(new postac("Kap³an",2,100,0,0));
				lista.add(new postac("Polityk",2,100,0,0));
				lista.add(new postac("Silny Pijak",3,100,0,0));
				lista.add(new postac("Druid",3,100,0,0));
				lista.add(new postac("Franciszek",3,100,0,0));
				lista.add(new postac("Krasnolud",4,100,0,0));
				lista.add(new postac("Doœwiadczony Myœliwy",4,100,0,0));
				lista.add(new postac("Król",10,100,0,0));
				//Spis przyjaciol(24-28):
				lista.add(new postac("Niebieski Duch",1,100,0,2));
				lista.add(new postac("Konrad",2,100,0,2));
				lista.add(new postac("Billy",3,100,0,2));
				lista.add(new postac("Jack",4,100,0,2));
				lista.add(new postac("Gurux",5,100,0,2));
				
				//koniec 29:
				lista.add(new postac("KOSTUCHA",99,100,0,99));
				//lekarze (30-35):
				lista.add(new postac("Lekarz",0,100,0,3));
				lista.add(new postac("Lekarz",0,100,0,3));
				lista.add(new postac("Lekarz",0,100,0,3));
				lista.add(new postac("Lekarz",0,100,0,3));
				lista.add(new postac("Lekarz",0,100,0,3));
				
				System.out.println("Wybierz poziom trudnosci:\n1 - latwy   2 - normalny");
				trudnosc = skaner.nextInt();
				if(trudnosc!=1||trudnosc!=2)
				{
					System.out.println("Jak nie umiesz wybrac z 2 liczb to wybieram za Ciebie. LATWY!");
					trudnosc=1;
				}
				if(trudnosc==1)
				{
					System.out.println("Tryb latwy:\n1. Przed Kostuch¹ broni Ciê sam Gurux\n2. Regeneracja zdrowia +5 co kolejkê" );
					Thread.sleep(2000);
				}
				System.out.println("Podaj nazwê bohatera, nieznajomy");
				String nazwaBohatera = skaner.nextLine();
				postac bohater = new postac(nazwaBohatera,1,100,0,5);
				Thread.sleep(1000);
				System.out.println("Niech rozpocznie siê twa przygoda. Powodzenia "+bohater.getnazwa()+"!");
				Thread.sleep(2000);
				interakcja.spotkanie(bohater,lista.get(28));
				
				while(temp==0)
				{
					System.out.println(bohater+" exp: "+bohater.getexp());
					interakcja.spotkanie(bohater,lista.get(losuj(lista.size())));
					interakcja.nowylvl(bohater);
					if(trudnosc==1)
					{
						if(bohater.gethp()<=95)
						{
							bohater.plushp(5);
						}
					}
					if(bohater.gethp()<=0)
					{ 
						temp=1;
						System.out.println("Œmieræ, niestety.");
					}
				}
				System.out.print("Statystyki twojej duszy: "+bohater);
				
		
		
	}
	
	
	

}
