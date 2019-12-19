package model;

import java.util.ArrayList;
import java.util.List;

public class BazaStudenta {
	private static BazaStudenta instance = null;

	public static BazaStudenta getInstance() {
		if (instance == null) {
			instance = new BazaStudenta();
		}
		return instance;
	}
	
	private List<Student> studenti;
	private List<String> kolone;

	private BazaStudenta() {
	
		initStudenti();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Indeks");
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Godina studija");
		this.kolone.add("Status");
		this.kolone.add("Prosek");

	}

	private void initStudenti() {
		this.studenti = new ArrayList<Student>();
		studenti.add(new Student("RA22-2019","Petar", "Petrovic",GodinaStudija.PRVA, Status.S,6.94));
		studenti.add(new Student("RA12-2018","Nikolina", "Peric",GodinaStudija.DRUGA, Status.B,8.50));
		studenti.add(new Student("RA32-2016","Nemanja", "Kolovic",GodinaStudija.PRVA, Status.B,9.46));
		
	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}

	public int getColumnCount() {
		return 6;
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Student getRow(int rowIndex) {
		return this.studenti.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Student student = this.studenti.get(row);
		switch (column) {
		case 0:
			return student.getBrojIndeksa();
		case 1:
			return student.getIme();
		case 2:
			return student.getPrezime();
		case 3:
			return student.getTrenutnaGodinaStudija().toString();
		case 4:
			return student.getStatus().toString();
		case 5:
			return Double.toString(student.getProsecnaOcena());
		default:
			return null;
		}
	}
	public void dodajStudenta(String indeks,String ime, String prezime, GodinaStudija tgs, Status s, double po) {
		this.studenti.add(new Student(indeks,ime,prezime,tgs,s,po));
	}
	public void izbrisiStudenta(String id) {
		for (Student s: studenti) {
			if (s.getBrojIndeksa()==id) {
				studenti.remove(s);
				break;
			}
		}
	}

}
