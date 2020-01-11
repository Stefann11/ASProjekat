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
public class About extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7754918383926484094L;
	
	public About() {
		setTitle("About");
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
		
		add(panelZaDugmice, BorderLayout.SOUTH);
		
		String str = "Kratak opis aplikacije i biografije autora. \n" +
					 "Verzija projekta: 1.0 \n\n" + 
				     "Aplikacija predstavlja model studentske slu�be.\n" +
				     "Predstavlja vezu ime�u studenata, profesora i predmeta. \n" +
				     "Sadr�i informacije o njima kao i opcije za rukovanje (vi�e o ovome u Help-u). \n" +
				     "Projekat je radjen u eclipse-u na Javi programskom jeziku i predstavlja \n" +
				     "GUI aplikaciju rada studentske slu�be. \n" +
				     "Projekat su radili studenti Aleksa Santra� RA137-2017 (Student #1) i Stefan Santra� RA135-2017 (Student #2).\n" +
				     "Commitovi pre promene imena na gitu: User-Aleksa Santra�, Korisnik-Stefan Santra�. \n\n\n" +
					 "Biografija: \n" +
				     "Aleksa i Stefan Santra� su blizanci rodjeni u Novom Sadu 05/08/1998. \n" +
				     "Obojica posle zavr�ene Gimnazije '20.Oktobar' u Ba�koj Palanci, upisuju Fakultet tehni�kih nauka.\n" +
				     "Gde trenutno poha�aju tre�u godinu studija na smeru Ra�unarstvo i automatika. \n" 
				     ;
						
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
