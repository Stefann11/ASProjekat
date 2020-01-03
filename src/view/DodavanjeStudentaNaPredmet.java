package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PredmetiController;
import model.IntegerKeyListener;

public class DodavanjeStudentaNaPredmet extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6032232686414917989L;

	private JTextField textField;
	private JButton btnPotvrda = new JButton("Potvrda");
	
	private static DodavanjeStudentaNaPredmet instance = null;

	public static DodavanjeStudentaNaPredmet getInstance() {
		if (instance == null) {
			instance = new DodavanjeStudentaNaPredmet();
		}
		return instance;
	}
	
	private DodavanjeStudentaNaPredmet() {
		
		
		setModal(false);
		setTitle("Dodavanje studenta na predmet");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth/4, screenHeight/7);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
		//setVisible(true);
		JPanel panelCentar = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Broj indeksa studenta?*");
		
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
		
		//KeyListener keyListener=new IntegerKeyListener();
		
		//textField.addKeyListener(keyListener);
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

				String indeks = textField.getText();
				
				if (MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "Niste izabrali predmet");
					dispose();
					//return;
				} else {
				
				int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
					PredmetiController.getInstance().dodavanjeStudentaNaPredmet(selektovaniRed, indeks);
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
