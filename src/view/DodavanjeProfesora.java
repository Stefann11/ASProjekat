package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DodavanjeProfesora extends JDialog{
//	public DodavanjeProfesora() {
//	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 166974972717298340L;
	
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;
	private JTextField textFieldDatumRodjenja;
	private JTextField textFieldAdresaStanovanja;
	private JTextField textFieldBrojTelefona;
	private JTextField textFieldEmailAdresa;
	private JTextField textFieldKancelarija;
	private JTextField textFieldTitula;
	private JTextField textFieldZvanje;
	private JTextField textFieldBrojLicne;
	//private JTextField textFieldAdresaKancelarije;
//	private JTextField textFieldAdresaKancelarije2;
//	private JTextField textFieldAdresaKancelarije3;
//	private JTextField textFieldAdresaKancelarije4;
	//private ButtonGroup buttonGroup = new ButtonGroup();
	
//	public DodavanjeProfesora() {
//		setModal(true);
//		getContentPane().setBackground(Color.WHITE);
//		setTitle("Dodavanje Studenta");
//		getContentPane().setLayout(new BorderLayout(0, 0));
//		
//		JPanel panel = new JPanel();
//		getContentPane().add(panel);
//		GridBagLayout gbl_panel = new GridBagLayout();
//		panel.setLayout(gbl_panel);
//		
//		JLabel lblIme = new JLabel("Ime*");
//		GridBagConstraints gbc_lblIme = new GridBagConstraints();
//		gbc_lblIme.anchor = GridBagConstraints.WEST;
//		gbc_lblIme.insets = new Insets(30, 30, 10, 10);
//		gbc_lblIme.gridx = 0;
//		gbc_lblIme.gridy = 0;
//		panel.add(lblIme, gbc_lblIme);
//		
//		textFieldIme = new JTextField();
//		GridBagConstraints gbc_textFieldIme = new GridBagConstraints();
//		gbc_textFieldIme.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldIme.gridwidth = 5;
//		gbc_textFieldIme.insets = new Insets(30, 10, 10, 30);
//		gbc_textFieldIme.gridx = 1;
//		gbc_textFieldIme.gridy = 0;
//		panel.add(textFieldIme, gbc_textFieldIme);
//		textFieldIme.setColumns(10);
//		
//		JLabel lblNewLabel = new JLabel("Prezime*");
//		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
//		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel.gridx = 0;
//		gbc_lblNewLabel.gridy = 2;
//		panel.add(lblNewLabel, gbc_lblNewLabel);
//		
//		textFieldPrezime = new JTextField();
//		GridBagConstraints gbc_textFieldPrezime = new GridBagConstraints();
//		gbc_textFieldPrezime.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldPrezime.gridwidth = 5;
//		gbc_textFieldPrezime.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldPrezime.gridx = 1;
//		gbc_textFieldPrezime.gridy = 2;
//		panel.add(textFieldPrezime, gbc_textFieldPrezime);
//		textFieldPrezime.setColumns(10);
//		
//		JLabel lblNewLabel_1 = new JLabel("Datum rodjenja*");
//		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
//		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_1.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_1.gridx = 0;
//		gbc_lblNewLabel_1.gridy = 4;
//		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
//		
//		textFieldDatumRodjenja = new JTextField();
//		GridBagConstraints gbc_textFieldDatumRodjenja = new GridBagConstraints();
//		gbc_textFieldDatumRodjenja.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldDatumRodjenja.gridwidth = 5;
//		gbc_textFieldDatumRodjenja.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldDatumRodjenja.gridx = 1;
//		gbc_textFieldDatumRodjenja.gridy = 4;
//		panel.add(textFieldDatumRodjenja, gbc_textFieldDatumRodjenja);
//		textFieldDatumRodjenja.setColumns(10);
//		
//		JLabel lblNewLabel_2 = new JLabel("Adresa stanovanja*");
//		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
//		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_2.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_2.gridx = 0;
//		gbc_lblNewLabel_2.gridy = 6;
//		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
//		
//		textFieldAdresaStanovanja = new JTextField();
//		GridBagConstraints gbc_textFieldAdresaStanovanja = new GridBagConstraints();
//		gbc_textFieldAdresaStanovanja.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldAdresaStanovanja.gridwidth = 5;
//		gbc_textFieldAdresaStanovanja.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldAdresaStanovanja.gridx = 1;
//		gbc_textFieldAdresaStanovanja.gridy = 6;
//		panel.add(textFieldAdresaStanovanja, gbc_textFieldAdresaStanovanja);
//		textFieldAdresaStanovanja.setColumns(10);
//		
//		JLabel lblNewLabel_3 = new JLabel("Broj telefona*");
//		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
//		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_3.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_3.gridx = 0;
//		gbc_lblNewLabel_3.gridy = 8;
//		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
//		
//		textFieldBrojTelefona = new JTextField();
//		GridBagConstraints gbc_textFieldBrojTelefona = new GridBagConstraints();
//		gbc_textFieldBrojTelefona.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldBrojTelefona.gridwidth = 5;
//		gbc_textFieldBrojTelefona.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldBrojTelefona.gridx = 1;
//		gbc_textFieldBrojTelefona.gridy = 8;
//		panel.add(textFieldBrojTelefona, gbc_textFieldBrojTelefona);
//		textFieldBrojTelefona.setColumns(10);
//		
//		JLabel lblNewLabel_4 = new JLabel("Email adresa*");
//		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
//		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_4.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_4.gridx = 0;
//		gbc_lblNewLabel_4.gridy = 10;
//		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
//		
//		textFieldBrojIndeksa = new JTextField();
//		GridBagConstraints gbc_textFieldBrojIndeksa = new GridBagConstraints();
//		gbc_textFieldBrojIndeksa.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldBrojIndeksa.gridwidth = 5;
//		gbc_textFieldBrojIndeksa.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldBrojIndeksa.gridx = 1;
//		gbc_textFieldBrojIndeksa.gridy = 10;
//		panel.add(textFieldBrojIndeksa, gbc_textFieldBrojIndeksa);
//		textFieldBrojIndeksa.setColumns(10);
//		
//		JLabel lblNewLabel_5 = new JLabel("Adresa kancelarije*");
//		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
//		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_5.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_5.gridx = 0;
//		gbc_lblNewLabel_5.gridy = 12;
//		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
//		
//		textFieldAdresaKancelarije = new JTextField();
//		GridBagConstraints gbc_textFieldAdresaKancelarije = new GridBagConstraints();
//		gbc_textFieldAdresaKancelarije.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldAdresaKancelarije.gridwidth = 5;
//		gbc_textFieldAdresaKancelarije.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldAdresaKancelarije.gridx = 1;
//		gbc_textFieldAdresaKancelarije.gridy = 12;
//		panel.add(textFieldAdresaKancelarije, gbc_textFieldAdresaKancelarije);
//		textFieldAdresaKancelarije.setColumns(10);
//		
//		JLabel lblNewLabel_6 = new JLabel("Br.licnekarte*");
//		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
//		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_6.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_6.gridx = 0;
//		gbc_lblNewLabel_6.gridy = 14;
//		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
//		
//		textFieldAdresaKancelarije2 = new JTextField();
//		GridBagConstraints gbc_textFieldAdresaKancelarije2 = new GridBagConstraints();
//		gbc_textFieldAdresaKancelarije2.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldAdresaKancelarije2.gridwidth = 5;
//		gbc_textFieldAdresaKancelarije2.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldAdresaKancelarije2.gridx = 1;
//		gbc_textFieldAdresaKancelarije2.gridy = 14;
//		panel.add(textFieldAdresaKancelarije2, gbc_textFieldAdresaKancelarije2);
//		textFieldAdresaKancelarije2.setColumns(10);
//		
//		JLabel lblNewLabel_7 = new JLabel("Titula*");
//		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
//		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_7.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_7.gridx = 0;
//		gbc_lblNewLabel_7.gridy = 16;
//		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
//		
//		textFieldAdresaKancelarije3 = new JTextField();
//		GridBagConstraints gbc_textFieldAdresaKancelarije3 = new GridBagConstraints();
//		gbc_textFieldAdresaKancelarije3.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldAdresaKancelarije3.gridwidth = 5;
//		gbc_textFieldAdresaKancelarije3.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldAdresaKancelarije3.gridx = 1;
//		gbc_textFieldAdresaKancelarije3.gridy = 16;
//		panel.add(textFieldAdresaKancelarije3, gbc_textFieldAdresaKancelarije3);
//		textFieldAdresaKancelarije3.setColumns(10);
//		
//		JLabel lblNewLabel_8 = new JLabel("Zvanje*");
//		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
//		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
//		gbc_lblNewLabel_8.insets = new Insets(10, 30, 10, 10);
//		gbc_lblNewLabel_8.gridx = 0;
//		gbc_lblNewLabel_8.gridy = 18;
//		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
//		
//		textFieldAdresaKancelarije4 = new JTextField();
//		GridBagConstraints gbc_textFieldAdresaKancelarije4 = new GridBagConstraints();
//		gbc_textFieldAdresaKancelarije4.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textFieldAdresaKancelarije4.gridwidth = 5;
//		gbc_textFieldAdresaKancelarije4.insets = new Insets(10, 10, 10, 30);
//		gbc_textFieldAdresaKancelarije4.gridx = 1;
//		gbc_textFieldAdresaKancelarije4.gridy = 18;
//		panel.add(textFieldAdresaKancelarije4, gbc_textFieldAdresaKancelarije4);
//		textFieldAdresaKancelarije4.setColumns(10);
//		
//		
//		
//		
//		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		getContentPane().add(panelZaDugmice, BorderLayout.SOUTH);
//		
//		
//		JButton btnOdustanak = new JButton("Odustanak");
//		
//		
//		JButton btnPotvrda = new JButton("Potvrda");
//		panelZaDugmice.add(btnOdustanak);
//		panelZaDugmice.add(btnPotvrda);
//		
//		btnOdustanak.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				
//			}
//		});
//
//	}
	
	
	
public DodavanjeProfesora() {
		setModal(true);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Dodavanje Studenta");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);
		
		JLabel lblIme = new JLabel("Ime*");
		GridBagConstraints gbc_lblIme = new GridBagConstraints();
		gbc_lblIme.anchor = GridBagConstraints.WEST;
		gbc_lblIme.insets = new Insets(30, 30, 10, 10);
		gbc_lblIme.gridx = 0;
		gbc_lblIme.gridy = 0;
		panel.add(lblIme, gbc_lblIme);
		
		textFieldIme = new JTextField();
		GridBagConstraints gbc_textFieldIme = new GridBagConstraints();
		gbc_textFieldIme.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldIme.gridwidth = 5;
		gbc_textFieldIme.insets = new Insets(30, 10, 10, 30);
		gbc_textFieldIme.gridx = 1;
		gbc_textFieldIme.gridy = 0;
		panel.add(textFieldIme, gbc_textFieldIme);
		textFieldIme.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prezime*");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textFieldPrezime = new JTextField();
		GridBagConstraints gbc_textFieldPrezime = new GridBagConstraints();
		gbc_textFieldPrezime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrezime.gridwidth = 5;
		gbc_textFieldPrezime.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldPrezime.gridx = 1;
		gbc_textFieldPrezime.gridy = 2;
		panel.add(textFieldPrezime, gbc_textFieldPrezime);
		textFieldPrezime.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Datum rodjenja*");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textFieldDatumRodjenja = new JTextField();
		GridBagConstraints gbc_textFieldDatumRodjenja = new GridBagConstraints();
		gbc_textFieldDatumRodjenja.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDatumRodjenja.gridwidth = 5;
		gbc_textFieldDatumRodjenja.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldDatumRodjenja.gridx = 1;
		gbc_textFieldDatumRodjenja.gridy = 4;
		panel.add(textFieldDatumRodjenja, gbc_textFieldDatumRodjenja);
		textFieldDatumRodjenja.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adresa stanovanja*");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textFieldAdresaStanovanja = new JTextField();
		GridBagConstraints gbc_textFieldAdresaStanovanja = new GridBagConstraints();
		gbc_textFieldAdresaStanovanja.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAdresaStanovanja.gridwidth = 5;
		gbc_textFieldAdresaStanovanja.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldAdresaStanovanja.gridx = 1;
		gbc_textFieldAdresaStanovanja.gridy = 6;
		panel.add(textFieldAdresaStanovanja, gbc_textFieldAdresaStanovanja);
		textFieldAdresaStanovanja.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Broj telefona*");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 8;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textFieldBrojTelefona = new JTextField();
		GridBagConstraints gbc_textFieldBrojTelefona = new GridBagConstraints();
		gbc_textFieldBrojTelefona.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldBrojTelefona.gridwidth = 5;
		gbc_textFieldBrojTelefona.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldBrojTelefona.gridx = 1;
		gbc_textFieldBrojTelefona.gridy = 8;
		panel.add(textFieldBrojTelefona, gbc_textFieldBrojTelefona);
		textFieldBrojTelefona.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email Adresa*");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 10;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textFieldEmailAdresa = new JTextField();
		GridBagConstraints gbc_textFieldEmailAdresa = new GridBagConstraints();
		gbc_textFieldEmailAdresa.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmailAdresa.gridwidth = 5;
		gbc_textFieldEmailAdresa.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldEmailAdresa.gridx = 1;
		gbc_textFieldEmailAdresa.gridy = 10;
		panel.add(textFieldEmailAdresa, gbc_textFieldEmailAdresa);
		textFieldEmailAdresa.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Adresa kancelarije*");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 12;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
	    textFieldKancelarija = new JTextField();
		GridBagConstraints gbc_textFieldKancelarija = new GridBagConstraints();
		gbc_textFieldKancelarija.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldKancelarija.gridwidth = 5;
		gbc_textFieldKancelarija.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldKancelarija.gridx = 1;
		gbc_textFieldKancelarija.gridy = 12;
		panel.add(textFieldKancelarija, gbc_textFieldKancelarija);
		textFieldKancelarija.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Broj licne karte*");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 14;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
	    textFieldBrojLicne = new JTextField();
		GridBagConstraints gbc_textFieldBrojLicne = new GridBagConstraints();
		gbc_textFieldBrojLicne.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldBrojLicne.gridwidth = 5;
		gbc_textFieldBrojLicne.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldBrojLicne.gridx = 1;
		gbc_textFieldBrojLicne.gridy = 14;
		panel.add(textFieldBrojLicne, gbc_textFieldBrojLicne);
		textFieldBrojLicne.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Titula*");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 16;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textFieldTitula = new JTextField();
		GridBagConstraints gbc_textFieldTitula = new GridBagConstraints();
		gbc_textFieldTitula.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTitula.gridwidth = 5;
		gbc_textFieldTitula.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldTitula.gridx = 1;
		gbc_textFieldTitula.gridy = 16;
		panel.add(textFieldTitula, gbc_textFieldTitula);
		textFieldTitula.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Zvanje*");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 18;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textFieldZvanje = new JTextField();
		GridBagConstraints gbc_textFieldZvanje= new GridBagConstraints();
		gbc_textFieldZvanje.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldZvanje.gridwidth = 5;
		gbc_textFieldZvanje.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldZvanje.gridx = 1;
		gbc_textFieldZvanje.gridy = 18;
		panel.add(textFieldZvanje, gbc_textFieldZvanje);
		textFieldZvanje.setColumns(10);
		
		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(panelZaDugmice, BorderLayout.SOUTH);
		
		
		JButton btnOdustanak = new JButton("Odustanak");
		
		
		JButton btnPotvrda = new JButton("Potvrda");
		panelZaDugmice.add(btnOdustanak);
		panelZaDugmice.add(btnPotvrda);
		
		btnOdustanak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
	}
}
