package view;

import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;
import model.BazaStudenta;


public class StudAbstractTable extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2408599401185496315L;

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	@Override
	public int getColumnCount() {
		return BazaStudenta.getInstance().getColumnCount() + 1;
	}
	
	@Override
	public String getColumnName(int column) {
		if (column >= BazaStudenta.getInstance().getColumnCount()) {
			return "Predmeti";
		}
		return BazaStudenta.getInstance().getColumnName(column);
	}

	@Override
	public int getRowCount() {
		return BazaStudenta.getInstance().getStudenti().size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex < 11)
			return BazaStudenta.getInstance().getValueAt(rowIndex, columnIndex);
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

}
