package ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialitzar {

	public static void deserialitzar() {
		Persona persona2 = null;
		try {
			FileInputStream fileIn = new FileInputStream("C:/Users/Ariadna/Desktop/persona.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			persona2 = (Persona) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}

		System.out.println("Persona deserialitzada...");
		System.out.println("Nom: " + persona2.getNom());
		System.out.println("Cognom: " + persona2.getCognom());
		System.out.println("Edat: " + persona2.getEdat());
	}

	public static void serialitzar(Persona persona1) {
		try {
			FileOutputStream fileOut = new FileOutputStream("C:/Users/Ariadna/Desktop/persona.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(persona1);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in C:/Users/Ariadna/Desktop/persona.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	
}
