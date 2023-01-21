package ex01;

public class App {

	public static void main(String[] args) {
	
		Treballador treballador1 = new Treballador ("Ariadna", "Invernon", 45);
		TreballadorPresencial treballador2 = new TreballadorPresencial ("Eustaquio", "García", 45, 60);
		TreballadorOnline treballador3 = new TreballadorOnline ("Pepa", "Sánchez", 45);
		
		
		//objecte de la classe treballador utilitza el métode de la classe pare sense sobreescriure
		System.out.println(treballador1.calcularSou(40));
		
		//treballadors presencials i treballadors online utilitzen el métode sobreescrit a cadascuna de les clases filés com indica l'override
		System.out.println(treballador2.calcularSou(40));
		System.out.println(treballador3.calcularSou(40));

		//amb mateix sou per hora i mateixes hores treballades el resultat es diferent perquè els métodes sobreescrits són diferents.
		
		
		//el que fa @override es forçar al compilador a comprovar en temps de compilació que el métode es sobreescriu correctament.
	}

}
