package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PredmetiController;
import model.IntegerKeyListener;

public class DodavanjeProfesoraNaPredmet extends JDialog{

	private static final long serialVersionUID = 729002353215829058L;
	
	private JTextField textField;
	private JButton btnPotvrda = new JButton("Potvrda");
	
	private static DodavanjeProfesoraNaPredmet instance = null;

	public static DodavanjeProfesoraNaPredmet getInstance() {
		if (instance == null) {
			instance = new DodavanjeProfesoraNaPredmet();
		}
		return instance;
	}
	
	private DodavanjeProfesoraNaPredmet() {
		
		
		setModal(false);
		setTitle("Dodavanje profesora na predmet");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth/4, screenHeight/7);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
		//setVisible(true);
		JPanel panelCentar = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Broj licne karte profesora*");
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 32));
		
		panelCentar.add(label);
		panelCentar.add(textField);
		
		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
		JButton btnOdustanak = new JButton("Odustanak");
		
		
		panelZaDugmice.add(btnOdustanak);
		panelZaDugmice.add(btnPotvrda);
		
		btnPotvrda.setEnabled(false);
		
		
		
		add(panelZaDugmice, BorderLayout.SOUTH);
		add(panelCentar, BorderLayout.CENTER);
		
		KeyListener keyListener=new IntegerKeyListener();
		
		textField.addKeyListener(keyListener);
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (textField.getText().isEmpty()) {
					btnPotvrda.setEnabled(false);
				} else {
					btnPotvrda.setEnabled(true);
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		btnPotvrda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int broj = Integer.parseInt(textField.getText());
				
				if (MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "Niste izabrali predmet");
					dispose();
					//return;
				} else {
				
				int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
					PredmetiController.getInstance().dodavanjeProfesoraNaPredmet(selektovaniRed, broj);
					dispose();
					textField.setText("");
				}

			}
		});
		
		btnOdustanak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				textField.setText("");
				
			}
		});
		
	}
		
	
		
		

}
