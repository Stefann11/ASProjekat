package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class BrisanjeProfesora extends JOptionPane{

	private static final long serialVersionUID = 7356169157162363400L;
	
	BrisanjeProfesora(){
		ImageIcon icon = new ImageIcon("images/trash-icon.png");
		UIManager.put("OptionPane.yesButtonText", "Potvrda");

		UIManager.put("OptionPane.noButtonText", "Odustanak");
		int choice =JOptionPane.showConfirmDialog(
                null,
                "Da li ste sigurni da �elite da obri�ete profesora?",
                "Brisanje Predmeta",YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
		if (choice == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(null, "Profesor obrisan!");
		} else {

			JOptionPane.showMessageDialog(null, "Profesor nije obrisan.");

			}
	}

}
