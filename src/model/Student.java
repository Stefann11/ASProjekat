package model;

import java.util.ArrayList;

enum godinaStudija 
{ 
    PRVA, DRUGA, TRECA, CETVRTA; 
} 

enum enumStatus 
{ 
    B,S; 
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
	protected enumStatus status;
	protected double prosecnaOcena;
	protected  ArrayList<Predmet>predmeti;
	
	
	
	public Student() {
		
	}


	public Student(String ime, String prezime, String datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, String datumUpisa, godinaStudija trenutnaGodinaStudija, enumStatus status,
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
		this.status = status;
		this.prosecnaOcena = prosecnaOcena;
		this.predmeti = predmeti;
	}
	
	
	public Student(String brojIndeksa,String ime, String prezime, godinaStudija trenutnaGodinaStudija,
			enumStatus status, double prosecnaOcena) {
		this.brojIndeksa = brojIndeksa;
		this.ime = ime;
		this.prezime = prezime;
		this.trenutnaGodinaStudija = trenutnaGodinaStudija;
		this.status = status;
		this.prosecnaOcena = prosecnaOcena;
	}

	public Object toCell(int col) {
		switch(col) {
		case 0: return brojIndeksa;
		case 1: return ime;
		case 2: return prezime;
		case 3: return trenutnaGodinaStudija;
		case 4: return status;
		case 5: return prosecnaOcena;
		default: return null;
		}
	}

	public void set(int col, Object value) {
		switch(col) {
		case 0: brojIndeksa = (String)value;
		break;
		case 1: ime = (String)value;
		break;
		case 2: prezime = (String)value;
		break;
		case 3: trenutnaGodinaStudija = (godinaStudija)value;
		break;
		case 4: status = (enumStatus)value;
		break;
		case 5: prosecnaOcena = (double)value;
		}
	}

	public enumStatus getStatus() {
		return status;
	}


	public void setStatus(enumStatus status) {
		this.status = status;
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
				+ ", trenutnaGodinaStudija=" + trenutnaGodinaStudija + ", status=" + status + ", prosecnaOcena="
				+ prosecnaOcena + ", predmeti=" + predmeti + "]";
	}

	
}
