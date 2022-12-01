package ex01;

public class InstrumentoCuerda extends Instrumento {

	public InstrumentoCuerda(String nombre, int precio) {
		super(nombre, precio);

	}

	@Override
	public void tocar() {

		System.out.println("Está sonando un instrumento de cuerda");

	}

}
