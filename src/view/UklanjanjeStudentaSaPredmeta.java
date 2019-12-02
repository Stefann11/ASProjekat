package view;

import javax.swing.JOptionPane;

public class UklanjanjeStudentaSaPredmeta   extends JOptionPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name = JOptionPane.showInputDialog( null, 
	        "Indeks studenta*", 
	        "Predmet - uklanjanje studenta",
	        JOptionPane.QUESTION_MESSAGE
	        );

}
