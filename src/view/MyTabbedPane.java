package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import model.StudentTableModel;

public class MyTabbedPane extends JTabbedPane{
	
	private static final long serialVersionUID = 5282778494633945639L;
	
	private JTable tabelaPredmeta; 
	private JTable tabelaProfesora;
	private JTable tabelaStudenata;
	
	public MyTabbedPane(int pozicija) {
		
		//ZA STUDENTA

		
		JScrollPane scrollStud= new JScrollPane();
		JTable tabStud= new JTable(new StudentTableModel());
		//firstPanel.add(scrollStud);
		scrollStud.setViewportView(tabStud);
		

//		
//		JScrollPane scrollStud= new JScrollPane();
//		JTable tabStud= new JTable(new StudentTableModel());
//		firstPanel.add(scrollStud);
//		scrollStud.setViewportView(tabStud);
//		
		tabelaStudenata = new StudJTable();

		JScrollPane scrollStud1 = new JScrollPane(tabelaStudenata);
		//firstPanel.add(scrollStud, BorderLayout.CENTER);
		//scrollStud1.setViewportView(tabelaStudenata); 
		tabelaStudenata.setAutoCreateRowSorter(true);
		
		//KRAJ STUDENTA
		
		//ZA PROFESORE
		
		
		tabelaProfesora = new ProfJTable();

		JScrollPane scrollProf = new JScrollPane(tabelaProfesora);
		tabelaProfesora.setAutoCreateRowSorter(true);
//		ProfAbstractTable modelProf = (ProfAbstractTable) tabelaProfesora.getModel();
//		modelProf.fireTableDataChanged();
//		validate();
		
		
		//KRAJ PROFESORA	
		
		//ZA PREDMETE
		
		tabelaPredmeta = new PredJTable();

		JScrollPane scrollPred = new JScrollPane(tabelaPredmeta);
		
//		PredAbstractTable model = (PredAbstractTable) tabelaPredmeta.getModel();
//		model.fireTableDataChanged();
//		validate();

		//this.azurirajPrikaz(null, -1);
		
		//KRAJ PREDMETA
		
		this.addTab("Studenti", scrollStud1);
		this.addTab("Profesori", scrollProf);
		this.addTab("Predmeti", scrollPred);
		
		this.setTabPlacement(pozicija);
		
		
		
		
		
	}
	
		@Override
		public void addTab(String title, Component component) {
			super.addTab(title, component);
		}
		


}
