package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class BrisanjePredmeta extends JOptionPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2827622382494522439L;
	
	public BrisanjePredmeta() {
		ImageIcon icon = new ImageIcon("images/trash-icon.png");
		UIManager.put("OptionPane.yesButtonText", "Potvrda");

		UIManager.put("OptionPane.noButtonText", "Odustanak");
		int choice =JOptionPane.showConfirmDialog(
                null,
                "Da li ste sigurni da želite da obrišete predmet?",
                "Brisanje Predmeta",YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
		if (choice == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(null, "Predmet obrisan!");
		} else {

			JOptionPane.showMessageDialog(null, "Predmet nije obrisan.");

			}
	}

}
