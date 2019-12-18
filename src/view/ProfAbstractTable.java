package view;

import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;

public class ProfAbstractTable extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3080608247242462864L;

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	@Override
	public int getColumnCount() {
		return BazaProfesora.getInstance().getColumnCount();
	}
	
	@Override
	public String getColumnName(int column) {
		return BazaProfesora.getInstance().getColumnName(column);
	}

	@Override
	public int getRowCount() {
		return BazaProfesora.getInstance().getProfesori().size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex < 4)
			return BazaProfesora.getInstance().getValueAt(rowIndex, columnIndex);
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

}
