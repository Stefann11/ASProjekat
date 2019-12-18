package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.GodinaStudija;
import model.Predmet;
import model.Profesor;
import model.Student;

public class PredmetTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6895619994401877943L;
	
	private String[] columnNames = { "Sifra Predmeta", "Naziv predmeta", "Semestar",
			"Godina studija", "Predmetni Profesor", "Studenti"};
	
	private List<Predmet> data = new ArrayList<Predmet>();
	private Profesor profesor= new Profesor();
	private ArrayList<Student>studenti = new ArrayList<Student>();
	
	public PredmetTableModel() {
		data.add(new Predmet("WP-E2", "Web programiranje", 3, GodinaStudija.DRUGA));
		data.add(new Predmet("OP-E2", "Objektno programiranje", 2, GodinaStudija.PRVA));
		data.add(new Predmet("VI-E3", "Vestacka inteligencija", 5, GodinaStudija.TREĆA));

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
		Predmet predmet = data.get(row);
		return predmet.toCell(col);
	}
	
	@Override
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	@Override
	public void setValueAt(Object value, int row, int col) {
			Predmet predmet = data.get(row);
			predmet.set(col, value);
			data.set(row, predmet);
		// prijavimo da smo promenili vrednost u tabeli
		// fireTableCellUpdated(row, col);
			
			
	}
	
	

}
