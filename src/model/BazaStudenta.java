package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import controller.StudentiController;

public class BazaStudenta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2826037726220047573L;
	private static BazaStudenta instance = null;

	public static BazaStudenta getInstance() {
		if (instance == null) {
			instance = new BazaStudenta();
		}
		return instance;
	}
	
	private List<Student> studenti;
	private List<String> kolone;

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
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
//		String dateInString1 = "31/08/1982";
//		Date date1 = new Date();
//		String dateInString2 = "12/12/1968";
//		Date date2 = new Date();
//		String dateInString3 = "02/06/1970";
//		Date date3 = new Date();
//		try {
//			date1 = formatter.parse(dateInString1);
//			date2 = formatter.parse(dateInString2);
//			date3 = formatter.parse(dateInString3);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		studenti.add(new Student("Petar", "Petrovic",(Date) date1,"Novi Sad","+38163444555","bla.bla@gmail.com","RA12-2017",(Date) date1,GodinaStudija.TREĆA, Status.S,6.94));
//		studenti.add(new Student("Andrija", "Markovic",(Date) date1,"Novi Sad","+38163333252","andrijamar@gmail.com","RA13-2018",(Date) date1,GodinaStudija.DRUGA, Status.B,7.94));
//		studenti.add(new Student("Jovana", "Ristic",(Date) date1,"Novi Sad","+38163444555","bla.bla@gmail.com","RA12-2019",(Date) date1,GodinaStudija.PRVA, Status.B,8.80));
//		
		
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
			String date = formatter.format(student.getDatumRodjenja());
			return date;
		case 4:
			return student.getAdresaStanovanja();
		case 5:
			return student.getKontaktTelefon();
		case 6:
			return student.getEmailAdresa();
		case 7:
			String date2 = formatter.format(student.getDatumUpisa());
			return date2;
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
		int i=0;
		for(Student s : this.studenti) {
			if(s.getBrojIndeksa().equals(brojIndeksa)) {
				JOptionPane.showMessageDialog(null, "Student sa indeksom: " + brojIndeksa + " vec postoji!");
				return;
			}
		i++;
		}
		if(i==this.studenti.size())
		this.studenti.add(new Student(ime, prezime, date1, adresaStanovanja, kontaktTelefon, emailAdresa, brojIndeksa, date12, trenutnaGodinaStudija, status,prosecnaOcena));
	}
	
	public void izbrisiStudenta(String id) {
		id=id.trim();
	for (Student s: BazaStudenta.getInstance().getStudenti()) {
		if (s.getBrojIndeksa().equals(id)) {
				for(Predmet p : s.getPredmeti()) {	
					for (Predmet predmet: BazaPredmeta.getInstance().getPredmeti()) {
						if (predmet.getSifraPredmeta().equals(p.getSifraPredmeta())) {
							predmet.izbrisiStudenta(s.getBrojIndeksa());	
						}
						
					}
					}
				studenti.remove(s);
				break;
		}
	}
	}
	
	
	public void izmeniStudenta(int selectedRow, String ime, String prezime, Date date1, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date date12, GodinaStudija trenutnaGodinaStudija, Status status,
			double prosecnaOcena) {
		int j=0;
		int i = 0;
		for(Student s : studenti) {
			if (i==selectedRow) {
				for (Student stud : studenti) {
					if(stud.getBrojIndeksa().equals(brojIndeksa)) {
						if(!stud.equals(s)) {
							JOptionPane.showMessageDialog(null, "Student sa indeksom: " + brojIndeksa + " vec postoji!");
							break;
						}
					}
					j++;
				}
				for (Predmet pred: BazaPredmeta.getInstance().getPredmeti()) {
					for (Student student : pred.getSpisakStudenata()) {
						if (student.getBrojIndeksa().equals(s.getBrojIndeksa())) {
							student.ime = ime;
							student.prezime = prezime;
							student.datumRodjenja = date1;
							student.adresaStanovanja = adresaStanovanja;
							student.kontaktTelefon = kontaktTelefon;
							student.emailAdresa = emailAdresa;
							student.brojIndeksa = brojIndeksa;
							student.datumUpisa = date12;
							student.trenutnaGodinaStudija = trenutnaGodinaStudija;
							student.status = status;
							student.prosecnaOcena = prosecnaOcena;
						}
					}
					
				}
		if(j==studenti.size()) {
				s.ime = ime;
				s.prezime = prezime;
				s.datumRodjenja = date1;
				s.adresaStanovanja = adresaStanovanja;
				s.kontaktTelefon = kontaktTelefon;
				s.emailAdresa = emailAdresa;
				s.brojIndeksa = brojIndeksa;
				s.datumUpisa = date12;
				s.trenutnaGodinaStudija = trenutnaGodinaStudija;
				s.status = status;
				s.prosecnaOcena = prosecnaOcena;
			}
			}
			i++;
		
		}
	}

	public void serijalizacijaStudenta() {
		try {
			FileOutputStream file = new FileOutputStream("studenti.dat");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(BazaStudenta.getInstance().getStudenti());
			
			out.close();
			file.close();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void deserijalizacijaStudenta() {
		try {
			FileInputStream file = new FileInputStream("studenti.dat");
			ObjectInputStream in= new ObjectInputStream(file);
			ArrayList<Student> studenti = (ArrayList<Student>) in.readObject();
			BazaStudenta.getInstance().setStudenti(studenti);
			StudentiController.getInstance().promeniIzgled();
			
			in.close();
			file.close();
		}catch (IOException ie) {
			ie.printStackTrace();
		}catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
	

}
