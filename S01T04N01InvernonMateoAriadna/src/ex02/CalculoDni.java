package ex02;

import java.util.ArrayList;

public class CalculoDni {

	public static char calculDni(String dni) {

		String lletresString = "TRWAGMYFPDXBNJZSQVHLCKE";
		ArrayList<Character> llistaLletres = new ArrayList<Character>();

		String numDni = dni.substring(0, dni.length() - 1);

		int numerosDni = Integer.parseInt(numDni);

		int restoDni = numerosDni % 23;

		char lletraDni = lletresString.charAt(restoDni);

		return lletraDni;
	}

}
