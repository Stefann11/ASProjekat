package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
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
	
	public PrikazivanjeSpiskaPredmetaZaProfesora(){
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
		Font font = new Font("Ariel", Font.BOLD, 15);
		spisak.setFont(font);
		JList predmetiList;
		final DefaultListModel model = new DefaultListModel();
		
		
		if (MyTabbedPane.getInstance().tabelaProfesora.getSelectedRow()<0)
			return;
		else {
			int selektovaniRed=MyTabbedPane.getInstance().tabelaProfesora.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaProfesora.getSelectedRow());
			Profesor profesor = BazaProfesora.getInstance().getRow(selektovaniRed);
			if (profesor.getPredmeti()!=null) {
				for (Predmet predmet: profesor.getPredmeti()) {
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
//		
//		
//		if (MyTabbedPane.getInstance().tabelaProfesora.getSelectedRow()<0)
//			return;
//		else {
//			int selektovaniRed=MyTabbedPane.getInstance().tabelaProfesora.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaProfesora.getSelectedRow());
//			Profesor profesor = BazaProfesora.getInstance().getRow(selektovaniRed);
//		
//			if (profesor.getPredmeti()==null) {
//				string.append("Nema predmeta");
//			}else {
//				for (Predmet predmet: profesor.getPredmeti()) {
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
