package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
        setTitle("Studentska služba");
        //Postavljamo akciju pri zatvaranju prozora
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //postavljamo JFrame na centar ekrana
        setLocationRelativeTo(null);
        // postavljamo boju pozadine
        getContentPane().setBackground(Color.WHITE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{1422, 0};
        gridBagLayout.rowHeights = new int[]{76, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        getContentPane().setLayout(gridBagLayout);
        
        MyToolbar toolbar = new MyToolbar();
        GridBagConstraints gbc_toolbar = new GridBagConstraints();
        gbc_toolbar.insets = new Insets(0, 0, 5, 0);
        gbc_toolbar.anchor = GridBagConstraints.NORTHWEST;
        gbc_toolbar.gridx = 0;
        gbc_toolbar.gridy = 0;
        getContentPane().add(toolbar, gbc_toolbar);
        
        MyTabbedPane tabbedPane = new MyTabbedPane();
        tabbedPane.setBackground(Color.WHITE);
        tabbedPane.setForeground(new Color(0, 0, 0));
        tabbedPane.setBorder(null);
        GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
        gbc_tabbedPane.fill = GridBagConstraints.BOTH;
        gbc_tabbedPane.gridx = 0;
        gbc_tabbedPane.gridy = 1;
        getContentPane().add(tabbedPane, gbc_tabbedPane);
        tabbedPane.setLayout(new BoxLayout(tabbedPane, BoxLayout.X_AXIS));
        
        setVisible(true);
        
	}

}