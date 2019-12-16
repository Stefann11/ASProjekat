package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7947635610267756044L;

	private String[] columnNames = {"Indeks", "Ime", "Prezime", "Godina studija", "Status", "Prosek"};
	
	private List<Student> data = new ArrayList<Student>();
	private ArrayList<Predmet>predmeti = new ArrayList<Predmet>();
	
	public StudentTableModel() {
		data.add(new Student( "RA22-2019","Petar", "Petrovic",godinaStudija.PRVA, enumStatus.S,6.94));
		data.add(new Student( "RA12-2018","Nikolina", "Peric",godinaStudija.DRUGA, enumStatus.B,8.50));
		data.add(new Student( "RA32-2016","Nemanja", "Kolovic",godinaStudija.CETVRTA, enumStatus.B,9.46));
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
		Student student = data.get(row);
		return student.toCell(col);
	}
	
	@Override
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	@Override
	public void setValueAt(Object value, int row, int col) {
		Student student = data.get(row);
		student.set(col, value);
		data.set(row, student);
		// prijavimo da smo promenili vrednost u tabeli
		// fireTableCellUpdated(row, col);
	}
	

}
