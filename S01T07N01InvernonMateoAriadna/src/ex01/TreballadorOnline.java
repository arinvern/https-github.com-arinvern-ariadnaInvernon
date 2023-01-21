package ex01;

public class TreballadorOnline extends Treballador {

	private final float tarifaInternet;

	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
		tarifaInternet = 25;

	}

	@Override
	public double calcularSou(double hores) {

		double sou = (hores * preuHora) + tarifaInternet;

		return sou;

	}

}
