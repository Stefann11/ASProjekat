package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PredmetiController;
import model.BazaPredmeta;
import model.GodinaStudija;
import model.Predmet;

public class DodavanjePredmeta extends JDialog{
	
	public DodavanjePredmeta() {
		setModal(true);
		setTitle("Dodavanje predmeta");
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Šifra predmeta *");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(20, 10, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(20, 0, 5, 0);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNazivPredmeta = new JLabel("Naziv predmeta *");
		GridBagConstraints gbc_lblNazivPredmeta = new GridBagConstraints();
		gbc_lblNazivPredmeta.anchor = GridBagConstraints.WEST;
		gbc_lblNazivPredmeta.gridwidth = 2;
		gbc_lblNazivPredmeta.insets = new Insets(5, 10, 5, 5);
		gbc_lblNazivPredmeta.gridx = 0;
		gbc_lblNazivPredmeta.gridy = 2;
		panel.add(lblNazivPredmeta, gbc_lblNazivPredmeta);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSemestarPredmeta = new JLabel("Semestar *");
		GridBagConstraints gbc_lblSemestarPredmeta = new GridBagConstraints();
		gbc_lblSemestarPredmeta.anchor = GridBagConstraints.WEST;
		gbc_lblSemestarPredmeta.gridwidth = 2;
		gbc_lblSemestarPredmeta.insets = new Insets(5, 10, 5, 5);
		gbc_lblSemestarPredmeta.gridx = 0;
		gbc_lblSemestarPredmeta.gridy = 4;
		panel.add(lblSemestarPredmeta, gbc_lblSemestarPredmeta);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 4;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGodinaStudija = new JLabel("Godina studija *");
		GridBagConstraints gbc_lblGodinaStudija = new GridBagConstraints();
		gbc_lblGodinaStudija.anchor = GridBagConstraints.WEST;
		gbc_lblGodinaStudija.gridwidth = 2;
		gbc_lblGodinaStudija.insets = new Insets(5, 10, 5, 5);
		gbc_lblGodinaStudija.gridx = 0;
		gbc_lblGodinaStudija.gridy = 6;
		panel.add(lblGodinaStudija, gbc_lblGodinaStudija);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 6;
		panel.add(comboBox, gbc_comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PRVA", "DRUGA", "TREĆA", "ČETVRTA"}));
		comboBox.setToolTipText("");
		
//		JLabel lblPredmetniProfesor = new JLabel("Predmetni profesor *");
//		GridBagConstraints gbc_lblPredmetniProfesor = new GridBagConstraints();
//		gbc_lblPredmetniProfesor.anchor = GridBagConstraints.WEST;
//		gbc_lblPredmetniProfesor.gridwidth = 2;
//		gbc_lblPredmetniProfesor.insets = new Insets(5, 10, 5, 5);
//		gbc_lblPredmetniProfesor.gridx = 0;
//		gbc_lblPredmetniProfesor.gridy = 8;
//		panel.add(lblPredmetniProfesor, gbc_lblPredmetniProfesor);
//		
//		textField_4 = new JTextField();
//		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
//		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textField_4.gridwidth = 3;
//		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
//		gbc_textField_4.gridx = 3;
//		gbc_textField_4.gridy = 8;
//		panel.add(textField_4, gbc_textField_4);
//		textField_4.setColumns(10);
//		
//		JLabel lblSpisakStudenata = new JLabel("Spisak studenata *");
//		GridBagConstraints gbc_lblSpisakStudenata = new GridBagConstraints();
//		gbc_lblSpisakStudenata.anchor = GridBagConstraints.WEST;
//		gbc_lblSpisakStudenata.gridwidth = 2;
//		gbc_lblSpisakStudenata.insets = new Insets(5, 10, 20, 5);
//		gbc_lblSpisakStudenata.gridx = 0;
//		gbc_lblSpisakStudenata.gridy = 10;
//		panel.add(lblSpisakStudenata, gbc_lblSpisakStudenata);
//		
//		textField_5 = new JTextField();
//		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
//		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textField_5.gridwidth = 3;
//		gbc_textField_5.insets = new Insets(0, 0, 20, 0);
//		gbc_textField_5.gridx = 3;
//		gbc_textField_5.gridy = 10;
//		panel.add(textField_5, gbc_textField_5);
//		textField_5.setColumns(10);
		
		JPanel panelDugm = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(panelDugm, BorderLayout.SOUTH);

		
		JButton btnOdustanak = new JButton("Odustanak");
		JButton btnPotvrda = new JButton("Potvrda");
		
		panelDugm.add(btnOdustanak);
		panelDugm.add(btnPotvrda);
		
		btnPotvrda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sifra=textField.getText();
				String naziv=textField_1.getText();
				int semestar=Integer.parseInt(textField_2.getText());
				String g=comboBox.getSelectedItem().toString();
				GodinaStudija god=GodinaStudija.valueOf(g);
				
				PredmetiController.getInstance().DodajPredmet(sifra, naziv, semestar, god);
				
				for (Predmet pr: BazaPredmeta.getInstance().getPredmeti())
					System.out.println(pr);
				
				
				dispose();
			}
		});
		
		btnOdustanak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
	}

	private static final long serialVersionUID = -7228140508317519762L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	//private JTextField textField_4;
	//private JTextField textField_5;
	

}
