package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyTabbedPane extends JPanel{
	
	private static final long serialVersionUID = 5282778494633945639L;
	
	public MyTabbedPane() {
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
	
		JTabbedPane tabbedPane = new JTabbedPane();
	
		
		tabbedPane.add("Studenti",firstPanel);
		tabbedPane.add("Profesori",secondPanel);
		tabbedPane.add("Predmeti",thirdPanel);
		add(tabbedPane);
	}

}
