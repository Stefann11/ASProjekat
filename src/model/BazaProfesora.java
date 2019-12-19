package model;

import java.util.ArrayList;
import java.util.List;

public class BazaProfesora {
	private static BazaProfesora instance = null;

	public static BazaProfesora getInstance() {
		if (instance == null) {
			instance = new BazaProfesora();
		}
		return instance;
	}
	
	private List<Profesor> profesori;
	private List<String> kolone;

	private BazaProfesora() {
	
		initProfesore();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum Rodjenja");
		this.kolone.add("Broj Licne Karte");

	}

	private void initProfesore() {
		this.profesori = new ArrayList<Profesor>();
		profesori.add(new Profesor("Marko", "Markovic", "04-08-1970", 123456789));
		profesori.add(new Profesor("Nikola", "Nikolic", "12-12-1968", 987654321));
		profesori.add(new Profesor("Zdravko", "Petkovic", "02-06-1960", 131214987));
		
	}
	
	public List<Profesor> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<Profesor> profesori) {
		this.profesori = profesori;
	}
	
	public int getColumnCount() {
		return 4;
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Profesor profesor = this.profesori.get(row);
		switch (column) {
		case 0:
			return profesor.getIme();
		case 1:
			return profesor.getPrezime();
		case 2:
			return profesor.getDatumRodjenja();
		case 3:
			return Integer.toString(profesor.getBrojLicneKarte());
		default:
			return null;
		}
	}
	
	public void dodajProfesora(String ime, String prezime, String datumRodjenja, int br) {
		this.profesori.add(new Profesor(ime,prezime,datumRodjenja,br));
	}

	public void izbrisiProfesora(int id) {
		for (Profesor p: profesori) {
			if (p.getBrojLicneKarte()==id) {
				profesori.remove(p);
				break;
			}
		}
	}

}
