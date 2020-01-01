package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import model.BazaStudenta;
import model.Student;

public class ButtonColumnPredmeti extends AbstractCellEditor
implements TableCellRenderer, TableCellEditor, MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4254448381219566710L;
	
	// dugme koje se iscrtava
	private JButton renderButton;
	// dugme koje obradjuje akciju
	private JButton editorButton;
	// referenca na tabelu
	private JTable table;
	// da li je aktivno editovanje celije tabele
	// (da li se obradjuju dogadjaji pritiska misa)
	private boolean isEditorActive = false;
	
	public ButtonColumnPredmeti(JTable table, int column) {
		// povezivanje sa tabelom
		this.table = table;
		// nacin iscrtavanje celije
		this.table.getColumnModel().getColumn(column).setCellRenderer(this);
		// nacin editovanja celije
		this.table.getColumnModel().getColumn(column).setCellEditor(this);
		this.table.addMouseListener(this);

		// dugme koje ce biti iscrtavanp
		this.renderButton = new JButton("Prikaži");
		renderButton.setBackground(Color.WHITE);

		
		this.editorButton = new JButton("Prikaži");
		editorButton.setBackground(Color.WHITE);
		
		this.editorButton.addActionListener(new ActionListener() {
			// mozemo odavde pozvati nas kontroler da se nesto smisleno odradi
			@Override
			public void actionPerformed(ActionEvent e) {
				fireEditingStopped();
				
				if (GlavniProzor.otvoreniTab==0) {
					PrikazivanjeSpiskaPredmetaZaStudenta ps = new PrikazivanjeSpiskaPredmetaZaStudenta();
				} else if (GlavniProzor.otvoreniTab==1) {
					PrikazivanjeSpiskaPredmetaZaProfesora pp = new PrikazivanjeSpiskaPredmetaZaProfesora();
				} else {
					PrikazivanjeSpiskaStudenata pss = PrikazivanjeSpiskaStudenata.getInstance();
					pss.setVisible(true);
				}
				
			}
		});

		this.isEditorActive = false;
	}
		
	

	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (table.isEditing() && table.getCellEditor() == this) {
			this.isEditorActive = true;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (isEditorActive && table.isEditing()) {
			table.getCellEditor().stopCellEditing();
		}
		isEditorActive = false;
		
	}

	@Override
	public Component getTableCellEditorComponent(JTable arg0, Object arg1, boolean arg2, int arg3, int arg4) {
		return new PredmetiTablePanel(this.editorButton, 50, 50);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		return new PredmetiTablePanel(this.renderButton, 50, 50);
	}

}
