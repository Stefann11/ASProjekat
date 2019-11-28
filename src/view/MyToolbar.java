package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class MyToolbar extends JToolBar{

	private static final long serialVersionUID = -2714410407038947655L;
	
	public MyToolbar() {
		
		super(SwingConstants.HORIZONTAL);


		JButton btnEdit = new JButton();
		btnEdit.setToolTipText("Edit");
		btnEdit.setIcon(new ImageIcon("images/edit-icon.png"));
		//btnEdit.setPreferredSize(new Dimension(25, 25));
		add(btnEdit);
		
		JButton btnAdd = new JButton();
		btnAdd.setToolTipText("Add");
		btnAdd.setIcon(new ImageIcon("images/add-icon.png"));
		btnAdd.setPreferredSize(new Dimension(32, 32));
		add(btnAdd);


		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Delete");
		btnDelete.setIcon(new ImageIcon("images/trash-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		add(btnDelete);

		setBackground(Color.WHITE);

	}

}
