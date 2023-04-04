package entidades;

import java.io.Serializable;

public class Arbol extends Producto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double altura;

	public Arbol(String nombre, double precio, int cantidad, double altura) {
		super(nombre, precio, cantidad);
		this.altura = altura;
	}
	
	public Arbol() {
        
    }

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return super.toString() + ", altura: " + altura;
	}
}