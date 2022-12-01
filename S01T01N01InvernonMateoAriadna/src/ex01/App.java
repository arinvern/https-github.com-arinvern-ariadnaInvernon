package ex01;

public class App {

	public static void main(String[] args) {
		
		int prueba = Instrumento.pruebaEstatica; 
		//se ha podido cargar la clase accediendo a variable estática sin tener que instanciar un objeto de la clase.
		System.out.println(prueba);
		//por consola sale el bloque de inicialización estático que aparece una única vez.
		

		InstrumentoCuerda guitarra = new InstrumentoCuerda("guitarra", 250);
		InstrumentoViento flauta = new InstrumentoViento("flauta", 10);
		InstrumentoPercusion tambor = new InstrumentoPercusion("tambor", 100);

		
		guitarra.tocar();
		flauta.tocar();
		tambor.tocar();

	}

}
