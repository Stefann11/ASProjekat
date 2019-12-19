package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BazaProfesora {
	private static BazaProfesora instance = null;

	public static BazaProfesora getInstance() {
		if (instance == null) {
			instance = new BazaProfesora();
		}
		return instance;
	}
	
	private List<Profesor> profesori;
	private List<String> kolone;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	private BazaProfesora() {
	
		initProfesore();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum Rodjenja");
		this.kolone.add("Adresa Stanovanja");
		this.kolone.add("Kontakt Telefon");
		this.kolone.add("Email Adresa");
		this.kolone.add("Adresa Kancelarije");
		this.kolone.add("Broj Licne Karte");
		this.kolone.add("Titula");
		this.kolone.add("Zvanje");

	}

	private void initProfesore() {
		this.profesori = new ArrayList<Profesor>();
		String dateInString1 = "31/08/1982";
		Date date1 = new Date();
		String dateInString2 = "12/12/1968";
		Date date2 = new Date();
		String dateInString3 = "02/06/1970";
		Date date3 = new Date();
		try {
			date1 = formatter.parse(dateInString1);
			date2 = formatter.parse(dateInString2);
			date3 = formatter.parse(dateInString3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		profesori.add(new Profesor("Marko", "Markovic", date1, "Futoska bb, 21000 Novi Sad", "+38162 1234567",
				"marko.markovic@gmail.com", "Veljka Petrovica 20", 123456789, Titula.DOKTOR, Zvanje.ASISTENT));
		profesori.add(new Profesor("Nikola", "Nikolic", date2, "Bulevar Jase Tomica 13, 21000 Novi Sad", "+38164 7654321",
				"nikola.nikolic@gmail.com", "Veljka Petrovica 20", 987654321, Titula.MAGISTAR, Zvanje.PROFESOR));
		profesori.add(new Profesor("Zdravko", "Petkovic", date3, "Kisacka 23, 21000 Novi Sad", "+38162 3322117",
				"zdravko.petkovic@gmail.com", "Veljka Petrovica 20", 131214987, Titula.DOKTOR, Zvanje.PROFESOR));
		
	}
	
	public List<Profesor> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<Profesor> profesori) {
		this.profesori = profesori;
	}
	
	public int getColumnCount() {
		return 10;
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Profesor profesor = this.profesori.get(row);
		switch (column) {
		case 0:
			return profesor.getIme();
		case 1:
			return profesor.getPrezime();
		case 2:
			return profesor.getDatumRodjenja().toString();
		case 3:
			return profesor.getAdresaStanovanja();
		case 4:
			return profesor.getKontaktTelefon();
		case 5:
			return profesor.getEmailAdresa();
		case 6:
			return profesor.getAdresaKancelarije();
		case 7:
			return Integer.toString(profesor.getBrojLicneKarte());
		case 8:
			return profesor.getTitula().toString();
		case 9:
			return profesor.getZvanje().toString();
		default:
			return null;
		}
	}
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, 
			String adresaStanovanja, String kontaktTelefon, String email, 
			String adresaKancelarije, int br, Titula titula, Zvanje zvanje) {
		this.profesori.add(new Profesor(ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,email,adresaKancelarije,br,titula,zvanje));
	}

	public void izbrisiProfesora(int id) {
		for (Profesor p: profesori) {
			if (p.getBrojLicneKarte()==id) {
				profesori.remove(p);
				break;
			}
		}
	}

}
