package view;

import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.BazaPredmeta;

public class MyTabbedPane extends JTabbedPane{
	
	private static final long serialVersionUID = 5282778494633945639L;
	
	private static MyTabbedPane instance = null;

	public static MyTabbedPane getInstance() {
		if (instance == null) {
			instance = new MyTabbedPane();
		}
		return instance;
	}
	
	public JTable tabelaPredmeta; 
	public JTable tabelaProfesora;
	public JTable tabelaStudenata;
	
	@SuppressWarnings("unchecked")
	private MyTabbedPane() {
		
		//ZA STUDENTA

		
//		JScrollPane scrollStud= new JScrollPane();
//		JTable tabStud= new JTable(new StudentTableModel());
		//firstPanel.add(scrollStud);
	//	scrollStud.setViewportView(tabStud);
		

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
		
		//tabelaPredmeta.setAutoCreateRowSorter(true);
		tabelaPredmeta.setRowSorter(new TableRowSorter<TableModel>(tabelaPredmeta.getModel()));
		
		int[] selection=tabelaPredmeta.getSelectedRows();	
		for (int i = 0; i < selection.length; i++) {
			selection[i] = tabelaPredmeta.convertRowIndexToModel(selection[i]);
		}

		JScrollPane scrollPred = new JScrollPane(tabelaPredmeta);
		
		
		
//		PredAbstractTable model = (PredAbstractTable) tabelaPredmeta.getModel();
//		model.fireTableDataChanged();
//		validate();

		//this.azurirajPrikaz(null, -1);
		
		//KRAJ PREDMETA
		
		this.addTab("Studenti", scrollStud1);
		this.addTab("Profesori", scrollProf);
		this.addTab("Predmeti", scrollPred);
		
		
		
		
		
	}
	
		@Override
		public void addTab(String title, Component component) {
			super.addTab(title, component);
		}
		


}
