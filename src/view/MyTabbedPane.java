package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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
		JLabel secondLabel = new JLabel("Second!");
		
		firstPanel.add(firstLabel);
		secondPanel.add(secondLabel);
		
		this.addTab("Studenti", firstPanel);
		this.addTab("Profesori", secondPanel);
		this.addTab("Predmeti", thirdPanel);
		
		this.setTabPlacement(pozicija);
		
	
		//JTabbedPane tabbedPane = new JTabbedPane();
	
		
//		tabbedPane.add("Studenti",firstPanel);
//		tabbedPane.add("Profesori",secondPanel);
//		tabbedPane.add("Predmeti",thirdPanel);
//		
//		add(tabbedPane);
	}
	
		@Override
		public void addTab(String title, Component component) {
			super.addTab(title, component);
		}
		
		public int getTab() {
			return this.getSelectedIndex();
		}
	

}
