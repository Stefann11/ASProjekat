package model;

import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;


//enum enumStatus 
//{ 
//    B,S; 
//} 


public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 662325754575048428L;
	protected String ime;
	protected  String prezime;
	protected Date datumRodjenja;
	protected String adresaStanovanja;
	protected String kontaktTelefon;
	protected  String emailAdresa;
	protected String brojIndeksa;
	protected Date datumUpisa;
	protected GodinaStudija trenutnaGodinaStudija;
	protected Status status;
	protected double prosecnaOcena;
	protected  ArrayList<Predmet>predmeti;
	
	
	
	public Student() {
		
	}


	public Student(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, GodinaStudija trenutnaGodinaStudija, Status status,
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
	
	
	public Student(String ime, String prezime, Date date1, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date date12, GodinaStudija trenutnaGodinaStudija, Status status,
			double prosecnaOcena) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = date1;
		this.adresaStanovanja = adresaStanovanja;
		this.kontaktTelefon = kontaktTelefon;
		this.emailAdresa = emailAdresa;
		this.brojIndeksa = brojIndeksa;
		this.datumUpisa = date12;
		this.trenutnaGodinaStudija = trenutnaGodinaStudija;
		this.status = status;
		this.prosecnaOcena = prosecnaOcena;
		this.predmeti = new ArrayList<Predmet>();
	}

	public Object toCell(int col) {
		switch(col) {
		case 0: return brojIndeksa;
		case 1: return ime;
		case 2: return prezime;
		case 3: return datumRodjenja;
		case 4: return adresaStanovanja;
		case 5: return kontaktTelefon;
		case 6: return emailAdresa;
		case 7: return datumUpisa;
		case 8: return trenutnaGodinaStudija;
		case 9: return status;
		case 10: return prosecnaOcena;
		
		default: return null;
		}
	}

	public void set(int col, Object value) {
		switch(col) {
		case 0: brojIndeksa = (String)value;
		break;
		case 1:  ime = (String)value;
		break;
		case 2:  prezime = (String)value;
		break;
		case 3:  datumRodjenja = (Date)value;
		break;
		case 4:  adresaStanovanja = (String)value;
		break;
		case 5: kontaktTelefon = (String)value;
		break;
		case 6:  emailAdresa = (String)value;
		break;
		case 7:  datumUpisa = (Date)value;
		break;
		case 8:  trenutnaGodinaStudija = (GodinaStudija)value;
		break;
		case 9:  status = (Status)value;
		break;
		case 10:  prosecnaOcena = (double)value;		}
	}

	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
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


	public Date getDatumRodjenja() {
		return datumRodjenja;
	}


	public void setDatumRodjenja(Date datumRodjenja) {
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


	public Date getDatumUpisa() {
		return datumUpisa;
	}


	public void setDatumUpisa(Date datumUpisa) {
		this.datumUpisa = datumUpisa;
	}


	public GodinaStudija getTrenutnaGodinaStudija() {
		return trenutnaGodinaStudija;
	}


	public void setTrenutnaGodinaStudija(GodinaStudija trenutnaGodinaStudija) {
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
		return brojIndeksa + "\n";
	}
	
	public void izbrisiPredmet(String sifra) {
		for(Predmet p: predmeti) {
			if (p.getSifraPredmeta().equals(sifra)) {
				predmeti.remove(p);
				break;
			}
		}
	}

	
}
