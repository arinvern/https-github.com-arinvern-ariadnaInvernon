package ex01;

public class InstrumentoPercusion extends Instrumento{
	
	public InstrumentoPercusion(String nombre, int precio) {
		super(nombre, precio);
		
	}

	@Override
	public void tocar() {

		System.out.println("Está sonando un instrumento de percusión");
		
	}

}
