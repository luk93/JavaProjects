

public class FiguraTest
{

	public static void main(String[] args) 
	{

		
		Kolo kolo = new Kolo();
		Prostokat prostokat = new Prostokat();
		Kolo kolo1 = new Kolo(3.0);
		Prostokat prostokat1 = new Prostokat(4.0,5.0);
		Prostokat prostokat2 = new Prostokat(3,7,"Czerwien",true);
		Figura[] figury = new Figura[6];
		
		figury[0] = kolo;
		figury[1] = prostokat;
		figury[3] = kolo1;
		figury [4] = prostokat1;
		figury[5] = prostokat2;
		
		for(int i=0;i<6;i++)
		{
			System.out.println(i);
			System.out.println(figury[i]);
		}
		
		

	}

}
