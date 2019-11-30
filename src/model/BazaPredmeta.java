package model;

import java.util.ArrayList;
import java.util.List;

public class BazaPredmeta {
	private static BazaPredmeta instance = null;

	public static BazaPredmeta getInstance() {
		if (instance == null) {
			instance = new BazaPredmeta();
		}
		return instance;
	}

	private List<Predmet> predmeti;
	private List<String> kolone;
	
	private BazaPredmeta() {
		
		initPredmete();

		this.kolone = new ArrayList<String>();
		this.kolone.add("�IFRA PREDMETA");
		this.kolone.add("NAZIV PREDMETA");
		this.kolone.add("SEMESTAR");
		this.kolone.add("GODINA STUDIJA PREDMETA");
		//this.kolone.add("PREDMETNI PROFESOR");
		//this.kolone.add("SPISAK STUDENATA");
	}

	private void initPredmete() {
		this.predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("sp1", "Analiza", 1, godinaPredmeta.PRVA));
		predmeti.add(new Predmet("sp2", "Algebra", 3, godinaPredmeta.DRUGA));
		predmeti.add(new Predmet("sp3", "Programiranje", 5, godinaPredmeta.TRECA));
		
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Predmet getRow(int rowIndex) {
		return this.predmeti.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Predmet predmet = this.predmeti.get(row);
		switch (column) {
		case 0:
			return predmet.getSifraPredmeta();
		case 1:
			return predmet.getNazivPredmeta();
		case 2:
			return Integer.toString(predmet.getSemestar());
		default:
			return null;
		}
	}
	
	public void dodajPredmet(String sifra, String naziv, int semestar, godinaPredmeta godina) {
		this.predmeti.add(new Predmet(sifra, naziv, semestar, godina));
	}

	public void izbrisiPredmet(String id) {
		for (Predmet p : predmeti) {
			if (p.getSifraPredmeta().equals(id)) {
				predmeti.remove(p);
				break;
			}
		}
	}


}
