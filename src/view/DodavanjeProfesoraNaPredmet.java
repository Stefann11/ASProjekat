package view;

import javax.swing.JOptionPane;

import controller.PredmetiController;
import model.BazaPredmeta;
import model.BazaProfesora;
import model.Predmet;
import model.Profesor;

public class DodavanjeProfesoraNaPredmet extends JOptionPane{

	private static final long serialVersionUID = 729002353215829058L;
	
	public DodavanjeProfesoraNaPredmet() {
		String brojString = JOptionPane.showInputDialog( null, 
		        "Broj licne karte profesora*", 
		        "Predmet - dodavanje profesora",
		        JOptionPane.QUESTION_MESSAGE
		        );

		if (brojString!=null) {
			int broj = Integer.parseInt(brojString);
			int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
			if (selektovaniRed<0) {
				JOptionPane.showMessageDialog(this, "Niste izabrali predmet");
				return;
			} else {
				PredmetiController.getInstance().dodavanjeProfesoraNaPredmet(selektovaniRed, broj);
			}
		}
	}
		
		

}
