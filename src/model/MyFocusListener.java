package model;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

import view.DodavanjePredmeta;

public class MyFocusListener implements FocusListener{

	@Override
	public void focusGained(FocusEvent arg0) {
		JTextField txt = (JTextField) arg0.getComponent();
		if (txt.getName().equals("textFieldSifra") || txt.getName().equals("textFieldNaziv")) {
			if (txt.getText().trim().equals("") ) {	
				DodavanjePredmeta.getInstance().btnPotvrda.setEnabled(false);
			} else {
				DodavanjePredmeta.getInstance().btnPotvrda.setEnabled(true);
			}
		}
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		JTextField txt = (JTextField) arg0.getComponent();
		
		if (txt.getName().equals("textFieldSifra") || txt.getName().equals("textFieldNaziv")) {
			if (txt.getText().trim().equals("") ) {	
				DodavanjePredmeta.getInstance().btnPotvrda.setEnabled(false);
			} else {
				DodavanjePredmeta.getInstance().btnPotvrda.setEnabled(true);
			}
		}
		
	}

}
