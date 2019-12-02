package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.FlowLayout;
import java.awt.Font;

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

        
        MyToolbar toolbar = new MyToolbar();

        getContentPane().add(toolbar,BorderLayout.NORTH);
        
        MyTabbedPane tabbedPane = new MyTabbedPane(JTabbedPane.TOP);
        tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
//        if (tabbedPane.getTab()==0) {
//        	MyToolbar toolbar = new MyToolbar();
//
//            getContentPane().add(toolbar,BorderLayout.NORTH);
//        }
//        
//        else {
//        	PredmetToolBar toolbar = new PredmetToolBar();
//
//            getContentPane().add(toolbar,BorderLayout.NORTH);
//        }
        
        
		
		myStatusBar statusBar = new myStatusBar();
		statusBar.setBackground(Color.WHITE);
		getContentPane().add(statusBar, BorderLayout.SOUTH);
        
        
		
        MyMenuBar menu = new MyMenuBar();
        this.setJMenuBar(menu);
		
        
        setVisible(true);
        
	}

}