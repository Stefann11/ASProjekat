package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.BazaPredmeta;
import model.Predmet;
import model.Student;

public class PrikazivanjeSpiskaStudenata extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6038128757439857324L;
	
	
//	private static PrikazivanjeSpiskaStudenata instance = null;
//
//	public static PrikazivanjeSpiskaStudenata getInstance() {
//		if (instance == null) {
//			instance = new PrikazivanjeSpiskaStudenata();
//		}
//		return instance;
//	}
//	
//	public void dodajStudentaNaCombobox(Student s){
//		cb.addItem(s.toString());
//	}
	
	public PrikazivanjeSpiskaStudenata() {
		setModal(false);
		setTitle("Spisak studenata");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth/4, screenHeight/4);
        setLocationRelativeTo(null);
        
        JList studentiList;
		String studentiString []= new String[100];
		
        int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
        if (selektovaniRed<0) {
			return;
		}
        else {
        	Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
        	int i=0;
        	for(Student student : predmet.getSpisakStudenata()) {
        		studentiString[i]=student.toString();
				i++;
        	}
        }
		//setVisible(true);
        studentiList=new JList(studentiString);
		
		JScrollPane scrollPane = new JScrollPane(studentiList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JPanel panelCentral = new JPanel();
		panelCentral.add(scrollPane);
		
//		JPanel panelCentral = new JPanel();
//		setLayout(new BorderLayout());
//		panelCentral.add(cb);
		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        
        
        
//        JComboBox cb = new JComboBox();
//        int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
//        if (selektovaniRed<0) {
//			return;
//		}
//        else {
//        	Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
//        	for(Student student : predmet.getSpisakStudenata()) {
//        		cb.addItem(student.toString());
//        	}
//        }
//		//setVisible(true);
//		JPanel panelCentral = new JPanel();
//		setLayout(new BorderLayout());
//		panelCentral.add(cb);
//		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
		JButton btnOdustanak = new JButton("Odustanak");
		
		
		JButton btnPotvrda = new JButton("Obrisi");
		panelZaDugmice.add(btnOdustanak);
		panelZaDugmice.add(btnPotvrda);
		
		add(scrollPane, BorderLayout.CENTER);
		//add(panelCentral, BorderLayout.CENTER);
		add(panelZaDugmice, BorderLayout.SOUTH);
		
		
		btnPotvrda.addActionListener(new ActionListener() {
			
			@Override
		public void actionPerformed(ActionEvent e) {
				
					String indeks=cb.getSelectedItem().toString();
					BazaPredmeta.getInstance().obrisiStudentaSaPredmeta(selektovaniRed, indeks);
					cb.removeItem(indeks);
				
				
				
			}
		});
		
		
		
		
		btnOdustanak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		
		
		
		

	}
	
}
