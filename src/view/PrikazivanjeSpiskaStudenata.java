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
import javax.swing.JPanel;

import model.BazaPredmeta;
import model.Student;

public class PrikazivanjeSpiskaStudenata extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6038128757439857324L;
	public JComboBox cb = new JComboBox();
	
	private static PrikazivanjeSpiskaStudenata instance = null;

	public static PrikazivanjeSpiskaStudenata getInstance() {
		if (instance == null) {
			instance = new PrikazivanjeSpiskaStudenata();
		}
		return instance;
	}
	
	public void dodajStudentaNaCombobox(Student s){
		cb.addItem(s.toString());
	}
	
	private PrikazivanjeSpiskaStudenata() {
		setModal(false);
		setTitle("Spisak studenata");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth/4, screenHeight/4);
        setLocationRelativeTo(null);
		//setVisible(true);
		JPanel panelCentral = new JPanel();
		setLayout(new BorderLayout());
		panelCentral.add(cb);
		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
		JButton btnOdustanak = new JButton("Odustanak");
		
		
		JButton btnPotvrda = new JButton("Obrisi");
		panelZaDugmice.add(btnOdustanak);
		panelZaDugmice.add(btnPotvrda);
		
		
		
		add(panelZaDugmice, BorderLayout.SOUTH);
		add(panelCentral, BorderLayout.CENTER);
		
		btnPotvrda.addActionListener(new ActionListener() {
			
			@Override
		public void actionPerformed(ActionEvent e) {
				int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
				if (selektovaniRed<0) {
					return;
				}
				else {
					String indeks=cb.getSelectedItem().toString();
					BazaPredmeta.getInstance().obrisiStudentaSaPredmeta(selektovaniRed, indeks);
					cb.removeItem(indeks);
				}
				
				
			}
		});
		
		
		
		
		btnOdustanak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		
		
		
		
//		StringBuilder string = new StringBuilder();
//		
//		int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
//		Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
//		
//		for (Student student: BazaStudenta.getInstance().getStudenti()) {
//			if (student.getPredmeti()==null) {
//				string.append("Nema studenata.");
//				break;
//			} else {
//				for (Predmet pr : student.getPredmeti()) {
//					if (pr.getSifraPredmeta().equals(predmet.getSifraPredmeta())) {
//						string.append(student);
//					}
//				}
//			}
//			
//		}
		
//		spisakStudenata.setText(string.toString());
//		
//		JScrollPane scrollPane = new JScrollPane(spisakStudenata, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		
//		add(scrollPane);
	}
	
}
