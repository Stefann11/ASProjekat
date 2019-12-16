package model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;



public class ProfesorTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 8802202392787526904L;
	
	private String[] columnNames = { "Ime", "Prezime", "Datum rodjenja",
			"Adresa stanovanja", "Kontakt telefon", "Email adresa", "Adresa kancelarije",
			"Broj licne karte", "Titula", "Zvanje"};
	
	private List<Profesor> data = new ArrayList<Profesor>();
	private ArrayList<Predmet>predmeti = new ArrayList<Predmet>();
	
	public ProfesorTableModel() {
		data.add(new Profesor("Marko", "Markovic", "04-08-1970", "Futoska bb, 21000 Novi Sad", "+38162 1234567",
				"marko.markovic@gmail.com", "Veljka Petrovica 20", 123456789, "Docent", "Doktor nauka", predmeti));
		data.add(new Profesor("Nikola", "Nikolic", "12-12-1968", "Bulevar Jase Tomica 13, 21000 Novi Sad", "+38164 7654321",
				"nikola.nikolic@gmail.com", "Veljka Petrovica 20", 987654321, "Docent", "Doktor nauka", predmeti));
		data.add(new Profesor("Zdravko", "Petkovic", "02-06-1960", "Kisacka 23, 21000 Novi Sad", "+38162 3322117",
				"zdravko.petkovic@gmail.com", "Veljka Petrovica 20", 131214987, "Docent", "Doktor nauka", predmeti));

	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
		Profesor profesor = data.get(row);
		return profesor.toCell(col);
	}
	
	@Override
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	@Override
	public void setValueAt(Object value, int row, int col) {
		Profesor profesor = data.get(row);
		profesor.set(col, value);
		data.set(row, profesor);
		// prijavimo da smo promenili vrednost u tabeli
		// fireTableCellUpdated(row, col);
	}
	
	 
   

}
