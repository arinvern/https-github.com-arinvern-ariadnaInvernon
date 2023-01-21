package ex06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class App {

	public static void main(String[] args) {

		List<Object> llista = new ArrayList<Object>();
		llista.add("Hola");
		llista.add(25);
		llista.add(0);
		llista.add("Llista");
		llista.add("cadena llarga");
		llista.add("abc");
		llista.add(450);
		llista.add(3000);
		llista.add(11111);

		List<String> strings = llista.stream()//per pasar llista d'objectes a llista de Strings
				   .map(object -> Objects.toString(object, null))
				   .toList();
			    
		
		 Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();//ordenar per longitud de la cadena de més petit a més gran
		    strings.stream().sorted(compByLength).forEach(System.out::println);
		  
	}

}
