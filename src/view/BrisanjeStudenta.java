package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class BrisanjeStudenta extends JOptionPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BrisanjeStudenta() {
		ImageIcon icon = new ImageIcon("images/trash-icon.png");
		UIManager.put("OptionPane.yesButtonText", "Potvrda");

		UIManager.put("OptionPane.noButtonText", "Odustanak");
		int choice =JOptionPane.showConfirmDialog(
                null,
                "Da li ste sigurni da �elite da obri�ete studenta?",
                "Brisanje Studenta",YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
		if (choice == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(null, "Student obrisan!");
		} else {

			JOptionPane.showMessageDialog(null, "Student nije obrisan.");

			}
	}
	
}
