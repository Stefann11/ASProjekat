package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.BazaPredmeta;
import model.BazaProfesora;
import model.Predmet;
import model.Profesor;

public class PrikazivanjeSpiskaPredmetaZaProfesora extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 952930433661889650L;
	
	public PrikazivanjeSpiskaPredmetaZaProfesora() {
		setModal(false);
		setTitle("Spisak predmeta");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth / 4, screenHeight/4 );
        setLocationRelativeTo(null);
		setVisible(true);
		JTextArea spisak =new JTextArea();
		
		StringBuilder string = new StringBuilder();
		
		int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
		Profesor profesor = BazaProfesora.getInstance().getRow(selektovaniRed);
		
		for (Predmet predmet : BazaPredmeta.getInstance().getPredmeti()) {
			if (predmet.getPredmetniProfesor()==null) {
				string.append("Nema predmeta.");
				break;
			} else {
				if (predmet.getPredmetniProfesor().getBrojLicneKarte()==profesor.getBrojLicneKarte()) {
					string.append(profesor);
				}
			}
			
		}
		
		spisak.setText(string.toString());
		
		JScrollPane scrollPane = new JScrollPane(spisak, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scrollPane);
	}
	
}
