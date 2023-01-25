package ex05;

import java.io.Serializable;

public class Persona implements Serializable {

	private String nom;
	private String cognom;
	private int edat;

	public Persona(String nom, String cognom, int edat) {

		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getEdat() {
		return edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}

}
