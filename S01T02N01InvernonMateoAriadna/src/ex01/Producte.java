package ex01;

public class Producte {
	
	private String nom;
	private double preu;
	
	public Producte(String nom, double preu) {

		this.nom = nom;
		this.preu = preu;

	}

	public String getNom() {
		return nom;
	}

	

	public double getPreu() {
		return preu;
	}


	@Override
	public String toString() {
		return "Producte [nom=" + nom + ", preu=" + preu + "]";
	}

	
}
