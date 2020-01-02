package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.Timer;


public class MyStatusBar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5260586352929905286L;
	

	
	public MyStatusBar() {
        super();
        setLayout(new BorderLayout());
        
        Label studentskaSluzba=new Label("Studentska sluzba");
        
   
        SimpleDateFormat datumFormat = new SimpleDateFormat("HH:mm  dd.MM.yyyy. ");
        Label timedate=new Label();
        
        Timer timer = new Timer(1000, new ActionListener() {
      		@Override
			public void actionPerformed(ActionEvent evt) {
				Date date = new Date();
        		timedate.setText(datumFormat.format(date));
			}
        });
        
        timer.start();
        timedate.setPreferredSize(new Dimension(110, 10));
        this.add(timedate, BorderLayout.EAST);
        this.add(studentskaSluzba, BorderLayout.WEST);
   
        
        
	}



	
}
