package view;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class myStatusBar extends JLabel{
	public myStatusBar() {
        super();
        super.setPreferredSize(new Dimension(100, 16));
        setMessage("Ready");
    }

	private void setMessage(String message) {
		// TODO Auto-generated method stub
		setText(" "+message); 
		
	}
}
