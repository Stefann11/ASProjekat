/**
 * 
 */
package controller;

import java.util.Date;

import model.BazaPredmeta;
import model.BazaProfesora;
import model.BazaStudenta;
import model.GodinaStudija;
import model.Status;
import model.Student;
import view.MyTabbedPane;
import view.PredAbstractTable;
import view.StudAbstractTable;

/**
 * @author Aleksa Santrac
 *
 */
public class StudentiController {

	private static StudentiController instance=null;
	
	public static StudentiController getInstance() {
		if (instance == null) {
			instance = new StudentiController();
		}
	return instance;
	}
	
	private StudentiController() {}
	
	public void DodajStudenta(String ime, String prezime, Date date1, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date date12, GodinaStudija trenutnaGodinaStudija, Status status,
			double prosecnaOcena) {
		BazaStudenta.getInstance().dodajStudenta(ime, prezime, date1, adresaStanovanja, kontaktTelefon, emailAdresa, brojIndeksa, date12, trenutnaGodinaStudija, status,prosecnaOcena);
		StudAbstractTable model = (StudAbstractTable) MyTabbedPane.getInstance().tabelaStudenata.getModel();
		model.fireTableDataChanged();
		MyTabbedPane.getInstance().validate();
	}
	
	public void IzbrisiStudenta(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		Student student = BazaStudenta.getInstance().getRow(rowSelectedIndex);
		BazaStudenta.getInstance().izbrisiStudenta(student.getBrojIndeksa());
		StudAbstractTable model = (StudAbstractTable) MyTabbedPane.getInstance().tabelaStudenata.getModel();
		model.fireTableDataChanged();
		MyTabbedPane.getInstance().validate();
	}
	
	
	public void izmeniStudenta(int selectedRow, String ime, String prezime, Date date1, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date date12, GodinaStudija trenutnaGodinaStudija, Status status,
			double prosecnaOcena) {
		if (selectedRow < 0) {
			return;
		}
		BazaStudenta.getInstance().izmeniStudenta(selectedRow, ime, prezime, date1, adresaStanovanja, kontaktTelefon, emailAdresa, brojIndeksa, date12, trenutnaGodinaStudija, status, prosecnaOcena);
		StudAbstractTable model = (StudAbstractTable) MyTabbedPane.getInstance().tabelaStudenata.getModel();
		model.fireTableDataChanged();
		MyTabbedPane.getInstance().validate();		
	}
	
}
