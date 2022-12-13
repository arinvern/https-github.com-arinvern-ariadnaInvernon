package ex01;

import java.util.ArrayList;

public class Venda {

	private ArrayList<Producte> llistaProductes;
	private double preuTotal = 0;

	public Venda() {

		llistaProductes = new ArrayList<Producte>();
		preuTotal = 0;

	}

	public ArrayList<Producte> getLlistaProductes() {
		return llistaProductes;
	}

	public double getPreuTotal() {
		return preuTotal;
	}


	public void calcularTotal() {

		double calculTotal = 0;

		try {

			for (int i = 0; i < llistaProductes.size(); i++) {

				calculTotal += llistaProductes.get(i).getPreu();
			}

			if (llistaProductes.isEmpty() || llistaProductes == null) {
				throw (new VendaBuidaException());//provoco error amb el throw, per llençar excepció
			}

		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());

		}

		preuTotal = calculTotal;
	}

	@Override
	public String toString() {
		return "Venda [llistaProductes=" + llistaProductes + ", preuTotal=" + preuTotal + "]";
	}

}
