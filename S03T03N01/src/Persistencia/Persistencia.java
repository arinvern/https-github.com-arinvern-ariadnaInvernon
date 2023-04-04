package Persistencia;

import entidades.Floristeria;

import java.io.*;

public class Persistencia {
   
	private static final String fileName = "C:/Users/Mj/Desktop/floristeria.txt";

	
	public static Floristeria cargarFloristeria() {
		   Floristeria floristeria = null;
		    File file = new File(fileName);

		    if (!file.exists()) {
		        // Si el archivo no existe, se crea uno nuevo con la Floristeria vacía.
		        try {
		            file.createNewFile();
		            guardarFloristeria(new Floristeria("floristeria"));
		        } catch (IOException e) {
		            System.out.println("Error al crear el archivo.");
		            e.printStackTrace();
		        }
		    }

		    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
		        floristeria = (Floristeria) ois.readObject();
		    } catch (IOException | ClassNotFoundException e) {
		        System.out.println("Error al cargar la floristeria desde el archivo.");
		        e.printStackTrace();
		    }
		    return floristeria;
		}

    public static void guardarFloristeria(Floristeria floristeria) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(floristeria);
            oos.close();
           
        } catch (IOException e) {
            System.out.println("Error al guardar la floristeria a l'arxiu.");
            e.printStackTrace();
        }
    }
}


