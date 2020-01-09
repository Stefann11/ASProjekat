package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controller.PredmetiController;
import view.PrikazivanjeSpiskaStudenata;

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
//		predmeti.add(new Predmet("sp1", "Analiza", 1, GodinaStudija.PRVA));
//		predmeti.add(new Predmet("sp2", "Algebra", 3, GodinaStudija.DRUGA));
//		predmeti.add(new Predmet("sp3", "Programiranje", 5, GodinaStudija.TREĆA));
//		
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
		int i = 0;
		for (Predmet p: this.predmeti) {
			if (p.getSifraPredmeta().contentEquals(sifra)) {
				JOptionPane.showMessageDialog(null, "Vec postoji predmet sa sifrom: " + sifra );
				break;
			}
			i++;
		}
		if (i==this.predmeti.size()) {
			this.predmeti.add(new Predmet(sifra, naziv, semestar, godina));
		}
		
			
	}

	public void izbrisiPredmet(String id) {
		for (Predmet p : predmeti) {
			if (p.getSifraPredmeta().equals(id)) {
				//Profesor profesor = p.getPredmetniProfesor();
				for (Profesor profesor : BazaProfesora.getInstance().getProfesori()) {
					if (p.getPredmetniProfesor()==profesor) {
						profesor.getPredmeti().remove(p);
					}
				}
				
				for (Student student : BazaStudenta.getInstance().getStudenti()) {
					for(Student s2 : p.getSpisakStudenata())
						if (s2 == student) {
							s2.getPredmeti().remove(p);
					}
				}
					
				
				predmeti.remove(p);
				break;
			}
		}
	}
	
	public void izmeniPredmet(int selectedRow, String sifra, String naziv, int semestar, GodinaStudija godina) {
		int i = 0;
		int brojac = 0;
		for (Predmet p : predmeti) {
			if (i==selectedRow) {
				for (Predmet predmet: predmeti) {
					if (predmet.getSifraPredmeta().equals(sifra)) {
						if (!predmet.equals(p)) {
							JOptionPane.showMessageDialog(null, "Vec postoji predmet sa sifrom: " + sifra);
							break;
						}
					}
					brojac++;
				}
				if (brojac==predmeti.size()) {
					p.setSifraPredmeta(sifra);
					p.setNazivPredmeta(naziv);
					p.setSemestar(semestar);
					p.setGodinaStudijaPredmet(godina);
				}
			}
			i++;
		}
	}
	
	
	public boolean dodajStudentaNaPredmet(int selectedRow, String indeks) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		for (Student student : BazaStudenta.getInstance().getStudenti()) {
			if (student.getBrojIndeksa().equals(indeks)) {
				if(student.getTrenutnaGodinaStudija().toString().equals(predmet.getGodinaStudijaPredmet().toString())) {
				predmet.getSpisakStudenata().add(student);
				
				student.getPredmeti().add(predmet);
				return true;
				}
			}
		}
		return false;
	}
	
	public void obrisiStudentaSaPredmeta(int selectedRow, String index) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		index = index.trim();
		for(Student s : BazaStudenta.getInstance().getStudenti()) {
			if(s.getBrojIndeksa().equals(index)) {
				predmet.getSpisakStudenata().remove(s);
				s.getPredmeti().remove(predmet);
				break;
			}
			
		}
	}

	
	public void dodajProfesoraNaPredmet(int selectedRow, int broj) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		int i = 0;
		for (Profesor profesor : BazaProfesora.getInstance().getProfesori()) {
			i++;
			if (profesor.getBrojLicneKarte()==broj) {
				if (predmet.getPredmetniProfesor()!=null) {
					if (predmet.getPredmetniProfesor().getBrojLicneKarte()!=profesor.getBrojLicneKarte()){
						Profesor bivsiProf=predmet.getPredmetniProfesor();
						bivsiProf.getPredmeti().remove(predmet);
					} else {
						JOptionPane.showMessageDialog(null, "Uneti profesor je vec predmetni profesor na ovom predmetu");
						break;
					}
				}
				predmet.setPredmetniProfesor(profesor);
				profesor.getPredmeti().add(predmet);
				
				
				
				break;
			} else if(i==BazaProfesora.getInstance().getProfesori().size()) {
				JOptionPane.showMessageDialog(null, "Ne postoji profesor sa tim indeksom");
			}
		}
	}
	
	public void obrisiProfesoraSaPredmeta(int selectedRow) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		Profesor profesor = predmet.getPredmetniProfesor();
		predmet.setPredmetniProfesor(null);
		profesor.getPredmeti().remove(predmet);
	}
	
	public void serijalizacijaPredmeta() {
		try {
			FileOutputStream file = new FileOutputStream("predmeti.dat");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(BazaPredmeta.getInstance().getPredmeti());
			
			out.close();
			file.close();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void deserijalizacijaPredmeta() {
		try {
			FileInputStream file = new FileInputStream("predmeti.dat");
			ObjectInputStream in= new ObjectInputStream(file);
			ArrayList<Predmet> predmeti = (ArrayList<Predmet>) in.readObject();
			BazaPredmeta.getInstance().setPredmeti(predmeti);
			PredmetiController.getInstance().promeniIzgled();
			
			in.close();
			file.close();
		}catch (IOException ie) {
			ie.printStackTrace();
		}catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
	}


}
