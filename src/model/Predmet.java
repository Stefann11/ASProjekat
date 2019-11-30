package model;

import java.util.ArrayList;

enum godinaPredmeta 
{ 
    PRVA, DRUGA, TRECA, CETVRTA; 
}

public class Predmet {
	private String sifraPredmeta;
	private String nazivPredmeta;
	private int semestar;
	protected godinaPredmeta  godinaStudijaPredmet;
	private Profesor predmetniProfesor;
	private ArrayList<Student>spisakStudenata;
	
	public Predmet(String sifraPredmeta, String nazivPredmeta, int semestar, godinaPredmeta  godinaStudijaPredmet,
			Profesor predmetniProfesor, ArrayList<Student> spisakStudenata) {
		super();
		this.sifraPredmeta = sifraPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.semestar = semestar;
		this.godinaStudijaPredmet = godinaStudijaPredmet;
		this.predmetniProfesor = predmetniProfesor;
		this.spisakStudenata = spisakStudenata;
	}
	
	//samo alternativno, treba obristati
	public Predmet(String sifraPredmeta, String nazivPredmeta, int semestar, godinaPredmeta  godinaStudijaPredmet) {
		super();
		this.sifraPredmeta = sifraPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.semestar = semestar;
		this.godinaStudijaPredmet = godinaStudijaPredmet;
	}

	public String getSifraPredmeta() {
		return sifraPredmeta;
	}

	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public int getSemestar() {
		return semestar;
	}
	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}
	public godinaPredmeta  getGodinaStudijaPredmet() {
		return godinaStudijaPredmet;
	}
	public void setGodinaStudijaPredmet(godinaPredmeta  godinaStudijaPredmet) {
		this.godinaStudijaPredmet = godinaStudijaPredmet;
	}
	public Profesor getPredmetniProfesor() {
		return predmetniProfesor;
	}
	public void setPredmetniProfesor(Profesor predmetniProfesor) {
		this.predmetniProfesor = predmetniProfesor;
	}
	public ArrayList<Student> getSpisakStudenata() {
		return spisakStudenata;
	}
	public void setSpisakStudenata(ArrayList<Student> spisakStudenata) {
		this.spisakStudenata = spisakStudenata;
	}
	@Override
	public String toString() {
		return "Predmet [sifraPredmeta=" + sifraPredmeta + ", nazivPredmeta=" + nazivPredmeta + ", semestar=" + semestar
				+ ", godinaStudijaPredmet=" + godinaStudijaPredmet + ", predmetniProfesor=" + predmetniProfesor + "]";
	}
	
	
	

}
