package view;

import javax.swing.JOptionPane;

import controller.PredmetiController;
import model.BazaStudenta;

public class DodavanjeStudentaNaPredmet extends JOptionPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6032232686414917989L;

	public DodavanjeStudentaNaPredmet() {
			
			
		
			String Indeks = JOptionPane.showInputDialog( null, 
	        "Indeks studenta*", 
	        "Predmet - dodavanje studenta",
	        JOptionPane.QUESTION_MESSAGE
	        );

	
	if (Indeks!=null) {
		int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
		if (selektovaniRed<0) {
			JOptionPane.showMessageDialog(this, "Niste izabrali predmet");
			return;
		} else {
			PredmetiController.getInstance().dodavanjeStudentaNaPredmet(selektovaniRed, Indeks);
		}
	}
}


}
