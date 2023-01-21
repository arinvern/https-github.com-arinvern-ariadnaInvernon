package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		String text = "A partir d’una llista de Strings, escriu "
				+ "un mètode que retorna una llista de totes les cadenes que contenen la lletra o";
		
		List<String> llistaO = retornaMenysDeCincIO(text);
		
		for (String cadena : llistaO) {
			System.out.println(cadena);
		}

	}

	private static List<String> retornaMenysDeCincIO(String text) {
		List<String> llistaStrings = new ArrayList<String>();

		String[] parts = text.split("\\ ");

		llistaStrings = Arrays.asList(parts);

		List<String> llistaLletraO = new ArrayList<String>();

		llistaStrings.stream().filter(strings -> strings.contains("o")).forEach(llistaLletraO::add);
		
		List<String> llistaLletraOiMenysDeCinc = new ArrayList<String>();
		
		llistaLletraO.stream().filter(strings2 -> strings2.length() > 5).forEach(llistaLletraOiMenysDeCinc::add);

		return llistaLletraOiMenysDeCinc;

	}

}
