import java.util.ArrayList;

public class spispostaci 
{

	public static void main(String[] args) 
	{
		//postac(String nazwa, int lvl, int hp, int exp, int wrog)
		ArrayList<postac> lista = new ArrayList<postac>();
		//Spis wrogow(0-11):
		lista.add(new postac("Komar",0,1,0,1));
		lista.add(new postac("Mucha",0,1,0,1));
		lista.add(new postac("Wilk",1,100,0,1));
		lista.add(new postac("Dziki Pies",1,100,0,1));
		lista.add(new postac("Dziki Kogut",1,100,0,1));
		lista.add(new postac("Maly Dzik",1,100,0,1));
		lista.add(new postac("Bandyta",2,100,0,1));
		lista.add(new postac("Pirat",2,100,0,1));
		lista.add(new postac("Duzy Dzik",2,100,0,1));
		lista.add(new postac("Ork",3,100,0,1));
		lista.add(new postac("Grozny Bandyta",3,100,0,1));
		lista.add(new postac("Nekromanta",3,100,0,1));
		//Spis neutrali(12-23):
		lista.add(new postac("Pies",1,100,0,0));
		lista.add(new postac("Mysliwy",1,100,0,0));
		lista.add(new postac("Drwal",1,100,0,0));
		lista.add(new postac("Kobieta",2,100,0,0));
		lista.add(new postac("Kaplan",2,100,0,0));
		lista.add(new postac("Polityk",2,100,0,0));
		lista.add(new postac("Silny Pijak",3,100,0,0));
		lista.add(new postac("Druid",3,100,0,0));
		lista.add(new postac("Franciszek",3,100,0,0));
		lista.add(new postac("Krasnolud",4,100,0,0));
		lista.add(new postac("Doswiadczony Mysliwy",4,100,0,0));
		lista.add(new postac("Krol",10,100,0,0));
		//Spis przyjaciol(24-28):
		lista.add(new postac("Niebieski Duch",1,100,0,2));
		lista.add(new postac("Konrad",2,100,0,2));
		lista.add(new postac("Billy",3,100,0,2));
		lista.add(new postac("Jack",4,100,0,2));
		lista.add(new postac("Gurux",5,100,0,2));
		
		

	}

}
