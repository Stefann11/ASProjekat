package controller;

import java.util.ArrayList;
import java.util.List;

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
			BazaPredmeta.getInstance().dodajStudentaNaPredmet(selektovaniRed, indeks);
			promeniIzgled();
		}
		
		public void dodavanjeProfesoraNaPredmet(int selektovaniRed, int broj) {
			BazaPredmeta.getInstance().dodajProfesoraNaPredmet(selektovaniRed, broj);
			promeniIzgled();
		}
		
		public void obrisiProfesoraSaPredmeta() {
			int selektovaniRed=MyTabbedPane.getInstance().tabelaPredmeta.convertRowIndexToModel(MyTabbedPane.getInstance().tabelaPredmeta.getSelectedRow());
			BazaPredmeta.getInstance().obrisiProfesoraSaPredmeta(selektovaniRed);
			promeniIzgled();
		}
		
		public void promeniIzgled() {
			PredAbstractTable model = (PredAbstractTable) MyTabbedPane.getInstance().tabelaPredmeta.getModel();
			model.fireTableDataChanged();
			MyTabbedPane.getInstance().validate();
		}
		
		public void searchPredmet(String tekst) {
			String[] polja = tekst.split(";");
			String[] deo;
			String naziv = null, sifra = null, semestarString = null, godinaStudijaString = null;
			int semestar = 0, godinaStudija = 0;
			
			for (int i = 0; i<polja.length;i++) {
				deo = polja[i].split(":");
				if (deo[0].equals("sifra")) {
					sifra = deo[1];
				} else if (deo[0].equals("naziv")) {
					naziv = deo[1];
				} else if (deo[0].equals("semestar")) {
					semestarString = deo[1];
					semestar = Integer.parseInt(semestarString);
				}  else if (deo[0].equals("godina studija")) {
					godinaStudijaString = deo[1];
					godinaStudija=Integer.parseInt(godinaStudijaString);
				}
			}
			
			System.out.println(sifra + ", " + naziv + ", " + semestar + ", " + godinaStudija);
			List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
			filters.add(RowFilter.regexFilter(sifra, 1));

			TableRowSorter<PredAbstractTable> sorter;
			sorter = new TableRowSorter<>((PredAbstractTable) MyTabbedPane.getInstance().getModel());
			//sorter = new TableRowSorter<PredAbstractTable> MyTabbedPane.getInstance().tabelaPredmeta.getModel();
			sorter.setRowFilter(RowFilter.andFilter(filters));
			MyTabbedPane.getInstance().tabelaPredmeta.setRowSorter(sorter);
		}

}
