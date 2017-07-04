import java.util.Scanner;
public class gra1 
{
	int lvl=1, HP=100, exp=0;
	String nazwa;
	public gra1(int r, String j)
	{
		lvl = r;
		nazwa = j;
		
	}
	
	public int getLVL()
	{
		return lvl;
	}
	public void setLVL(int r)
	{
		lvl = r;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Podaj imie bohatera");
		Scanner in = new Scanner(System.in);
		String nazwa = in.nextLine();
		gra1 bohater = new gra1(1,nazwa);
		System.out.println("Nazwa gracza: "+bohater.nazwa+ " Level: "+bohater.lvl + " HP: " + bohater.HP+" exp: "+bohater.exp);
		gra1 wrog = new gra1(0,"wilk");
		
	
		System.out.println("Napotkano wroga: ");
		System.out.println(wrog.nazwa+ " lvl: "+wrog.lvl);
			if(bohater.lvl>wrog.lvl)
			{
				bohater.exp+=(wrog.lvl+1)*10;
				System.out.println("Wygrano walke! Uzyskano exp: "+(wrog.lvl+1)*10);
			}
			else 
			{
				bohater.HP-=10;
				System.out.println("Przegrano walke! Utracono HP: 10");
			}
	}
	
	
	
}
