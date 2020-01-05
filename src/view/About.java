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
		
		String str = "Projekat su radili studenti Stefan Santraè RA135-2017 i Aleksa Santraè RA137-2017.\n" + 
				     "Aplikacija predstavlja model studentske službe.\n" +
				     "Predstavlja vezu imeðu studenata, profesora i predmeta. \n" +
				     "Projekat je radjen u eclipse-u na Javi programskom jeziku i predstavlja \n" +
				     "GUI aplikaciju rada studentske službe. \n" +
				     "Commitovi pre promene imena na gitu: User-Aleksa Santraè, Korisnik-Stefan Santraè. \n";
				     
				     
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
