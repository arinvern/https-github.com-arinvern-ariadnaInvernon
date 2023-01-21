package ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Organitza {

	public static void organitzar(String directori) throws FileNotFoundException {

		File carpeta = new File(directori);

		List<String> llista = new ArrayList<String>();
		List<String> directoris = new ArrayList<String>();

		for (File f : carpeta.listFiles()) {
			if (f.isFile()) {
				llista.add(f.getName());
				System.out.println("(F) " + f.getPath());

			}
			if (f.isDirectory()) {
				System.out.println("(D) " + f.getPath());

				directoris.add(f.getPath());

			}
		}
		for (String directorio : directoris) {
			organitzar(directorio);
		}
		
		

	}

}