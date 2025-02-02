package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import controller.PredmetiController;
import model.BazaPredmeta;
import model.Predmet;

public class BrisanjePredmeta extends JOptionPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2827622382494522439L;
	
	public BrisanjePredmeta() {
		if(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Niste izabrali predmet");
			return;
		} else {
		ImageIcon icon = new ImageIcon("images/trash-icon.png");
		UIManager.put("OptionPane.yesButtonText", "Potvrda");

		UIManager.put("OptionPane.noButtonText", "Odustanak");
		int choice =JOptionPane.showConfirmDialog(
                null,
                "Da li ste sigurni da �elite da obri�ete predmet?",
                "Brisanje Predmeta",YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
		if (choice == JOptionPane.YES_OPTION) {
			int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
			PredmetiController.getInstance().IzbrisiPredmet(selektovaniRed);
			JOptionPane.showMessageDialog(null, "Predmet obrisan!");
		} else {

			JOptionPane.showMessageDialog(null, "Predmet nije obrisan.");

			}
		}
	}

}
