package view;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import model.BazaStudenta;


public class StudAbstractTable extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2408599401185496315L;

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex>=11;
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
		if (columnIndex < 11) {
			return BazaStudenta.getInstance().getValueAt(rowIndex, columnIndex);
		}
		else if (columnIndex == 11) {
			JButton btn = new JButton("" + rowIndex);
			return btn;
		}
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
	}
	

	//PRIKAZIVANJE DUGMETA
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				switch (columnIndex) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					return String.class;
				case 11:
					return JButton.class;
				default:
					return null;
				}
			}

}
