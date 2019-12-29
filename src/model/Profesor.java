package model;

import java.util.ArrayList;
import java.util.Date;

public class Profesor {
	protected String ime;
	protected String prezime;
	protected Date datumRodjenja;
	protected String adresaStanovanja;
	protected String kontaktTelefon;
	protected String emailAdresa;
	protected String adresaKancelarije;
	protected int brojLicneKarte;
	protected Titula titula;
	protected Zvanje zvanje;
	protected ArrayList<Predmet>predmeti;
	
	public Profesor() {
		
	}
	
	public Profesor(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String adresaKancelarije, int brojLicneKarte, Titula titula, Zvanje zvanje,
			ArrayList<Predmet> predmeti) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresaStanovanja = adresaStanovanja;
		this.kontaktTelefon = kontaktTelefon;
		this.emailAdresa = emailAdresa;
		this.adresaKancelarije = adresaKancelarije;
		this.brojLicneKarte = brojLicneKarte;
		this.titula = titula;
		this.zvanje = zvanje;
		this.predmeti = predmeti;
	}
	
	//za tabelu
	public Profesor(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String adresaKancelarije, int brojLicneKarte, Titula titula, Zvanje zvanje) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresaStanovanja = adresaStanovanja;
		this.kontaktTelefon = kontaktTelefon;
		this.emailAdresa = emailAdresa;
		this.adresaKancelarije = adresaKancelarije;
		this.brojLicneKarte = brojLicneKarte;
		this.titula = titula;
		this.zvanje = zvanje;
	}
	
//	public Profesor(String ime, String prezime, Date datumRodjenja, int brojLicneKarte) {
//		super();
//		this.ime = ime;
//		this.prezime = prezime;
//		this.datumRodjenja = datumRodjenja;
//		this.brojLicneKarte = brojLicneKarte;
//	}

	public Object toCell(int col) {
		switch(col) {
		case 0: return ime;
		case 1: return prezime;
		case 2: return datumRodjenja;
		case 3: return adresaStanovanja;
		case 4: return kontaktTelefon;
		case 5: return emailAdresa;
		case 6: return adresaKancelarije;
		case 7: return brojLicneKarte;
		case 8: return titula;
		case 9: return zvanje;
		default: return null;
		}
	}

	public void set(int col, Object value) {
		switch(col) {
		case 0: ime = (String)value;
		break;
		case 1: prezime = (String)value;
		break;
		case 2: datumRodjenja = (Date)value;
		break;
		case 3: brojLicneKarte = (int)value;
		break;
		case 4: kontaktTelefon = (String)value;
		break;
		case 5: emailAdresa = (String)value;
		break;
		case 6: adresaKancelarije = (String)value;
		break;
		case 7: brojLicneKarte=(int)value;
		break;
		case 8: titula=(Titula)value;
		break;
		case 9: zvanje=(Zvanje)value;
		}
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
	public String getAdresaKancelarije() {
		return adresaKancelarije;
	}
	public void setAdresaKancelarije(String adresaKancelarije) {
		this.adresaKancelarije = adresaKancelarije;
	}
	public int getBrojLicneKarte() {
		return brojLicneKarte;
	}
	public void setBrojLicneKarte(int brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}
	public Titula getTitula() {
		return titula;
	}
	public void setTitula(Titula titula) {
		this.titula = titula;
	}
	public Zvanje getZvanje() {
		return zvanje;
	}
	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}
	
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	@Override
	public String toString() {
		return "Profesor [ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja
				+ ", adresaStanovanja=" + adresaStanovanja + ", kontaktTelefon=" + kontaktTelefon + ", emailAdresa="
				+ emailAdresa + ", adresaKancelarije=" + adresaKancelarije + ", brojLicneKarte=" + brojLicneKarte
				+ ", titula=" + titula + ", zvanje=" + zvanje + ", predmeti=" + predmeti + "]";
	}
	
	

}
