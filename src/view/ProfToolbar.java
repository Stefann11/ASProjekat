package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class ProfToolbar extends JToolBar{

	private static final long serialVersionUID = -2714410407038947655L;
	
	public ProfToolbar() {
		
		super(SwingConstants.HORIZONTAL);
		
		JPanel panelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnAdd = new JButton();
		btnAdd.setToolTipText("Dodaj Profesora");
		btnAdd.setIcon(new ImageIcon("images/add-icon.png"));
		panelLeft.add(btnAdd);

		JButton btnEdit = new JButton();
		btnEdit.setToolTipText("Izmeni Profesora");
		btnEdit.setIcon(new ImageIcon("images/edit-icon.png"));
		//btnEdit.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnEdit);

		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Obrisi profesora");
		btnDelete.setIcon(new ImageIcon("images/trash-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnDelete);
		
		JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 32));
        panelRight.add(textField);
		
		JButton btnSearch = new JButton();
		btnSearch.setToolTipText("Trazi profesora");
		btnSearch.setIcon(new ImageIcon("images/search-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelRight.add(btnSearch);
		
		add(panelLeft, BorderLayout.WEST);
		add(panelRight, BorderLayout.EAST);
		
btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DodavanjeProfesora dp= DodavanjeProfesora.getInstance();
				dp.setVisible(true);
				
			}
		});
	
btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BrisanjeProfesora bs=new BrisanjeProfesora();

				bs.setVisible(true);
				
			}
		});	

btnEdit.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		IzmenaProfesora dp=new IzmenaProfesora();
		
		dp.setVisible(true);
		
	}
});


		setBackground(Color.WHITE);

	}
	
	
}

