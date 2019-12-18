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
	
	public MyTabbedPane(int pozicija) {
		JPanel firstPanel = new JPanel();
		JPanel secondPanel = new JPanel();
		JPanel thirdPanel = new JPanel();
		
		firstPanel.setBackground(Color.WHITE);
		secondPanel.setBackground(Color.WHITE);
		thirdPanel.setBackground(Color.WHITE);
		
		
		//ZA STUDENTA
		
		JScrollPane scrollStud= new JScrollPane();
		JTable tabStud= new JTable(new StudentTableModel());
		firstPanel.add(scrollStud);
		scrollStud.setViewportView(tabStud);
		
		
		//KRAJ STUDENTA
		
		//ZA PROFESORE
		
//		JScrollPane scrollProf= new JScrollPane();
//		JTable tabProf= new JTable(new ProfesorTableModel());
//		secondPanel.add(scrollProf);
//		scrollProf.setViewportView(tabProf);
		
		tabelaProfesora = new ProfJTable();

		JScrollPane scrollProf = new JScrollPane(tabelaProfesora);
		secondPanel.add(scrollProf, BorderLayout.CENTER);
		
//		ProfAbstractTable modelProf = (ProfAbstractTable) tabelaProfesora.getModel();
//		modelProf.fireTableDataChanged();
//		validate();
		
		
		//KRAJ PROFESORA
		
	
		
		
		//ZA PREDMETE

//		JScrollPane scrollPred= new JScrollPane();
//		JTable tabPred= new JTable(new PredmetTableModel());
//		thirdPanel.add(scrollPred);
//		scrollPred.setViewportView(tabPred);
//		tabPred.setAutoCreateRowSorter(true);
		
		tabelaPredmeta = new PredJTable();

		JScrollPane scrollPred = new JScrollPane(tabelaPredmeta);
		thirdPanel.add(scrollPred, BorderLayout.CENTER);
		
//		PredAbstractTable model = (PredAbstractTable) tabelaPredmeta.getModel();
//		model.fireTableDataChanged();
//		validate();

		//this.azurirajPrikaz(null, -1);
		
		//KRAJ PREDMETA
		
		this.addTab("Studenti", firstPanel);
		this.addTab("Profesori", secondPanel);
		this.addTab("Predmeti", thirdPanel);
		
		this.setTabPlacement(pozicija);
		
		
		
		
		
	}
	
		@Override
		public void addTab(String title, Component component) {
			super.addTab(title, component);
		}
		


}
