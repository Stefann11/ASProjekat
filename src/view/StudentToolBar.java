package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class StudentToolBar extends JToolBar{

	private static final long serialVersionUID = -2714410407038947655L;
	
	public StudentToolBar() {
		
		super(SwingConstants.HORIZONTAL);
		
		JPanel panelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnAdd = new JButton();
		btnAdd.setToolTipText("Dodaj Studenta");
		btnAdd.setIcon(new ImageIcon("images/add-icon.png"));
		panelLeft.add(btnAdd);

		JButton btnEdit = new JButton();
		btnEdit.setToolTipText("Izmeni Studenta");
		btnEdit.setIcon(new ImageIcon("images/edit-icon.png"));
		//btnEdit.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnEdit);

		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Obrisi Studenta");
		btnDelete.setIcon(new ImageIcon("images/trash-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelLeft.add(btnDelete);
		
		JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 32));
        panelRight.add(textField);
        textField.setToolTipText("indeks:Xxxxx;ime:Xxxxx;prezime:Xxxxx;datum roðenja:xx/xx/xxxx;kontakt telefon:Xxxxx;email adresa:Xxxxx;datum upisa:Xxxxx;godina studija:Xxxxx;status:Xxxxx;prosek:Xxxxx");
		
		JButton btnSearch = new JButton();
		btnSearch.setToolTipText("Trazi Studenta");
		btnSearch.setIcon(new ImageIcon("images/search-icon.png"));
		//btnDelete.setPreferredSize(new Dimension(25, 25));
		panelRight.add(btnSearch);
		
		
		add(panelLeft, BorderLayout.WEST);
		add(panelRight, BorderLayout.EAST);
		
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tekst = textField.getText();
				StudJTable table  = StudJTable.getInstance();
				table.searchStudent(tekst);
				
			}
		});
		
		
		
		

		
btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DodavanjeStudenta dp=DodavanjeStudenta.getInstance();
				dp.setVisible(true);
				
			}
		});
		
	
btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BrisanjeStudenta bs=new BrisanjeStudenta();
				
				bs.setVisible(true);
				
			}
		});	

	btnEdit.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		IzmenaStudenta dp=new IzmenaStudenta();
		
		dp.setVisible(true);
		
	}
});



		setBackground(Color.WHITE);

	}
	

	
	

}
