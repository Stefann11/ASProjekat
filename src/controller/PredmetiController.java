package controller;

import model.BazaPredmeta;
import model.GodinaStudija;
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
		
		

}
