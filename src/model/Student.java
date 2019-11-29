package model;

import java.util.ArrayList;

enum godinaStudija 
{ 
    PRVA, DRUGA, TRECA, CETVRTA; 
} 

public class Student {
	protected String ime;
	protected  String prezime;
	protected String datumRodjenja;
	protected String adresaStanovanja;
	protected String kontaktTelefon;
	protected  String emailAdresa;
	protected String brojIndeksa;
	protected String datumUpisa;
	protected godinaStudija trenutnaGodinaStudija;
	protected double prosecnaOcena;
	protected  ArrayList<Predmet>predmeti;
	
	
	public Student(String ime, String prezime, String datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, String datumUpisa, godinaStudija trenutnaGodinaStudija,
			double prosecnaOcena, ArrayList<Predmet> predmeti) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresaStanovanja = adresaStanovanja;
		this.kontaktTelefon = kontaktTelefon;
		this.emailAdresa = emailAdresa;
		this.brojIndeksa = brojIndeksa;
		this.datumUpisa = datumUpisa;
		this.trenutnaGodinaStudija = trenutnaGodinaStudija;
		this.prosecnaOcena = prosecnaOcena;
		this.predmeti = predmeti;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getDatumRodjenja() {
		return datumRodjenja;
	}


	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}


	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}


	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}


	public String getKontaktTelefon() {
		return kontaktTelefon;
	}


	public void setKontaktTelefon(String kontaktTelefon) {
		this.kontaktTelefon = kontaktTelefon;
	}


	public String getEmailAdresa() {
		return emailAdresa;
	}


	public void setEmailAdresa(String emailAdresa) {
		this.emailAdresa = emailAdresa;
	}


	public String getBrojIndeksa() {
		return brojIndeksa;
	}


	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}


	public String getDatumUpisa() {
		return datumUpisa;
	}


	public void setDatumUpisa(String datumUpisa) {
		this.datumUpisa = datumUpisa;
	}


	public godinaStudija getTrenutnaGodinaStudija() {
		return trenutnaGodinaStudija;
	}


	public void setTrenutnaGodinaStudija(godinaStudija trenutnaGodinaStudija) {
		this.trenutnaGodinaStudija = trenutnaGodinaStudija;
	}


	public double getProsecnaOcena() {
		return prosecnaOcena;
	}


	public void setProsecnaOcena(double prosecnaOcena) {
		this.prosecnaOcena = prosecnaOcena;
	}


	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}


	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}


	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja
				+ ", adresaStanovanja=" + adresaStanovanja + ", kontaktTelefon=" + kontaktTelefon + ", emailAdresa="
				+ emailAdresa + ", brojIndeksa=" + brojIndeksa + ", datumUpisa=" + datumUpisa
				+ ", trenutnaGodinaStudija=" + trenutnaGodinaStudija + ", prosecnaOcena=" + prosecnaOcena
				+ ", predmeti=" + predmeti + "]";
	}
	
	
	
}
