package ex02;

public class App {

	@SuppressWarnings("deprecation")
	// al ficar SupressWarnings desapareix l'advertencia al estar utilitzant un
	// mètode obsolet
	public static void main(String[] args) {

		TreballadorOnline treballador1 = new TreballadorOnline("Pepa", "Sánchez", 45);
		treballador1.obsolet();

		TreballadorPresencial treballador2 = new TreballadorPresencial("Pepe", "Fernández", 54, 0);
		System.out.println(treballador2.calcularSou(5));
	}
}
