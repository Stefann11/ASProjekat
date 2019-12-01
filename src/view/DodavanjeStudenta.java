package view;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class DodavanjeStudenta extends JDialog{
	public DodavanjeStudenta() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Dodavanje Studenta");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 215, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblIme = new JLabel("Ime*");
		GridBagConstraints gbc_lblIme = new GridBagConstraints();
		gbc_lblIme.anchor = GridBagConstraints.WEST;
		gbc_lblIme.insets = new Insets(30, 30, 10, 10);
		gbc_lblIme.gridx = 0;
		gbc_lblIme.gridy = 0;
		panel.add(lblIme, gbc_lblIme);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(30, 10, 10, 30);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prezime*");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridwidth = 5;
		gbc_textField_1.insets = new Insets(10, 10, 10, 30);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Datum rodjenja*");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridwidth = 5;
		gbc_textField_2.insets = new Insets(10, 10, 10, 30);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adresa stanovanja*");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridwidth = 5;
		gbc_textField_3.insets = new Insets(10, 10, 10, 30);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 6;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Broj telefona*");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 8;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridwidth = 5;
		gbc_textField_4.insets = new Insets(10, 10, 10, 30);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 8;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Broj indeksa*");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 10;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridwidth = 5;
		gbc_textField_5.insets = new Insets(10, 10, 10, 30);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 10;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Trenutna godina studija*");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(10, 30, 10, 10);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 12;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(10, 10, 10, 30);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 12;
		panel.add(comboBox, gbc_comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"I (prva)", "II (druga)", "III (tre\u0107a)", "IV (\u010Detvrta)"}));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bud\u017Eet");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton.insets = new Insets(10, 30, 10, 10);
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 13;
		panel.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Samofinansiranje");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(10, 30, 10, 10);
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 14;
		panel.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();

}
