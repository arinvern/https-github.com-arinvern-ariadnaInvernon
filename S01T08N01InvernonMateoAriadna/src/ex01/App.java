package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		String text = "A partir d’una llista de Strings, escriu "
				+ "un mètode que retorna una llista de totes les cadenes que contenen la lletra o";
		
		ArrayList<String> llistaO = retornaO(text);
		
		for (String cadena : llistaO) {
			System.out.println(cadena);
		}

	}

	private static ArrayList<String> retornaO(String text) {
		List<String> llistaStrings = new ArrayList<String>();

		String[] parts = text.split("\\ ");

		llistaStrings = Arrays.asList(parts);

		ArrayList<String> llistaLletraO = new ArrayList<String>();

		llistaStrings.stream().filter(strings -> strings.contains("o")).forEach(llistaLletraO::add);

		return llistaLletraO;

	}

}
