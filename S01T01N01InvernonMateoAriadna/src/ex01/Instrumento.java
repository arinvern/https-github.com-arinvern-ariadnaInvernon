package ex01;

import java.util.ArrayList;

public abstract class Instrumento {

	protected String nombre;
	protected float precio;
	protected static int pruebaEstatica;
	
	
	public Instrumento(String nombre, int precio) {

		this.nombre = nombre;
		this.precio = precio;
		pruebaEstatica=0;
		System.out.println("bloque de instancia de instrumentos");//aparecerá cada vez que instanciemos un instrumento porque no es bloque estático.

	}
	
	static {
		//Solo la primera vez que se instancia la clase. Bloque estático de codigo.
		System.out.println("Inicializacion estatico");
				
	}

	public abstract void tocar();

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
}
