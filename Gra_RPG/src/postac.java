
public class postac extends interakcja
{

	private int lvl,hp,wrog, exp;
	private String nazwa;
	public postac(String nazwa, int lvl, int hp, int exp, int wrog)
	{
		this.nazwa=nazwa;
		this.lvl=lvl;
		this.hp=hp;
		this.exp=exp;
		this.wrog=wrog;
	}
	
	public void setnazwa(String nazwa)
	{
		this.nazwa=nazwa;
	}
	public void setlvl(int lvl)
	{
		this.lvl=lvl;
	}
	public void minushp(int hp)
	{
		this.hp-=hp;
	}
	public void plushp(int hp)
	{
		this.hp+=hp;
	}
	
	public void addexp(int exp)
	{
		this.exp+=exp;
	}
	public void setwrog(int wrog)
	{
		this.wrog=wrog;
	}
	public int getlvl()
	{
		return lvl;
	}
	public int gethp()
	{
		return hp;
	}
	public int getexp()
	{
		return exp;
	}
	public int getwrog()
	{
		return wrog;
	}
	public String getnazwa()
	{
		return nazwa;
	}
	public void dead()
	{
		hp=0;
	}
	public String toString()
	{
		return (nazwa+ " lvl: "+lvl+" HP: "+hp);
	}
	
	public static void main(String[] args) 
	{

	}


}
