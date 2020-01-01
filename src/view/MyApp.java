package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.BazaPredmeta;
import model.Predmet;

public class MyApp {

	public static void main(String[] args) {	

//	MyApp myapp = new MyApp();
//		
//	ArrayList<Predmet>predmetiList = myapp.readObject();
//	BazaPredmeta.getInstance().setPredmeti(predmetiList);
		
	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	
		GlavniProzor gp = new GlavniProzor();
		
//		myapp.writeObject(BazaPredmeta.getInstance().getPredmeti());
	}
	
	
	
//	public void writeObject(List<Predmet> list) {
//		try {
//			FileOutputStream file = new FileOutputStream("predmeti.dat"); 
//            ObjectOutputStream out = new ObjectOutputStream(file); 
//            out.writeObject(list);
//            
//            out.close();
//            file.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@SuppressWarnings("unchecked")
//	public ArrayList<Predmet> readObject() {
//		ArrayList<Predmet>predmeti = new ArrayList<Predmet>();
//		
//		try
//        {    
//            // Reading the object from a file 
//            FileInputStream file = new FileInputStream("predmeti.dat"); 
//            ObjectInputStream in = new ObjectInputStream(file);
//            
//            
//            predmeti = (ArrayList<Predmet>) in.readObject();
//            
//            in.close();
//            file.close();
//        } 
//        catch (IOException ioe) 
//        {
//            ioe.printStackTrace();
//            
//        } 
//        catch (ClassNotFoundException c) 
//        {
//            System.out.println("Class not found");
//            c.printStackTrace();
//            
//        }
//		
//		return predmeti;
//	}
	
		

}
