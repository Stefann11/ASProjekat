package controller;

import java.util.Date;

import model.BazaPredmeta;
import model.BazaProfesora;
import model.BazaStudenta;
import model.GodinaStudija;
import model.Profesor;
import model.Status;
import model.Titula;
import model.Zvanje;
import view.MyTabbedPane;
import view.PredAbstractTable;
import view.ProfAbstractTable;
import view.StudAbstractTable;

public class ProfesoriController {
	private static ProfesoriController instance=null;
	
	public static ProfesoriController getInstance() {
		if (instance == null) {
			instance = new ProfesoriController();
		}
	return instance;
	}
	
	private ProfesoriController() {}
	
	public void DodajProfesora(String ime, String prezime, Date datumRodjenja, 
			String adresaStanovanja, String kontaktTelefon, String email, 
			String adresaKancelarije, String br, Titula titula, Zvanje zvanje ) {
		BazaProfesora.getInstance().dodajProfesora(ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,email,adresaKancelarije,br,titula,zvanje);
		promeniIzgled();
	}
	
	
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

	public void izmeniProfesora(int selectedRow, String ime, String prezime, Date datumRodjenja, 
			String adresaStanovanja, String kontaktTelefon, String email, 
			String adresaKancelarije, String br, Titula titula, Zvanje zvanje) {
		if (selectedRow < 0) {
			return;
		}
		BazaProfesora.getInstance().izmeniProfesora(selectedRow, ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,email,adresaKancelarije,br,titula,zvanje);
		ProfAbstractTable model = (ProfAbstractTable) MyTabbedPane.getInstance().tabelaProfesora.getModel();
		model.fireTableDataChanged();
		MyTabbedPane.getInstance().validate();		
	}
	
	public void promeniIzgled() {
		ProfAbstractTable model = (ProfAbstractTable) MyTabbedPane.getInstance().tabelaProfesora.getModel();
		model.fireTableDataChanged();
		MyTabbedPane.getInstance().validate();
	}
}
