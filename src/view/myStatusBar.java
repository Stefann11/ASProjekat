package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panel3  = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel status1 = new JLabel("Studentska sluzba");
		JLabel status2 = new JLabel("time");
		panel2.add(status1);
		panel3.add(status2);
        add(panel2, BorderLayout.WEST);
        add(panel3, BorderLayout.EAST);
        
        
        //JLabel statusLabel = new JLabel("status");
        //statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        //add(statusLabel);
    }


}
