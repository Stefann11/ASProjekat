package view;

import java.awt.BorderLayout;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class myStatusBar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public myStatusBar() {
        super();
        //super.setPreferredSize(new Dimension(100, 16));
//        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//		JPanel panel3  = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		JLabel status1 = new JLabel("Studentska sluzba");
//		JLabel status2 = new JLabel("time");
//		panel2.add(status1);
//		panel3.add(status2);
//        add(panel2, BorderLayout.WEST);
//        add(panel3, BorderLayout.EAST);
        //JLabel statusLabel = new JLabel("status");
        //statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        //add(statusLabel);    
        
        
        
        
        long eventMask = 0;
        long eventMask2 = 0;
		
        Date datum = new Date(eventMask);
        Date sat = new Date(eventMask2);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm");
        String strDate = formatter.format(datum);

        setLayout(new BorderLayout(0,0));
        
        JLabel nazivLabel=new JLabel("Studentska služba");
        add(nazivLabel, BorderLayout.WEST);
        
        JPanel panel = new JPanel();
        add(panel, BorderLayout.EAST);
        
      //  JLabel lblNewLabel_1 = new JLabel("New label");
       // panel.add(lblNewLabel_1);
        
        JLabel datumLabel = new JLabel(strDate);
        panel.add(datumLabel);
        
//        JLabel nazivLabel=new JLabel("Studentska služba");
//        add(nazivLabel, BorderLayout.WEST);
//        
//        long eventMask = 0;
//        
//        Date curDate = new Date(eventMask);
//        
//        SimpleDateFormat format = new SimpleDateFormat();
//        String DateToStr = format.format(curDate);
//        //System.out.println("Default pattern: " + DateToStr);
//        format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//        DateToStr = format.format(curDate);
//        JPanel panel = new JPanel();
//        add(panel, BorderLayout.EAST);
//        JLabel datumLabel = new JLabel(DateToStr);
//        panel.add(datumLabel);
    }


}
