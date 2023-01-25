package ex01;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Organitza {

	
	
	public static void organitzar(String directori) {
		
		File carpeta = new File(directori);
		
		
		
		String[] llistaTemporal = carpeta.list();//agafa fitxers del directori i els pasa a Array de strings
		List<String> llista = new ArrayList<String>(); //llista
		
		
		for(String valor: llistaTemporal) {
			llista.add(valor);
		}
		
		if (llista== null || llista.size() == 0) {
		    System.out.println("No hi ha elements dins de la carpeta actual");
		    
		}
		else {
			
		Collections.sort(llista);
			
		    for (int i=0; i< llista.size(); i++) {
		        System.out.println(llista.get(i));
		    }
		}
	}
	
	
}
