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


public class myStatusBar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	public myStatusBar() {
        super();
        setLayout(new BorderLayout());
        
        Label studentska_sluzba=new Label("Studentska sluzba");
        
        Date date2=new Date();
        SimpleDateFormat datum_format = new SimpleDateFormat("HH:mm  dd.MM.yyyy. ");
        Label timedate=new Label(datum_format(date2));
        
        Timer timer = new Timer(1000, new ActionListener() {
      		@Override
			public void actionPerformed(ActionEvent evt) {
				Date date = new Date();
        		timedate.setText(datum_format.format(date));
			}
        });
        
        timer.start();
        timedate.setPreferredSize(new Dimension(110, 10));
        this.add(timedate, BorderLayout.EAST);
        this.add(studentska_sluzba, BorderLayout.WEST);
       // this.setPreferredSize(new Dimension(1, 19));
        
        
	}



	private String datum_format(Date date2) {
		// TODO Auto-generated method stub
		return null;
	}
}
