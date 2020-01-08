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

public class ProfJTable extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2533834450510741160L;
	
private static ProfJTable instance = null;
	
	public static ProfJTable getInstance() {
		if(instance == null) {
			instance = new ProfJTable();
		}
		return instance;
	}
	
	private TableRowSorter<ProfAbstractTable> sorter;
	
	private ProfJTable() {
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setModel(new ProfAbstractTable());
		new ButtonColumnPredmeti(this, 10);
		
		sorter = new TableRowSorter<>((ProfAbstractTable) getModel());
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
	
	public void searchProfesor(String tekst) {
		String[] polja = tekst.split(";");
		String[] deo;
		String ime = null, prezime = null, datum = null, adresaStanovanja = null, telefon = null, email = null;
		String adresaKancelarije = null, licnaKarta = null, titula = null, zvanje = null;
		for (int i = 0; i<polja.length;i++) {
			deo = polja[i].split(":");
			if (deo[0].equals("ime")) {
				ime = deo[1];
			} else if (deo[0].equals("prezime")) {
				prezime = deo[1];
			} else if (deo[0].equals("datum")) {
				datum = deo[1];	
			} else if (deo[0].equals("adresa stanovanja")) {
				adresaStanovanja = deo[1];
			} else if (deo[0].equals("telefon")) {
				telefon = deo[1];
			} else if (deo[0].equals("email")) {
				email = deo[1];
			} else if (deo[0].equals("adresa kancelarije")) {
				adresaKancelarije = deo[1];
			} else if (deo[0].equals("licna karta")) {
				licnaKarta = deo[1];
			} else if (deo[0].equals("titula")) {
				titula = deo[1];
			} else if (deo[0].equals("zvanje")) {
				zvanje = deo[1];
			}
		}
		
		
		List<RowFilter<Object,Object>> rfs = new ArrayList<RowFilter<Object,Object>>();
		if (ime!=null) 
			rfs.add(RowFilter.regexFilter(ime, 0));
		
		if (prezime!=null) 
		rfs.add(RowFilter.regexFilter(prezime, 1));
		
		if (datum!=null) 
		rfs.add(RowFilter.regexFilter(datum, 2));
		
		if(adresaStanovanja!=null)
		rfs.add(RowFilter.regexFilter(adresaStanovanja, 3));
		
		if(telefon!=null)
			rfs.add(RowFilter.regexFilter(telefon, 4));
		
		if(email!=null)
			rfs.add(RowFilter.regexFilter(email, 5));
		
		if(adresaKancelarije!=null)
			rfs.add(RowFilter.regexFilter(adresaKancelarije, 6));
		
		if(licnaKarta!=null)
			rfs.add(RowFilter.regexFilter(licnaKarta, 7));
		
		if(titula!=null)
			rfs.add(RowFilter.regexFilter(titula, 8));
		
		if(zvanje!=null)
			rfs.add(RowFilter.regexFilter(zvanje, 9));
		
		
		sorter.setRowFilter(RowFilter.andFilter(rfs));
		
		
		
	}

}
