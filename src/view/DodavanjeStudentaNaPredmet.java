package view;

import javax.swing.JOptionPane;

public class DodavanjeStudentaNaPredmet extends JOptionPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	UIManager.put("OptionPane.okButtonText", "Potvrda");
//
//	UIManager.put("OptionPane.cancelButtonText", "Odustanak");
	
	String name = JOptionPane.showInputDialog( null, 
	        "Indeks studenta*", 
	        "Predmet - dodavanje studenta",
	        JOptionPane.QUESTION_MESSAGE
	        );

	//JOptionPane.showMessageDialog(null, "Student obrisan!")

}
