import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener
{
	private JTextField ta, tb, tc, twynik;
	private JLabel la, lb, lc;
	private JButton b1, b2;
	
	
	
	
	public GUI()
	{
		setSize(500,500);
		setTitle("Równanie kwadratowe");
		setLayout(null);
		
		ta = new JTextField();
		ta.setBounds(20,50,50,20);
		add(ta);
		la = new JLabel("a",JLabel.RIGHT);
		la.setBounds(0,50,10,20);
		add(la);
		tb = new JTextField();
		tb.setBounds(20,70,50,20);
		add(tb);
		lb = new JLabel("b",JLabel.RIGHT);
		lb.setBounds(0,70,10,20);
		add(lb);
		tc = new JTextField();
		tc.setBounds(20,90,50,20);
		add(tc);
		lc = new JLabel("c",JLabel.RIGHT);
		lc.setBounds(0,90,10,20);
		add(lc);
		
		b1 = new JButton("Rozwi¹¿ równanie");
		b1.setBounds(0, 110, 140, 20);
		add(b1);
		b1 .addActionListener(this);
		
		b2 = new JButton("Wyjscie");
		b2.setBounds(0, 130, 140, 20);
		add(b2);
		b2.addActionListener(this);
		
		twynik = new JTextField();
		twynik.setBounds(0, 150, 500, 20);
		add(twynik);
	}
	public static void main(String[] args)
	{
		GUI app = new GUI();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object zrodlo = e.getSource();
		if(zrodlo == b1)
		{
			int a = Integer.parseInt(ta.getText());
			int b = Integer.parseInt(tb.getText());
			int c = Integer.parseInt(tc.getText());
			program11 rownanie = new program11(a,b,c);
			String rozwiazanie = rownanie.rozwiaz();
			twynik.setText(rozwiazanie);
			
		}
		else if(zrodlo == b2)
		{
			dispose();
		}
	}
	
	
}
