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

public class PredJTable extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5783153125839014016L;

	private static PredJTable instance = null;
	
	public static PredJTable getInstance() {
		if(instance == null) {
			instance = new PredJTable();
		}
		return instance;
	}
	
	private TableRowSorter<PredAbstractTable> sorter;
	
	private PredJTable() {
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.getTableHeader().setReorderingAllowed(false);
		this.setModel(new PredAbstractTable());
		new ButtonColumnPredmeti(this, 5);
		
		sorter = new TableRowSorter<>((PredAbstractTable) getModel());
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
	
	public void searchPredmet(String tekst) {
		String[] polja = tekst.split(";");
		String[] deo;
		String naziv = null, sifra = null, semestarString = null, godinaStudijaString = null, profesor = null;
		
		for (int i = 0; i<polja.length;i++) {
			deo = polja[i].split(":");
			if (deo[0].equals("šifra")) {
				sifra = deo[1];
			} else if (deo[0].equals("naziv")) {
				naziv = deo[1];
			} else if (deo[0].equals("semestar")) {
				semestarString = deo[1];
				
			}  else if (deo[0].equals("godina")) {
				godinaStudijaString = deo[1];
				
			} else if (deo[0].equals("profesor")) {
				profesor=deo[1];
			}
		}
		
		
		List<RowFilter<Object,Object>> rfs = new ArrayList<RowFilter<Object,Object>>();
		if (sifra!=null) 
			rfs.add(RowFilter.regexFilter(sifra, 0));
		
		if (naziv!=null) 
		rfs.add(RowFilter.regexFilter(naziv, 1));
		
		if (semestarString!=null) 
		rfs.add(RowFilter.regexFilter(semestarString, 2));
		
		if(godinaStudijaString!=null)
		rfs.add(RowFilter.regexFilter(godinaStudijaString, 3));
		
		if(profesor!=null)
			rfs.add(RowFilter.regexFilter(profesor, 4));
		
		
		sorter.setRowFilter(RowFilter.andFilter(rfs));
		
		
		
	}

}
