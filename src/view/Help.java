/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Aleksa Santrac
 *
 */
public class Help extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4091180897492088549L;
	

	public Help(){
		
		//setModal(false);
		setTitle("Help");
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight/2 );
        setLocationRelativeTo(null);
		setVisible(true);
		JTextArea tekst =new JTextArea();
		Font font = new Font("Ariel", Font.BOLD, 17);
		tekst.setFont(font);
		
		//JPanel panelCentar = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panelZaDugmice = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnIzlazak = new JButton("Izlazak");
		
		panelZaDugmice.add(btnIzlazak);
		//panelCentar.add(tekst);
		
		add(panelZaDugmice, BorderLayout.SOUTH);
		//add(panelCentar, BorderLayout.CENTER);
		
		String str = "Aplikacija predstavlja model studentske službe.\n" + 
					 "Podelili smo projekat na 3 paketa ( MVC- model, view, controller).\n" +
					 "Na vrhu glavnog prozora se nalazi menubar, dok na samom dnu statusbar.\n" +
					 "Postoje tri razlièita taba, koji predstavljaju studente, profesore i predmete.\n" + 
					 "Svaki ima svoje posebne funkcionalnosti.\n\n\n" +
					 
					 "ZA STUDENTA:\n" +
					 
					 "Odabirom prvog taba otvara se tabela studenata.\n" + 
					 "Pritiskom prvog dugmeta u toolbaru otvara se dialog za dodavanje novog studenta.\n" + 
					 "Pritiskom na drugo dugme vrši se izmena SELEKTOVANOG studenta.\n" +
					 "Odabirom treæeg dugmeta vrši se brisanje SELEKTOVANOG studenta.\n" +
					 "Unosenjem teksta u tekstualno polje u toolbaru u vidu: \n" +
					 "indeks:Xxxxx;ime:Xxxxx;prezime:Xxxxx;datum roðenja:xx/xx/xxxx;kontakt telefon:Xxxxx;email adresa:Xxxxx;datum upisa:Xxxxx;godina studija:Xxxxx;status:Xxxxx;prosek:Xxxxx\n" +
					 "I potom pritiskom na poslednje dugme u toolbaru vrši se pretraga studenata po zadatim obeležjima .\n" +
					 "Klikom na naziv kolone vrši se sortiranje tabele u opadajuæem/rastuæem redosledu.\n" +
					 "Klikom na dugme u koloni 'Predmeti' se otvara spisak predmeta koje selektovani student sluša.\n" +
					 "Klikom miša na polja menubara može se pristupiti istim ovim funkcionalnostima, kao i nekim drugim (help i about).\n" +
					 "Pritiskom tastera na tastaturi CTRL+N - otvara se dijalog za dodavanje novog studenta.\n" +
					 "Pritiskom tastera na tastaturi CTRL+E - otvara se dijalog za izmenu selektovanog studenta.\n" +
					 "Pritiskom tastera na tastaturi CTRL+D - brisanje selektovanog studenta.\n" +
					 "Pritiskom tastera na tastaturi CTRL+Q - izlazak iz programa.\n" +
					 "Pritiskom tastera na tastaturi CTRL+H - help.\n" +
					 "Pritiskom tastera na tastaturi CTRL+A - about.\n\n\n" +
					 
					 "ZA PROFESORA:\n" +
					 
					 "Odabirom drugog taba otvara se tabela predmeta.\n" + 
					 "Pritiskom prvog dugmeta u toolbaru otvara se dialog za dodavanje novog profesora.\n" + 
					 "Pritiskom na drugo dugme vrši se izmena SELEKTOVANOG profesora.\n" +
					 "Odabirom treæeg dugmeta vrši se brisanje SELEKTOVANOG profesora.\n" +
					 "Unosenjem teksta u tekstualno polje u toolbaru u vidu: \n" +
					 "ime:Xxxxx;prezime:Xxxxx;datum:Xxxxx;adresa stanovanja:Xxxxx;telefon:Xxxxx;email:Xxxxx;adresa kancelarije:Xxxxx;lièna karta:Xxxxx;titula:Xxxxx;zvanje:Xxxxx  \n" +
					 "I potom pritiskom na poslednje dugme u toolbaru vrši se pretraga profesora po zadatim obeležjima .\n" +
					 "Klikom na naziv kolone vrši se sortiranje tabele u opadajuæem/rastuæem redosledu.\n" +
					 "Klikom na dugme u koloni 'Predmeti' se otvara spisak predmeta koje selektovani profesor predaje.\n" +
					 "Klikom miša na polja menubara može se pristupiti istim ovim funkcionalnostima, kao i nekim drugim (help i about).\n" +
					 "Pritiskom tastera na tastaturi CTRL+N - otvara se dijalog za dodavanje novog profesora.\n" +
					 "Pritiskom tastera na tastaturi CTRL+E - otvara se dijalog za izmenu selektovanog profesora.\n" +
					 "Pritiskom tastera na tastaturi CTRL+D - brisanje selektovanog profesora.\n" +
					 "Pritiskom tastera na tastaturi CTRL+Q - izlazak iz programa.\n" +
					 "Pritiskom tastera na tastaturi CTRL+H - help.\n" +
					 "Pritiskom tastera na tastaturi CTRL+A - about.\n\n\n" +
					 
					 "ZA PREDMET:\n" +
					 
					 "Odabirom treæeg taba otvara se tabela predmeta.\n" + 
					 "Pritiskom prvog dugmeta u toolbaru otvara se dialog za dodavanje novog predmeta.\n" + 
					 "Pritiskom na drugo dugme vrši se izmena SELEKTOVANOG predmeta.\n" +
					 "Odabirom treæeg dugmeta vrši se brisanje SELEKTOVANOG predmeta.\n" +
					 "Odabirom èetvrtog dugmeta otvara se dijalog za dodavanje studenta na SELEKTOVANI predmet.\n" +
					 "Odabirom petog dugmeta otvara se dijalog za dodavanje profesora na SELEKTOVANI predmet.\n" +
					 "Odabirom šestog dugmeta vrši se brisanje profesora sa SELEKTOVANOG predmeta.\n" +
					 "Unosenjem teksta u tekstualno polje u toolbaru u vidu: \n" +
					  "šifra:Xxxxx;naziv:Xxxxx;semestar:Xxxxx;godina:Xxxxx;profesor:Xxxxx  \n" +
					 "I potom pritiskom na poslednje dugme u toolbaru vrši se pretraga predmeta po zadatim obeležjima .\n" +
					 "Klikom na naziv kolone vrši se sortiranje tabele u opadajuæem/rastuæem redosledu.\n" +
					 "Klikom na dugme u koloni 'Spisak studenata' se otvara dijalog koji sadrži spisak studenata koji slušaju selektovani predmet.\n" +
					 "U ovom dijalogu može da se vrši brisanje selektonog studenta sa predmeta.\n" +
					 "U koloni profesor se prikazuje ime i prezime predmetnog profesora ukoliko postoji.\n" +
					 "Klikom miša na polja menubara može se pristupiti istim ovim funkcionalnostima, kao i nekim drugim (help i about).\n" +
					 "Pritiskom tastera na tastaturi CTRL+N - otvara se dijalog za dodavanje novog predmeta.\n" +
					 "Pritiskom tastera na tastaturi CTRL+E - otvara se dijalog za izmenu selektovanog predmeta.\n" +
					 "Pritiskom tastera na tastaturi CTRL+D - brisanje selektovanog predmeta.\n" +
					 "Pritiskom tastera na tastaturi CTRL+Q - izlazak iz programa.\n" +
					 "Pritiskom tastera na tastaturi CTRL+H - help.\n" +
					 "Pritiskom tastera na tastaturi CTRL+A - about.\n\n\n";
						
		tekst.setText(str);
		JScrollPane scrollPane = new JScrollPane(tekst, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrollPane, BorderLayout.CENTER);
		
		btnIzlazak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
								
			}
		});
		
	}
}
