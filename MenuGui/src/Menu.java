import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Menu extends JFrame implements ActionListener
{
	JMenuBar menuBar;
	JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje;
	JMenuItem mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mInfo, mOpcja1 ,mOpcja2;
	public Menu()
	{
		setTitle("Menu test");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		menuBar = new JMenuBar();
		menuPlik = new JMenu("Plik");
		menuNarzedzia = new JMenu("Narzedzia");
		menuPomoc = new JMenu("Pomoc");
		menuOpcje = new JMenu("Opcje");
		mOtworz = new JMenuItem("Otworz");
		mZapisz = new JMenuItem("Zapisz");
		
		mWyjscie = new JMenuItem("Wyjscie");
		mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		mWyjscie.addActionListener(this);
		
		mNarz1 = new JMenuItem("Narzedzie 1");
		mNarz2 = new JMenuItem("Narzedzie 2");
		mInfo = new JMenuItem("Informacje");
		mOpcja1 = new JMenuItem("Opcja 1");
		mOpcja2 = new JMenuItem("Opcja 2");
		
		
		setJMenuBar(menuBar);
		
		menuBar.add(menuPlik);
		menuPlik.add(mOtworz);
		menuPlik.add(mZapisz);
		menuPlik.addSeparator();
		menuPlik.add(mWyjscie);
		
		menuBar.add(menuNarzedzia);
		menuNarzedzia.add(mNarz1);
		menuNarzedzia.add(mNarz2);
		menuNarzedzia.add(menuOpcje);
		menuOpcje.add(mOpcja1);
		menuOpcje.add(mOpcja2);
		
		menuBar.add(menuPomoc);
		menuPomoc.add(mInfo);
	}

	public static void main(String[] args)
	{
		Menu menu = new Menu();
		menu.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		if(z == mWyjscie)
		{
			dispose();
		}
	}

}
