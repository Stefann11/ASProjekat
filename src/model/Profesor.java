package model;

import java.util.ArrayList;

public class Profesor {
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String adresaStanovanja;
	private String kontaktTelefon;
	private String emailAdresa;
	private String adresaKancelarije;
	private int brojLicneKarte;
	private String titula;
	private String zvanje;
	private ArrayList<Predmet>predmeti;
	public String getIme() {
		return ime;
	}
	
	public Profesor() {
		
	}
	
	public Profesor(String ime, String prezime, String datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String adresaKancelarije, int brojLicneKarte, String titula, String zvanje,
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
		case 2: datumRodjenja = (String)value;
		break;
		case 3: adresaStanovanja = (String)value;
		break;
		case 4: kontaktTelefon = (String)value;
		break;
		case 5: emailAdresa = (String)value;
		break;
		case 6: adresaKancelarije = (String)value;
		break;
		case 7: brojLicneKarte = (int)value;
		break;
		case 8: titula = (String)value;
		break;
		case 9: zvanje = (String)value;
		}
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
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public String getZvanje() {
		return zvanje;
	}
	public void setZvanje(String zvanje) {
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
