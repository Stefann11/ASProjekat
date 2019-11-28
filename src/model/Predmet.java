package model;

import java.util.ArrayList;

public class Predmet {
	private String sifraPredmeta;
	private String nazivPredmeta;
	private int semestar;
	private int godinaStudijaPredmet;
	private Profesor predmetniProfesor;
	private ArrayList<Student>spisakStudenata;
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
	public int getGodinaStudijaPredmet() {
		return godinaStudijaPredmet;
	}
	public void setGodinaStudijaPredmet(int godinaStudijaPredmet) {
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
