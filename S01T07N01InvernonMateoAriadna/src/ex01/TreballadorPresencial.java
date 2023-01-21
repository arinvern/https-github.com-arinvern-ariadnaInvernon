package ex01;

public class TreballadorPresencial extends Treballador {

	private double benzina;

	public TreballadorPresencial(String nom, String cognom, double preuHora, double benzina) {
		super(nom, cognom, preuHora);
		this.benzina = benzina;

	}

	@Override
	public double calcularSou(double hores) {

		double sou = (hores * preuHora) + benzina;

		return sou;

	}

}
