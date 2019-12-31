/**
 * 
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.BazaStudenta;
import model.Predmet;
import model.Student;

/**
 * @author Aleksa Santrac
 *
 */
public class PrikazivanjeSpiskaPredmetaZaStudenta extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2228091571772686610L;

public PrikazivanjeSpiskaPredmetaZaStudenta(){
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
		
		int selektovaniRed = MyTabbedPane.getInstance().tabelaStudenata.getSelectedRow();
		if (selektovaniRed<0)
			return;
		else {
			Student student = BazaStudenta.getInstance().getRow(selektovaniRed);
		
			if (student.getPredmeti()==null) {
				string.append("Nema predmeta");
			}else {
				for (Predmet predmet: student.getPredmeti()) {
					string.append(predmet);
				}
			}
		}
		
		
		spisak.setText(string.toString());
		
		JScrollPane scrollPane = new JScrollPane(spisak, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scrollPane);
	}
	
	
}
