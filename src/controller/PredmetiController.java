package controller;

import model.BazaPredmeta;
import model.BazaProfesora;
import model.GodinaStudija;
import model.Predmet;
import model.Profesor;
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
			PredAbstractTable model = (PredAbstractTable) MyTabbedPane.getInstance().tabelaPredmeta.getModel();
			model.fireTableDataChanged();
			MyTabbedPane.getInstance().validate();
		}
		
		public void IzbrisiPredmet(int rowSelectedIndex) {
			
			if (rowSelectedIndex < 0) {
				return;
			}
			Predmet predmet = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
			BazaPredmeta.getInstance().izbrisiPredmet(predmet.getSifraPredmeta());
			PredAbstractTable model = (PredAbstractTable) MyTabbedPane.getInstance().tabelaPredmeta.getModel();
			model.fireTableDataChanged();
			MyTabbedPane.getInstance().validate();
		}
		
		public void IzmeniPredmet(int rowSelectedIndex, String sifra, String naziv, int semestar, GodinaStudija godina) {
			if (rowSelectedIndex < 0) {
				return;
			}
			BazaPredmeta.getInstance().izmeniPredmet(rowSelectedIndex, sifra, naziv, semestar, godina);
			PredAbstractTable model = (PredAbstractTable) MyTabbedPane.getInstance().tabelaPredmeta.getModel();
			model.fireTableDataChanged();
			MyTabbedPane.getInstance().validate();		
		}
		
		public void dodavanjeProfesoraNaPredmet(int selektovaniRed, int broj) {
//			Predmet predmet = BazaPredmeta.getInstance().getRow(selektovaniRed);
//			for (Profesor profesor : BazaProfesora.getInstance().getProfesori()) {
//				if (profesor.getBrojLicneKarte()==broj) {
//					predmet.setPredmetniProfesor(profesor);
					BazaPredmeta.getInstance().dodajProfesoraNaPredmet(selektovaniRed, broj);
					PredAbstractTable model = (PredAbstractTable) MyTabbedPane.getInstance().tabelaPredmeta.getModel();
					//model.setValueAt(profesor, selektovaniRed, 4);
					model.fireTableDataChanged();
					MyTabbedPane.getInstance().validate();
					//break;
//				}
//			}
			//System.out.println(predmet);
		}
		
		

}
