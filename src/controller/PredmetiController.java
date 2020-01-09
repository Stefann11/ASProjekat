package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.BazaPredmeta;
import model.GodinaStudija;
import model.Predmet;
import view.MyTabbedPane;
import view.PredAbstractTable;

public class PredmetiController {
	
		private static PredmetiController instance=null;
	
		public static PredmetiController getInstance() {
			if (instance == null) {
				instance = new PredmetiController();
			}
		return instance;
		}
		
		private PredmetiController() {}
		
		public void DodajPredmet(String sifra, String naziv, int semestar, GodinaStudija god ) {
			BazaPredmeta.getInstance().dodajPredmet(sifra, naziv, semestar, god);
			promeniIzgled();
		}
		
		public void IzbrisiPredmet(int rowSelectedIndex) {
			
			if (rowSelectedIndex < 0) {
				return;
			}
			Predmet predmet = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
			BazaPredmeta.getInstance().izbrisiPredmet(predmet.getSifraPredmeta());
			promeniIzgled();
		}
		
		public void IzmeniPredmet(int rowSelectedIndex, String sifra, String naziv, int semestar, GodinaStudija godina) {
			if (rowSelectedIndex < 0) {
				return;
			}
			BazaPredmeta.getInstance().izmeniPredmet(rowSelectedIndex, sifra, naziv, semestar, godina);
			promeniIzgled();	
		}
		
		
		public void dodavanjeStudentaNaPredmet(int selektovaniRed, String indeks) {
			if(BazaPredmeta.getInstance().dodajStudentaNaPredmet(selektovaniRed, indeks))
			promeniIzgled();
			else {
				JOptionPane.showMessageDialog(null, "Student nije dodat, jer njegova/njena godina studija nije ista kao i godina na kojoj se slusa predmet.");
			}
		}
		
		public void dodavanjeProfesoraNaPredmet(int selektovaniRed, String broj) {
			BazaPredmeta.getInstance().dodajProfesoraNaPredmet(selektovaniRed, broj);
			promeniIzgled();
		}
		
		public void obrisiProfesoraSaPredmeta() {
			if (MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow()<0) {
				JOptionPane.showMessageDialog(null, "Niste izabrali predmet");
			} else {
			int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
			BazaPredmeta.getInstance().obrisiProfesoraSaPredmeta(selektovaniRed);
			promeniIzgled();
			}
		}
		
		public void promeniIzgled() {
			PredAbstractTable model = (PredAbstractTable) MyTabbedPane.getInstance().tabelaPredmeta.getModel();
			model.fireTableDataChanged();
			MyTabbedPane.getInstance().validate();
		}
		
		

}
