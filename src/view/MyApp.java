package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.BazaPredmeta;

public class MyApp {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
		GlavniProzor gp = new GlavniProzor();
		try {
			FileOutputStream file = new FileOutputStream("predmeti.dat"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            
            out.writeObject(BazaPredmeta.getInstance());
            
            out.close();
            file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream("predmeti.dat"); 
            ObjectInputStream in = new ObjectInputStream(file);
            
            BazaPredmeta bp = (BazaPredmeta)in.readObject();
            in.close();
            file.close();
	} catch(IOException ex) { 
        System.out.println("IOException is caught"); 
    } catch(ClassNotFoundException ex) { 
        System.out.println("ClassNotFoundException is caught"); 
    } 
	}

}
