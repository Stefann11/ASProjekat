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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PredmetiController;
import model.BazaPredmeta;
import model.GodinaStudija;
import model.Predmet;

public class IzmenaPredmeta extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7304417891182958440L;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldSemestar;
	
	public IzmenaPredmeta() {
		setModal(true);
		setTitle("Izmena predmeta");
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
		
		textFieldSifra = new JTextField();
		GridBagConstraints gbc_textFieldSifra = new GridBagConstraints();
		gbc_textFieldSifra.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSifra.gridwidth = 3;
		gbc_textFieldSifra.insets = new Insets(20, 0, 5, 0);
		gbc_textFieldSifra.gridx = 3;
		gbc_textFieldSifra.gridy = 0;
		panel.add(textFieldSifra, gbc_textFieldSifra);
		textFieldSifra.setColumns(10);
		
		JLabel lblNazivPredmeta = new JLabel("Naziv predmeta *");
		GridBagConstraints gbc_lblNazivPredmeta = new GridBagConstraints();
		gbc_lblNazivPredmeta.anchor = GridBagConstraints.WEST;
		gbc_lblNazivPredmeta.gridwidth = 2;
		gbc_lblNazivPredmeta.insets = new Insets(5, 10, 5, 5);
		gbc_lblNazivPredmeta.gridx = 0;
		gbc_lblNazivPredmeta.gridy = 2;
		panel.add(lblNazivPredmeta, gbc_lblNazivPredmeta);
		
		textFieldNaziv = new JTextField();
		GridBagConstraints gbc_textFieldNaziv = new GridBagConstraints();
		gbc_textFieldNaziv.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNaziv.gridwidth = 3;
		gbc_textFieldNaziv.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNaziv.gridx = 3;
		gbc_textFieldNaziv.gridy = 2;
		panel.add(textFieldNaziv, gbc_textFieldNaziv);
		textFieldNaziv.setColumns(10);
		
		JLabel lblSemestarPredmeta = new JLabel("Semestar *");
		GridBagConstraints gbc_lblSemestarPredmeta = new GridBagConstraints();
		gbc_lblSemestarPredmeta.anchor = GridBagConstraints.WEST;
		gbc_lblSemestarPredmeta.gridwidth = 2;
		gbc_lblSemestarPredmeta.insets = new Insets(5, 10, 5, 5);
		gbc_lblSemestarPredmeta.gridx = 0;
		gbc_lblSemestarPredmeta.gridy = 4;
		panel.add(lblSemestarPredmeta, gbc_lblSemestarPredmeta);
		
		textFieldSemestar = new JTextField();
		GridBagConstraints gbc_textFieldSemestar = new GridBagConstraints();
		gbc_textFieldSemestar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSemestar.gridwidth = 3;
		gbc_textFieldSemestar.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldSemestar.gridx = 3;
		gbc_textFieldSemestar.gridy = 4;
		panel.add(textFieldSemestar, gbc_textFieldSemestar);
		textFieldSemestar.setColumns(10);
		
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
		
		
		
		//za popunjena polja u tabeli predmet
		int selektovaniRed = MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow();
		
		if (selektovaniRed < 0) {
			JOptionPane.showMessageDialog(this, "Niste izabrali predmet");
			
		} else {
			Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
			textFieldSifra.setText(predmet.getSifraPredmeta());
			textFieldNaziv.setText(predmet.getNazivPredmeta());
			textFieldSemestar.setText(Integer.toString(predmet.getSemestar()));
			comboBox.setSelectedItem(predmet.getGodinaStudijaPredmet());
		}
		
		
		JPanel panelDugm = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(panelDugm, BorderLayout.SOUTH);

		
		JButton btnOdustanak = new JButton("Odustanak");
		JButton btnPotvrda = new JButton("Potvrda");
		
		panelDugm.add(btnOdustanak);
		panelDugm.add(btnPotvrda);
		
		btnPotvrda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sifra=textFieldSifra.getText();
				String naziv=textFieldNaziv.getText();
				int semestar=Integer.parseInt(textFieldSemestar.getText());
				String g=comboBox.getSelectedItem().toString();
				GodinaStudija god=GodinaStudija.valueOf(g);
				
				PredmetiController.getInstance().IzmeniPredmet(selektovaniRed, sifra, naziv, semestar, god);
				
				
				dispose();
			}
		});
	}

}
