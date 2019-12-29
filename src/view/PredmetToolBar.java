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

public class PredmetToolBar extends JToolBar{

	private static final long serialVersionUID = -2714410407038947655L;
	
	public PredmetToolBar() {
		
		super(SwingConstants.HORIZONTAL);
		
		JPanel panelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnAdd = new JButton();
		btnAdd.setToolTipText("Dodaj predmet");
		btnAdd.setIcon(new ImageIcon("images/add-icon.png"));
		panelLeft.add(btnAdd);

		JButton btnEdit = new JButton();
		btnEdit.setToolTipText("Izmeni predmet");
		btnEdit.setIcon(new ImageIcon("images/edit-icon.png"));
		//btnEdit.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnEdit);

		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Obrisi predmet");
		btnDelete.setIcon(new ImageIcon("images/trash-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnDelete);
		
		JButton btnAddStudent = new JButton();
		btnAddStudent.setToolTipText("Dodaj studenta na predmet");
		btnAddStudent.setIcon(new ImageIcon("images/add-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnAddStudent);
		
		JButton btnAddProf = new JButton();
		btnAddProf.setToolTipText("Dodaj profesora na predmet");
		btnAddProf.setIcon(new ImageIcon("images/prof-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnAddProf);
		
		JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 32));
        panelRight.add(textField);
		
		JButton btnSearch = new JButton();
		btnSearch.setToolTipText("Trazi predmet");
		btnSearch.setIcon(new ImageIcon("images/search-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelRight.add(btnSearch);
		
		add(panelLeft, BorderLayout.WEST);
		add(panelRight, BorderLayout.EAST);
		
		
	
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DodavanjePredmeta dp=new DodavanjePredmeta();
				dp.setVisible(true);
				
			}
		});
		
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IzmenaPredmeta dp=new IzmenaPredmeta();
				dp.setVisible(true);
				
			}
		});
	
btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BrisanjePredmeta bp=new BrisanjePredmeta();
		   
				bp.setVisible(true);
				
			}
		});

btnAddStudent.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DodavanjeStudentaNaPredmet ds=new DodavanjeStudentaNaPredmet();
		ds.setVisible(true);
		
	}
});

btnAddProf.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DodavanjeProfesoraNaPredmet dp=new DodavanjeProfesoraNaPredmet();
		dp.setVisible(true);
		
	}
});

		setBackground(Color.WHITE);

	}

}