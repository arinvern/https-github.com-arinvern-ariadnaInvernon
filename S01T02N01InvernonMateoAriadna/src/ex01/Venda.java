package ex01;

import java.util.ArrayList;

public class Venda {

	private ArrayList<Producte> llistaProductes;
	private double preuTotal = 0;

	public Venda() {

		llistaProductes = new ArrayList<Producte>();

	}

	public ArrayList<Producte> getLlistaProductes() {
		return llistaProductes;
	}

	public double getPreuTotal() {
		return preuTotal;
	}


	public void calcularTotal() {

		
		preuTotal = 0;
		try {

			for (int i = 0; i < llistaProductes.size(); i++) {

				preuTotal += llistaProductes.get(i).getPreu();
			}

			if (llistaProductes.isEmpty() || llistaProductes == null) {
				throw (new VendaBuidaException());//provoco error amb el throw, per llençar excepció
			}

		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());

		}

		
	}

	@Override
	public String toString() {
		return "Venda [llistaProductes=" + llistaProductes + ", preuTotal=" + preuTotal + "]";
	}

}
