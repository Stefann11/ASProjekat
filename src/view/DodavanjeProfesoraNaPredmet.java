package view;

import javax.swing.JOptionPane;

public class DodavanjeProfesoraNaPredmet extends JOptionPane{

	private static final long serialVersionUID = 729002353215829058L;
	
	public DodavanjeProfesoraNaPredmet() {
		String name = JOptionPane.showInputDialog( null, 
		        "Broj licne karte profesora*", 
		        "Predmet - dodavanje profesora",
		        JOptionPane.QUESTION_MESSAGE
		        );
	}

}
