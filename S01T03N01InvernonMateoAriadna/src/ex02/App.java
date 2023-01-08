package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {

		List<Integer> llista = new ArrayList<Integer>();

		llista.add(1);
		llista.add(2);
		llista.add(3);
		llista.add(4);
		llista.add(5);
		llista.add(6);

		List<Integer> llista2 = new ArrayList<Integer>();

		ListIterator<Integer> it = llista.listIterator(llista.size());//llista.size() es on comença l'iterador, com vull ordre invers començo pel final.

		while (it.hasPrevious()) {

			llista2.add(it.previous());

		}

		Iterator<Integer> iterador = llista2.iterator();

		while (iterador.hasNext()) {

			System.out.println(iterador.next());

			// listIterator té next i previous mentres que l'iterator només next

		}

	}
}
