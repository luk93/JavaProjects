import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MojeOkno extends JFrame implements ActionListener
{
	JButton bPodajDate, bWyjscie;
	JLabel wyswietlDate;
	public MojeOkno()
	{
		setSize(300,300);
		setTitle("Moje okno");
		setLayout(null);
		bPodajDate = new JButton("Podaj datê");
		bPodajDate.setBounds(50,50,100,20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);
		
		bWyjscie = new JButton("Wyjscie");
		bWyjscie.setBounds(150,50,100,20);
		bWyjscie.setForeground(new Color(0,200,200));
		add(bWyjscie);
		bWyjscie.addActionListener(this);
		
		wyswietlDate = new JLabel("Data");
		wyswietlDate.setBounds(50, 100, 200, 20);
		wyswietlDate.setForeground(Color.RED);
		add(wyswietlDate);

	}

	public static void main(String[] args)
	{
		MojeOkno okno1 = new MojeOkno();
		okno1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno1.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		Object zrodlo = e.getSource();
		if(zrodlo==bPodajDate)
		{
			wyswietlDate.setText(new Date().toString());
			//System.out.println(new Date());
		}
		else if(zrodlo==bWyjscie)
		{
			dispose();
		}
	}
	
	

}
