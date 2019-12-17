package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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

        
//        MyToolbar toolbar = new MyToolbar();
//
//        getContentPane().add(toolbar,BorderLayout.NORTH);
        
        MyTabbedPane tabbedPane = new MyTabbedPane(JTabbedPane.TOP);
        tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
        MyToolbar toolbar = new MyToolbar();
        getContentPane().add(toolbar,BorderLayout.NORTH);
        ProfToolbar proftoolbar=new ProfToolbar();
        PredmetToolBar predmettoolbar = new PredmetToolBar();
        
        tabbedPane.addChangeListener(new ChangeListener() {
			@SuppressWarnings("deprecation")
			public void stateChanged(ChangeEvent evt) {

			    JTabbedPane tabbedPane = (JTabbedPane)evt.getSource();

			    

			    // Get current tab

			    int tab = tabbedPane.getSelectedIndex();

			    if (tab==0) {
			    	proftoolbar.hide();
			    	predmettoolbar.hide();
			    	toolbar.show();
			    	//MyToolbar toolbar=new MyToolbar();
			    	getContentPane().add(toolbar,BorderLayout.NORTH);
			    } else if (tab==1) {
			    	predmettoolbar.hide();
			    	toolbar.hide();
			    	proftoolbar.show();
			    	//ProfToolbar proftoolbar=new ProfToolbar();
			    	getContentPane().add(proftoolbar,BorderLayout.NORTH);
			    }
			    else {
			    	toolbar.hide();
			    	proftoolbar.hide();
			    	predmettoolbar.show();
			    	//PredmetToolBar predmettoolbar = new PredmetToolBar();
		            getContentPane().add(predmettoolbar,BorderLayout.NORTH);
			    }

			}

		    });
        
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