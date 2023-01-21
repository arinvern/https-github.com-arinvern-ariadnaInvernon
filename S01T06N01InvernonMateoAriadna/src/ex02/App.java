package ex02;

public class App {

	public static <T> void main(String[] args) {
		
		
		Persona persona1 = new Persona("Ariadna", "Invernón", 28);
		Persona persona2 = new Persona("Benancia", "García", 87);
		
		GenericMethods <T> generic1 = new GenericMethods("Prova 1",22,persona1 );
		GenericMethods <T> generic2 = new GenericMethods(persona2, 105, "Prova 2" );
		System.out.println(generic1);
		System.out.println(generic2);
		
		
		
		
	}

}
