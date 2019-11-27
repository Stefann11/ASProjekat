package izgled;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GlavniProzor extends JFrame{

	private static final long serialVersionUID = 2150977017400959913L;
	
	public GlavniProzor() {
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        // Podesavamo dimenzije prozora na polovinu dimenzija ekrana
        setSize(3 * screenWidth / 4, 3 * screenHeight / 4);
        //Podesavamo naslov
        setTitle("Studentska služba");
        //Postavljamo akciju pri zatvaranju prozora
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //postavljamo JFrame na centar ekrana
        setLocationRelativeTo(null);
        // postavljamo boju pozadine
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        
        //Toolbar
        MyToolbar toolbar = new MyToolbar();
		add(toolbar, BorderLayout.NORTH);
	}

}