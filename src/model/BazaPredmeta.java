package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BazaPredmeta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3956135050364689494L;
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
		this.kolone.add("Šifra");
		this.kolone.add("Naziv");
		this.kolone.add("Semestar");
		this.kolone.add("Godina studija predmeta");

	}

	private void initPredmete() {
		this.predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("sp1", "Analiza", 1, GodinaStudija.PRVA));
		predmeti.add(new Predmet("sp2", "Algebra", 3, GodinaStudija.DRUGA));
		predmeti.add(new Predmet("sp3", "Programiranje", 5, GodinaStudija.TREĆA));
		
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	public int getColumnCount() {
		return 4;
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
		case 3:
			return predmet.getGodinaStudijaPredmet().toString();
		case 4:
			if (predmet.getPredmetniProfesor()!=null) {
				String imeprz= (predmet.getPredmetniProfesor().getIme() + " " + predmet.getPredmetniProfesor().getPrezime());
				return imeprz;
			} else
				return null;
		default:
			return null;
		}
	}
	
	public void dodajPredmet(String sifra, String naziv, int semestar, GodinaStudija godina) {
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
	
	public void izmeniPredmet(int selectedRow, String sifra, String naziv, int semestar, GodinaStudija godina) {
		int i = 0;
		for (Predmet p : predmeti) {
			if (i==selectedRow) {
				p.setSifraPredmeta(sifra);
				p.setNazivPredmeta(naziv);
				p.setSemestar(semestar);
				p.setGodinaStudijaPredmet(godina);
			}
			i++;
		}
	}
	
	
	public void dodajStudentaNaPredmet(int selectedRow, String indeks) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		for (Student student : BazaStudenta.getInstance().getStudenti()) {
			if (student.getBrojIndeksa().equals(indeks)) {
				predmet.getSpisakStudenata().add(student);
				student.getPredmeti().add(predmet);
				for (Student s : predmet.getSpisakStudenata()) {
					System.out.println(s);
				}
				
				break;
			}
		}
	}
	
//	public void obrisiStudentaSaPredmeta(int selectedRow) {
//		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
//		predmet.getSpisakStudenata().remove(index)
//		
//	}

	
	public void dodajProfesoraNaPredmet(int selectedRow, int broj) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		for (Profesor profesor : BazaProfesora.getInstance().getProfesori()) {
			if (profesor.getBrojLicneKarte()==broj) {
				predmet.setPredmetniProfesor(profesor);
				profesor.getPredmeti().add(predmet);
				
				break;
			}
		}
	}
	
	public void obrisiProfesoraSaPredmeta(int selectedRow) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		predmet.setPredmetniProfesor(null);
	}


}
