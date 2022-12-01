package ex02;

public class Coche {

	private static String modelo;
	private static final String marca = "peugeot";
	private final int potencia = 120;

	// Variables finales se inicializan al declarar y no se modificaran.

	public Coche() {

		modelo = "2008 gasolina";

	}

	public static String getModelo() {

		return modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public static String getMarca() {
		return marca;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	// solo setter de modelo porque variables final no se pueden modificar una vez
	// declaradas.

	public static void frenar() {

		System.out.println("El vehiculo está frenando");

	}
	
	public void acelerar() {

		System.out.println("El vehiculo está acelerando");

	}

}
