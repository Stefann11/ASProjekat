package view;

import javax.swing.JOptionPane;

import controller.PredmetiController;

public class DodavanjeProfesoraNaPredmet extends JOptionPane{

	private static final long serialVersionUID = 729002353215829058L;
	
	public DodavanjeProfesoraNaPredmet() {
		if(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Niste izabrali predmet");
			return;
		} else {
		String brojString = JOptionPane.showInputDialog( null, 
		        "Broj licne karte profesora*", 
		        "Predmet - dodavanje profesora",
		        JOptionPane.QUESTION_MESSAGE
		        );

		if (brojString.equals("")) {
			
		}
		if (brojString.equals("[0-9]+")) {
			int broj = Integer.parseInt(brojString);
			
			int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
				PredmetiController.getInstance().dodavanjeProfesoraNaPredmet(selektovaniRed, broj);
			} else {
				JOptionPane.showMessageDialog(null, "Mozete da unesete samo broj");
			}
		}
	}
		
		

}
