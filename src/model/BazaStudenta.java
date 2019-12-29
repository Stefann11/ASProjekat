package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BazaStudenta {
	private static BazaStudenta instance = null;

	public static BazaStudenta getInstance() {
		if (instance == null) {
			instance = new BazaStudenta();
		}
		return instance;
	}
	
	private List<Student> studenti;
	private List<String> kolone;

	SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
	
	private BazaStudenta() {
	
		initStudenti();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Indeks");
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum rodjenja");
		this.kolone.add("Adresa stanovanja");
		this.kolone.add("Kontakt telefon");
		this.kolone.add("Email adresa");
		this.kolone.add("Datum upisa");
		this.kolone.add("Godina studija");
		this.kolone.add("Status");
		this.kolone.add("Prosek");

	}

	private void initStudenti() {
		this.studenti = new ArrayList<Student>();
		String dateInString1 = "31.08.1982";
		Date date1 = new Date();
		String dateInString2 = "12.12.1968";
		Date date2 = new Date();
		String dateInString3 = "02.06.1970";
		Date date3 = new Date();
		try {
			date1 = formatter.parse(dateInString1);
			date2 = formatter.parse(dateInString2);
			date3 = formatter.parse(dateInString3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		studenti.add(new Student("Petar", "Petrovic",(Date) date1,"Novi Sad","+38163444555","bla.bla@gmail.com","RA12-2017",(Date) date1,GodinaStudija.TREĆA, Status.S,6.94));
		studenti.add(new Student("Andrija", "Markovic",(Date) date1,"Novi Sad","+38163333252","andrijamar@gmail.com","RA13-2018",(Date) date1,GodinaStudija.DRUGA, Status.B,7.94));
		studenti.add(new Student("Jovana", "Ristic",(Date) date1,"Novi Sad","+38163444555","bla.bla@gmail.com","RA12-2019",(Date) date1,GodinaStudija.PRVA, Status.B,8.80));
		
		
	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}

	public int getColumnCount() {
		return 11;
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Student getRow(int rowIndex) {
		return this.studenti.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Student student = this.studenti.get(row);
		switch (column) {
		case 0:
			return student.getBrojIndeksa();
		case 1:
			return student.getIme();
		case 2:
			return student.getPrezime();
		case 3:
			return student.getDatumRodjenja().toString();
		case 4:
			return student.getAdresaStanovanja();
		case 5:
			return student.getKontaktTelefon();
		case 6:
			return student.getEmailAdresa();
		case 7:
			return student.getDatumUpisa().toString();
		case 8:
			return student.getTrenutnaGodinaStudija().toString();
		case 9:
			return student.getStatus().toString();
		case 10:
			return Double.toString(student.getProsecnaOcena());
		default:
			return null;
		}
	}
	public void dodajStudenta(String ime, String prezime, Date date1, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date date12, GodinaStudija trenutnaGodinaStudija, Status status,
			double prosecnaOcena) {
		this.studenti.add(new Student(ime, prezime, date1, adresaStanovanja, kontaktTelefon, emailAdresa, brojIndeksa, date12, trenutnaGodinaStudija, status,prosecnaOcena));
	}
	public void izbrisiStudenta(String id) {
		for (Student s: studenti) {
			if (s.getBrojIndeksa()==id) {
				studenti.remove(s);
				break;
			}
		}
	}

}
