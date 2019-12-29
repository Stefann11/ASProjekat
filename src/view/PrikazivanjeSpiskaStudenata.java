package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.BazaPredmeta;
import model.BazaStudenta;
import model.Predmet;
import model.Student;

public class PrikazivanjeSpiskaStudenata extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6038128757439857324L;
	
	public PrikazivanjeSpiskaStudenata() {
		setModal(false);
		setTitle("Spisak studenata");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth / 4, screenHeight/4 );
        setLocationRelativeTo(null);
		setVisible(true);
		JTextArea spisakStudenata =new JTextArea();
		
		StringBuilder string = new StringBuilder();
		
		int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
		Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
		
		for (Student student: BazaStudenta.getInstance().getStudenti()) {
			if (student.getPredmeti()==null) {
				string.append("Nema studenata.");
				break;
			} else {
				for (Predmet pr : student.getPredmeti()) {
					if (pr.getSifraPredmeta().equals(predmet.getSifraPredmeta())) {
						string.append(student);
					}
				}
			}
			
		}
		
		spisakStudenata.setText(string.toString());
		
		JScrollPane scrollPane = new JScrollPane(spisakStudenata, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scrollPane);
	}
	
}
