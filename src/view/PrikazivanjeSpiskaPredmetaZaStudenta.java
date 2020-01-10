/**
 * 
 */
package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
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
		setSize(screenWidth / 3, screenHeight/3 );
        setLocationRelativeTo(null);
		setVisible(true);
//		JTextArea spisak =new JTextArea();
//		Font font = new Font("Ariel", Font.BOLD, 15);
//		spisak.setFont(font);
		final DefaultListModel model = new DefaultListModel();
		JList predmetiList;
		String predmetiString []= new String[100];
		 
		if ( MyTabbedPane.getInstance().tabelaStudenata.getSelectedRow() < 0)
			return;
		else {
			int selektovaniRed = MyTabbedPane.getInstance().tabelaStudenata.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaStudenata.getSelectedRow());
			Student student = BazaStudenta.getInstance().getRow(selektovaniRed);
			//int i=0;
			if (student.getPredmeti()!=null) {
				for (Predmet predmet: student.getPredmeti()) {
//					predmetiString[i]=predmet.toString();
//					i++;
					model.addElement(predmet.toString());
				}
			}
		}
		
		
		predmetiList=new JList(model);
		
		JScrollPane scrollPane = new JScrollPane(predmetiList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scrollPane);
		
		
//		StringBuilder string = new StringBuilder();
//		
//		 
//		if ( MyTabbedPane.getInstance().tabelaStudenata.getSelectedRow() < 0)
//			return;
//		else {
//			int selektovaniRed = MyTabbedPane.getInstance().tabelaStudenata.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaStudenata.getSelectedRow());
//			Student student = BazaStudenta.getInstance().getRow(selektovaniRed);
//		
//			if (student.getPredmeti()==null) {
//				string.append("Nema predmeta");
//			}else {
//				for (Predmet predmet: student.getPredmeti()) {
//					string.append(predmet);
//				}
//			}
//		}
//		
//		
//		spisak.setText(string.toString());
//		
//		JScrollPane scrollPane = new JScrollPane(spisak, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		
//		add(scrollPane);
	}
	
	
}
