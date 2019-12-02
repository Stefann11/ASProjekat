package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class GlavniProzor extends JFrame{

	private static final long serialVersionUID = 2150977017400959913L;
	
	public GlavniProzor() {
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        // Podesavamo dimenzije prozora na polovinu dimenzija ekrana
        setSize(3 * screenWidth / 4, 3 * screenHeight / 4);
        //Podesavamo naslov
        setTitle("Studentska slu�ba");
        //Postavljamo akciju pri zatvaranju prozora
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //postavljamo JFrame na centar ekrana
        setLocationRelativeTo(null);
        // postavljamo boju pozadine
          getContentPane().setBackground(Color.WHITE);
//        GridBagLayout gridBagLayout = new GridBagLayout();
//        gridBagLayout.columnWidths = new int[]{1422, 0};
//        gridBagLayout.rowHeights = new int[]{76, 483, 0, 0, 0, 82, 64, 0};
//        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
//        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//        getContentPane().setLayout(gridBagLayout);
        
        MyToolbar toolbar = new MyToolbar();
//        GridBagConstraints gbc_toolbar = new GridBagConstraints();
//        gbc_toolbar.fill = GridBagConstraints.HORIZONTAL;
//        gbc_toolbar.insets = new Insets(0, 0, 5, 0);
//        gbc_toolbar.anchor = GridBagConstraints.NORTH;
//        gbc_toolbar.gridx = 0;
//        gbc_toolbar.gridy = 0;
        getContentPane().add(toolbar,BorderLayout.NORTH);
        
        MyTabbedPane tabbedPane = new MyTabbedPane();
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        tabbedPane.setLayout(new BoxLayout(tabbedPane, BoxLayout.X_AXIS));
        
		
		
		myStatusBar statusBar = new myStatusBar();
		statusBar.setBackground(Color.WHITE);
//		statusBar.setBackground(Color.GRAY);
//		statusBar.setText("rr");
//		GridBagConstraints gbc_statusBar = new GridBagConstraints();
//		gbc_statusBar.insets = new Insets(0, 0, 5, 0);
//		gbc_statusBar.gridx = 0;
//		gbc_statusBar.gridy = 6;
		getContentPane().add(statusBar, BorderLayout.SOUTH);
        
        
		
        MyMenuBar menu = new MyMenuBar();
        this.setJMenuBar(menu);
		
        
        setVisible(true);
        
	}

}