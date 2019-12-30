package controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import model.BazaPredmeta;
import model.Predmet;

public class Serijalizacija {
	private static Serijalizacija instance = null;

	public static Serijalizacija getInstance() {
		if (instance == null) {
			instance = new Serijalizacija();
		}
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	private Serijalizacija() {
		
	
		try {
			//za pisanje
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("predmeti.dat")));
			oos.writeObject(BazaPredmeta.getInstance());
			
			
			//za brisanje
			 ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("predmeti.dat")));
			 Object obj = in.readObject(); 
			 BazaPredmeta.getInstance().setPredmeti((List<Predmet>) obj);
			 
			 oos.close();
			 in.close();
			
		} catch (IOException ex) {
	      ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
