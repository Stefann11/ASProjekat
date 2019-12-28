package controller;

import model.BazaProfesora;
import model.Profesor;
import view.MyTabbedPane;
import view.ProfAbstractTable;

public class ProfesoriController {
	private static ProfesoriController instance=null;
	
	public static ProfesoriController getInstance() {
		if (instance == null) {
			instance = new ProfesoriController();
		}
	return instance;
	}
	
	private ProfesoriController() {}
	
	public void IzbrisiProfesora(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		Profesor profesor = BazaProfesora.getInstance().getRow(rowSelectedIndex);
		BazaProfesora.getInstance().izbrisiProfesora(profesor.getBrojLicneKarte());
		ProfAbstractTable model = (ProfAbstractTable) MyTabbedPane.getInstance().tabelaProfesora.getModel();
		model.fireTableDataChanged();
		MyTabbedPane.getInstance().validate();
	}

}
