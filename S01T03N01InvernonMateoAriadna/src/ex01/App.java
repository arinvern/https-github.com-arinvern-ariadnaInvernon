package ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class App {

	public static void main(String[] args) {

		ArrayList<Month> months = new ArrayList<Month>();

		Month Gener = new Month("Gener");
		Month Febrer = new Month("Febrer");
		Month Març = new Month("Març");
		Month Abril = new Month("Abril");
		Month Maig = new Month("Maig");
		Month Juny = new Month("Juny");
		Month Juliol = new Month("Juliol");
		Month Setembre = new Month("Setembre");
		Month Octubre = new Month("Octubre");
		Month Novembre = new Month("Novembre");
		Month Desembre = new Month("Desembre");

		months.add(Gener);
		months.add(Febrer);
		months.add(Març);
		months.add(Abril);
		months.add(Maig);
		months.add(Juny);
		months.add(Juliol);
		months.add(Setembre);
		months.add(Octubre);
		months.add(Novembre);
		months.add(Desembre);

		System.out.println("llista mesos sense agost");
		printBucle(months);

		Month Agost = new Month("Agost");
		months.add(7, Agost);

		Iterator<Month> it = months.iterator();

		System.out.println("\n" + "Llista amb agost");
		while (it.hasNext()) { // llista recorreguda amb iterador, agost afegit en ordre correcte
			System.out.println(it.next());
		}

		months.add(Desembre);// mesos repetit

		months.add(Gener);

		months.add(Abril);

		System.out.println("\n" + "Llista amb duplicats");
		printBucle(months);

		LinkedHashSet<Month> lhs = new LinkedHashSet<Month>();
		lhs.addAll(months);// es carrega linkedHashSet mb valors de la llista
		months.clear();// es buida la llista
		months.addAll(lhs);// s'afegeix linkedHashSet a la llista, sense repetits i ordenada.
		
		System.out.println("\nllista sense duplicats i en ordre");
		printBucle(months);
		
		 HashSet<Month> hs = new HashSet<Month>(); 
		 hs.addAll(months);
		 months.clear();
		 months.addAll(hs);

		 System.out.println("\nllista sense duplicats desordenada");
		 printBucle(months);//amb hashSet en lloc de linkedHashSet no manté l'ordre.
	}

	public static void printBucle(ArrayList<Month> months) {
		for (int i = 0; i < months.size(); i++) { // llista recorreguda amb bucle for

			System.out.println(months.get(i));

		}
	}

}
