package ex05;



public class App {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Ariadna", "Invernón", 28);

		Serialitzar.serialitzar(persona1);
		Serialitzar.deserialitzar();

	}

}