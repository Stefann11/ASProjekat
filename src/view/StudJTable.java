package view;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

public class StudJTable extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8583662858256484581L;
	
	private static StudJTable instance = null;
	
	public static StudJTable getInstance() {
		if(instance == null) {
			instance = new StudJTable();
		}
		return instance;
	}
	
	private TableRowSorter<StudAbstractTable> sorter;
	
	
	private StudJTable() {
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.getTableHeader().setReorderingAllowed(false);
		this.setModel(new StudAbstractTable());
		new ButtonColumnPredmeti(this, 11);
		sorter = new TableRowSorter<>((StudAbstractTable) getModel());
		this.setRowSorter(sorter);
	}
	
	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		Component c = super.prepareRenderer(renderer, row, column);
		// selektovani red ce imati drugaciju boju od ostalih
		if (isRowSelected(row)) {
			c.setBackground(Color.LIGHT_GRAY);
		} else {
			c.setBackground(Color.WHITE);
		}
		return c;
	}
	
	public void searchStudent(String tekst) {
		String[] polja = tekst.split(";");
		String[] deo;
		String ime = null, prezime = null, datumRodjenja = null, adresaStanovanja = null, telefon = null, email = null;
		String datumUpisa = null, indeks= null,  trenutnaGodinaStudija= null, status = null, prosek = null;
		for (int i = 0; i<polja.length;i++) {
			deo = polja[i].split(":");
			if (deo[0].equals("indeks")) {
				indeks = deo[1];
			} else if (deo[0].equals("ime")) {
				ime = deo[1];
			} else if (deo[0].equals("prezime")) {
				prezime = deo[1];	
			} else if (deo[0].equals("datum roðenja")) {
				datumRodjenja = deo[1];
			} else if (deo[0].equals("adresa stanovanja")) {
				adresaStanovanja = deo[1];
			} else if (deo[0].equals("kontakt telefon")) {
				telefon = deo[1];
			} else if (deo[0].equals("email adresa")) {
				email = deo[1];
			} else if (deo[0].equals("datum upisa")) {
				datumUpisa = deo[1];
			} else if (deo[0].equals("godina studija")) {
				trenutnaGodinaStudija = deo[1];
			} else if (deo[0].equals("status")) {
				status = deo[1];
			} else if (deo[0].equals("prosek")) {
				prosek = deo[1];
			}
		}
		
		
		List<RowFilter<Object,Object>> rfs = new ArrayList<RowFilter<Object,Object>>();
		if (indeks!=null) 
			rfs.add(RowFilter.regexFilter(indeks, 0));
		
		if (ime!=null) 
		rfs.add(RowFilter.regexFilter(ime, 1));
		
		if (prezime!=null) 
		rfs.add(RowFilter.regexFilter(prezime, 2));
		
		if(datumRodjenja!=null)
		rfs.add(RowFilter.regexFilter(datumRodjenja, 3));
		
		if(adresaStanovanja!=null)
			rfs.add(RowFilter.regexFilter(adresaStanovanja, 4));
		
		if(telefon!=null)
			rfs.add(RowFilter.regexFilter(telefon, 5));
		
		if(email!=null)
			rfs.add(RowFilter.regexFilter(email, 6));
		
		if(datumUpisa!=null)
			rfs.add(RowFilter.regexFilter(datumUpisa, 7));
		
		if(trenutnaGodinaStudija!=null)
			rfs.add(RowFilter.regexFilter(trenutnaGodinaStudija, 8));
		
		if(status!=null)
			rfs.add(RowFilter.regexFilter(status, 9));
		
		if(prosek!=null)
			rfs.add(RowFilter.regexFilter(prosek, 10));
		
		
		sorter.setRowFilter(RowFilter.andFilter(rfs));
		
		
		
	}

}
