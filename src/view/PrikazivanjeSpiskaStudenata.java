package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
	
	
	public PrikazivanjeSpiskaStudenata() {
		setModal(false);
		setTitle("Spisak studenata");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth/4, screenHeight/4);
        setLocationRelativeTo(null);
        
        final DefaultListModel model = new DefaultListModel();
        
        JList studentiList;
		
        int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
        if (selektovaniRed<0) {
			return;
		}
        else {
        	Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
        	for(Student student : predmet.getSpisakStudenata()) {
        		model.addElement(student.toString());

        	}
        }
		//setVisible(true);
        studentiList=new JList(model);
		
		JScrollPane scrollPane = new JScrollPane(studentiList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JPanel panelCentral = new JPanel();
		panelCentral.add(scrollPane);
		

		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        
        
        
		
		
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
				
				
				int i = studentiList.getSelectedIndex();
				if (i != -1) {
				   
				
				String indeks = (String) studentiList.getSelectedValue();
				indeks = indeks.trim();
				BazaPredmeta.getInstance().obrisiStudentaSaPredmeta(selektovaniRed, indeks);
				
				model.remove(i);
				
				}
				else {
					JOptionPane.showMessageDialog(null, "Niste odabrali studenta.");
				}
				
				
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
