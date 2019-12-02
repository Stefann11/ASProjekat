package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BrisanjeStudenta extends JOptionPane{
	public BrisanjeStudenta() {
		ImageIcon icon = new ImageIcon("images/trash-icon.png");
        JOptionPane.showMessageDialog(
                null,
                "Da li ste sigurni da želite da obrišete studenta",
                "Brisanje Studenta", JOptionPane.INFORMATION_MESSAGE,icon);
        
	}
	
}
