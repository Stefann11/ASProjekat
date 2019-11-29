package view;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MyMenuBar  extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyMenuBar() {

		JMenu file = new JMenu("File");
		file.setMnemonic('F'); // Create shortcut
		JMenu miNew = new JMenu("New");
		JMenuItem miProject = new JMenuItem("Project");
		JMenuItem miPackage = new JMenuItem("Package");
		miNew.add(miProject);
		miNew.addSeparator();
		miNew.add(miPackage);

		JMenuItem miOpen = new JMenuItem("Open");
		JMenuItem miClose = new JMenuItem("Close");
		JMenuItem miCloseAll = new JMenuItem("Close All");

		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miClose);
		file.add(miCloseAll);
		file.addSeparator();

		// radio button-i u ovom primeru rade kao grupa:
		ButtonGroup bg1 = new ButtonGroup();
		JRadioButtonMenuItem rmiInsert = new JRadioButtonMenuItem("Insert", true);
		JRadioButtonMenuItem rmiOver = new JRadioButtonMenuItem("Overtype");
		bg1.add(rmiInsert);
		bg1.add(rmiOver);

		file.add(rmiInsert);
		file.add(rmiOver);

		JMenu edit = new JMenu("Edit");
		edit.setMnemonic('E'); // Create shortcut
		JMenu help = new JMenu("Help");
		help.setMnemonic('H'); // Create shortcut

		add(file);
		add(edit);
		add(help);

	}

}
