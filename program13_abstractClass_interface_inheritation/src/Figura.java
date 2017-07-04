
public abstract class Figura implements Areable,Drawable
{
	String kolor;
	boolean wypelnienie;
	
	public Figura(String k, boolean w)
	{
		wypelnienie = w;
		kolor = k;
	}
	public Figura()
	{
		this("Czarny",false);
	}
	public String toString()
	{
		return "Kolor: "+kolor+" wypelnienie: "+wypelnienie;
	}

	public static void main(String[] args) 
	{
	}

}
