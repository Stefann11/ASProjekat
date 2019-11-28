package view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MyApp {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		GlavniProzor gp = new GlavniProzor();
	}

}
