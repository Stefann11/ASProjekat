package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MyMenuBar  extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyMenuBar() {

		JMenu file = new JMenu("File");
		//file.setMnemonic(KeyEvent.VK_F); // Create shortcut
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem miNew = new JMenuItem("New");
		miNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (GlavniProzor.otvoreniTab==0) {
				DodavanjeStudenta dp=new DodavanjeStudenta();			
				dp.setVisible(true);
				}
				
				
				else if(GlavniProzor.otvoreniTab==1) {
					DodavanjeProfesora dp=new DodavanjeProfesora();
					dp.setVisible(true);
				}
				
				else {
					DodavanjePredmeta dp=new DodavanjePredmeta();
					dp.setVisible(true);
				}
			}
		});
		miNew.setMnemonic(KeyEvent.VK_N);
		miNew.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		JMenuItem miClose = new JMenuItem("Close");
		miClose.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	                System.exit(0);
	        }
	    });
		miClose.setMnemonic(KeyEvent.VK_C);
		miClose.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		miNew.setIcon(new ImageIcon("images/add-icon2.png"));
		miClose.setIcon(new ImageIcon("images/delete-icon.png"));

		file.add(miNew);
		file.add(miClose);
		

		

		JMenu edit = new JMenu("Edit");
		edit.setMnemonic('E'); // Create shortcut
		JMenuItem miEdit = new JMenuItem("Edit");
		miEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (GlavniProzor.otvoreniTab==0) {
				IzmenaStudenta dp=new IzmenaStudenta();			
				dp.setVisible(true);
				}
				
				
				else if(GlavniProzor.otvoreniTab==1) {
					IzmenaProfesora dp=new IzmenaProfesora();
					dp.setVisible(true);
				}
				
				else {
					IzmenaPredmeta dp=new IzmenaPredmeta();
					dp.setVisible(true);
				}
			}
		});	
		
		
		
		miEdit.setMnemonic(KeyEvent.VK_E);
		miEdit.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		JMenuItem miDelete = new JMenuItem("Delete");
		miDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (GlavniProzor.otvoreniTab==0) {
				BrisanjeStudenta dp=new BrisanjeStudenta();			
				dp.setVisible(true);
				}
				
				
				else if(GlavniProzor.otvoreniTab==1) {
					BrisanjeProfesora dp=new BrisanjeProfesora();
					dp.setVisible(true);
				}
				
				else {
					BrisanjePredmeta dp=new BrisanjePredmeta();
					dp.setVisible(true);
				}
			}
		});	
		
		
		
		
		
		miDelete.setMnemonic(KeyEvent.VK_D);
		miDelete.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		miEdit.setIcon(new ImageIcon("images/edit-icon2.png"));
		miDelete.setIcon(new ImageIcon("images/delete-icon.png"));

		edit.add(miEdit);
		edit.add(miDelete);

		
		
		
		JMenu help = new JMenu("Help");
		help.setMnemonic('H'); // Create shortcut
		JMenuItem miHelp = new JMenuItem("Help");
		miHelp.setMnemonic(KeyEvent.VK_H);
		miHelp.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		JMenuItem miAbout = new JMenuItem("About");
		miAbout.setMnemonic(KeyEvent.VK_A);
		miAbout.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		miHelp.setIcon(new ImageIcon("images/help-icon.png"));
		miAbout.setIcon(new ImageIcon("images/about-icon.png"));

		help.add(miHelp);
		help.add(miAbout);

		add(file);
		add(edit);
		add(help);

	}

}
