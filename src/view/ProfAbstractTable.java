package view;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;

public class ProfAbstractTable extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3080608247242462864L;

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex>=10;
	}
	
	@Override
	public int getColumnCount() {
		return BazaProfesora.getInstance().getColumnCount() + 1;
	}
	
	@Override
	public String getColumnName(int column) {
		if (column >= BazaProfesora.getInstance().getColumnCount()) {
			return "Predmeti";
		}
		return BazaProfesora.getInstance().getColumnName(column);
	}

	@Override
	public int getRowCount() {
		return BazaProfesora.getInstance().getProfesori().size();
	}
	
	//da bismo mogli prikazati dugme
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
					return String.class;
				case 10:
					return JButton.class;
				default:
					return null;
				}
			}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex < 10) {
			return BazaProfesora.getInstance().getValueAt(rowIndex, columnIndex);
		} else if (columnIndex == 10) {
			JButton btn = new JButton("" + rowIndex);
			return btn;
		}
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

}
