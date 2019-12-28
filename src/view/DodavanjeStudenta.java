package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.StudentiController;
import model.GodinaStudija;
import model.Status;

public class DodavanjeStudenta extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;
	private JTextField textFieldDatumRodjenja;
	private JTextField textFieldAdresaStanovanja;
	private JTextField textFieldBrojTelefona;
	private JTextField textFieldBrojIndeksa;
	private JTextField textFieldProsek;
	private JTextField textFieldEmail;
	private JTextField textFieldDatumUpisa;
	private String placaFaks;
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	public DodavanjeStudenta() {
		setModal(true);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Dodavanje studenta");
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
		textFieldIme.setColumns(20);
		
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
		textFieldPrezime.setColumns(20);
		
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
		textFieldDatumRodjenja.setColumns(20);
		
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
		textFieldAdresaStanovanja.setColumns(20);
		
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
		textFieldBrojTelefona.setColumns(20);
		
		JLabel lblNewLabel_4 = new JLabel("Broj indeksa*");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 10;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textFieldBrojIndeksa = new JTextField();
		GridBagConstraints gbc_textFieldBrojIndeksa = new GridBagConstraints();
		gbc_textFieldBrojIndeksa.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldBrojIndeksa.gridwidth = 5;
		gbc_textFieldBrojIndeksa.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldBrojIndeksa.gridx = 1;
		gbc_textFieldBrojIndeksa.gridy = 10;
		panel.add(textFieldBrojIndeksa, gbc_textFieldBrojIndeksa);
		textFieldBrojIndeksa.setColumns(20);
		
		
		JLabel lblNewLabel_5 = new JLabel("Proseèna ocena*");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 12;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textFieldProsek = new JTextField();
		GridBagConstraints gbc_textFieldProsek = new GridBagConstraints();
		gbc_textFieldProsek.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldProsek.gridwidth = 5;
		gbc_textFieldProsek.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldProsek.gridx = 1;
		gbc_textFieldProsek.gridy = 12;
		panel.add(textFieldProsek, gbc_textFieldProsek);
		textFieldProsek.setColumns(20);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Email adresa*");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 14;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textFieldEmail = new JTextField();
		GridBagConstraints gbc_textFieldEmail = new GridBagConstraints();
		gbc_textFieldEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmail.gridwidth = 5;
		gbc_textFieldEmail.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldEmail.gridx = 1;
		gbc_textFieldEmail.gridy = 14;
		panel.add(textFieldEmail, gbc_textFieldEmail);
		textFieldEmail.setColumns(20);
		
		
		JLabel lblNewLabel_8 = new JLabel("Datum upisa*");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 16;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textFieldDatumUpisa = new JTextField();
		GridBagConstraints gbc_textFieldDatumUpisa = new GridBagConstraints();
		gbc_textFieldDatumUpisa.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDatumUpisa.gridwidth = 5;
		gbc_textFieldDatumUpisa.insets = new Insets(10, 10, 10, 30);
		gbc_textFieldDatumUpisa.gridx = 1;
		gbc_textFieldDatumUpisa.gridy = 16;
		panel.add(textFieldDatumUpisa, gbc_textFieldDatumUpisa);
		textFieldDatumUpisa.setColumns(20);
		
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Trenutna godina studija*");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 18;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(10, 10, 10, 30);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 18;
		panel.add(comboBox, gbc_comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PRVA", "DRUGA", "TREÆA", "ÈETVRTA"}));
		
		JRadioButton RadioButton1 = new JRadioButton("Bud\u017Eet");
		GridBagConstraints gbc_RadioButton1 = new GridBagConstraints();
		gbc_RadioButton1.anchor = GridBagConstraints.WEST;
		gbc_RadioButton1.insets = new Insets(10, 30, 10, 10);
		gbc_RadioButton1.gridx = 0;
		gbc_RadioButton1.gridy = 19;
		panel.add(RadioButton1, gbc_RadioButton1);
		buttonGroup.add(RadioButton1);
		
		RadioButton1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            placaFaks = "B";

	        }
	    });
		
		JRadioButton RadioButton2 = new JRadioButton("Samofinansiranje");
		GridBagConstraints gbc_RadioButton2  = new GridBagConstraints();
		 gbc_RadioButton2 .anchor = GridBagConstraints.WEST;
		 gbc_RadioButton2 .insets = new Insets(10, 30, 10, 10);
		 gbc_RadioButton2 .gridx = 0;
		 gbc_RadioButton2 .gridy = 20;
		panel.add(RadioButton2 ,  gbc_RadioButton2 );
		buttonGroup.add(RadioButton2);
		
		
		RadioButton2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            placaFaks = "S";

	        }
	    });
		
		
		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(panelZaDugmice, BorderLayout.SOUTH);
		
		
		JButton btnOdustanak = new JButton("Odustanak");
		
		
		JButton btnPotvrda = new JButton("Potvrda");
		panelZaDugmice.add(btnOdustanak);
		panelZaDugmice.add(btnPotvrda);
		
		
		btnPotvrda.addActionListener(new ActionListener() {
			
			@Override
		public void actionPerformed(ActionEvent e) {
			String ime=textFieldIme.getText();
			String prezime=textFieldPrezime.getText();
			Date DatumRodjenja;
			Date DatumUpisa;
			try {
				DatumRodjenja = new SimpleDateFormat("dd/MM/yyyy").parse(textFieldDatumRodjenja.getText());
				DatumUpisa = new SimpleDateFormat("dd/MM/yyyy").parse(textFieldDatumUpisa.getText());
				String adresaStanovanja=textFieldAdresaStanovanja.getText();
				String telefon=textFieldBrojTelefona.getText();
				String brojIndeksa=textFieldBrojIndeksa.getText();
				//String adresaKancelarije=textFieldKancelarija.getText();
				//int brojLicneKarte=Integer.parseInt(textFieldBrojLicne.getText());
				String g=comboBox.getSelectedItem().toString();
				GodinaStudija trenutnaGodStud=GodinaStudija.valueOf(g);
				//String g2=comboBox2.getSelectedItem().toString();
				//Zvanje zvanje=Zvanje.valueOf(g2);
				String email = textFieldEmail.getText();
				Status status = Status.valueOf(placaFaks);
				double prosecnaOcena = Double.parseDouble(textFieldProsek.getText());
					
				StudentiController.getInstance().DodajStudenta(ime,prezime,DatumRodjenja,adresaStanovanja, telefon, email, brojIndeksa,DatumUpisa,trenutnaGodStud, status,prosecnaOcena);
				
				
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
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

	/**
	 * 
	 */
	

}
