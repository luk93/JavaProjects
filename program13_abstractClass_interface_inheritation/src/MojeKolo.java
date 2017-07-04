
public class MojeKolo extends Kolo
{
	public MojeKolo(double r)
	{
		super(r);
	}
	
	public static void main(String[] args) 
	{
		MojeKolo mk = new MojeKolo(10);
		System.out.println("Promien: "+mk.getPromien());
		System.out.println("Pole: "+mk.obliczPole());
	}

}
