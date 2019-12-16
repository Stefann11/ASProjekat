package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import model.PredmetTableModel;
import model.ProfesorTableModel;

public class MyTabbedPane extends JTabbedPane{
	
	private static final long serialVersionUID = 5282778494633945639L;
	
	public MyTabbedPane(int pozicija) {
		JPanel firstPanel = new JPanel();
		JPanel secondPanel = new JPanel();
		JPanel thirdPanel = new JPanel();
		
		firstPanel.setBackground(Color.WHITE);
		secondPanel.setBackground(Color.WHITE);
		thirdPanel.setBackground(Color.WHITE);
		
		JLabel firstLabel = new JLabel("First!");
		
		
		
		//ZA PROFESORE
		
		JScrollPane scrollProf= new JScrollPane();
		JTable tabProf= new JTable(new ProfesorTableModel());
		secondPanel.add(scrollProf);
		scrollProf.setViewportView(tabProf);
		
		
		//KRAJ PROFESORA
		
		
		
		
		//ZA PREDMETE

		JScrollPane scrollPred= new JScrollPane();
		JTable tabPred= new JTable(new PredmetTableModel());
		thirdPanel.add(scrollPred);
		scrollPred.setViewportView(tabPred);
		
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
		
		public int getTab() {
			return this.getSelectedIndex();
		}
	

}
