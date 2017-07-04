import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CtoF extends JFrame implements ActionListener
{
	
	private double tmpF=0, tmpC=0;
	private JLabel lCelc, lFar;
	private JTextField tCelc, tFar;
	private JButton button;
	private JCheckBox checkbox;
	private ButtonGroup bg;
	private JRadioButton rb1, rb2;
	
	public CtoF()
	{
		
		setSize(300,250);
		setTitle("Celcius to Farenheit");
		setLayout(null);
		
		lCelc = new JLabel("Celcjusz");
		lCelc.setBounds(20,20,100, 20);
		add(lCelc);
		
		lFar = new JLabel("Farenheit");
		lFar.setBounds(20, 40, 100, 20);
		add(lFar);
		
		tCelc = new JTextField("");
		tCelc.setBounds(120,20,100,20);
		add(tCelc);
		tCelc.addActionListener(this);
		
		tFar = new JTextField("");
		tFar.setBounds(120,40,100,20);
		add(tFar);
		
		button = new JButton("Konwertuj");
		button.setBounds(100,80,100,20);
		add(button);
		button.addActionListener(this);
		
		checkbox = new JCheckBox("Duze cyfry");
		checkbox.setBounds(150,120,100,20);
		add(checkbox);
		//checkbox.addActionListener(this);
		
		bg = new ButtonGroup();
		rb1 = new JRadioButton("C to F");
		rb1.setBounds(50, 100,100, 20);
		rb2 = new JRadioButton("F to C");
		rb2.setBounds(200, 100,100, 20);
		rb1.setSelected(true);
		bg.add(rb1);
		bg.add(rb2);
		add(rb1);
		add(rb2);
		
		

		
	}

	public void actionPerformed(ActionEvent e)
	{
		
			Object zrodlo = e.getSource();
			if(zrodlo == button)
			{
				if(rb1.isSelected())
				{
					tmpC = Double.parseDouble(tCelc.getText());
					tmpF = 32.0 + (9.0/5.0) *tmpC;
					tFar.setText(String.valueOf(tmpF));
				}
				else if(rb2.isSelected())
				{
					tmpF = Double.parseDouble(tFar.getText());
					tmpC = (tmpF-32.0) *(5.0/9.0);  
					tCelc.setText(String.valueOf(tmpC));
					
				}
			}
		
			
	}
			
	
	public static void main(String[] args)
	{
		CtoF okno = new CtoF();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		

	}

	
	

}
