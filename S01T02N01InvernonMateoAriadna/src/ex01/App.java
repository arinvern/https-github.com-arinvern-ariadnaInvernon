package ex01;

import java.util.InputMismatchException;

public class App {

	public static void main(String[] args) {
		
		Venda venda1 = new Venda ();
		venda1.calcularTotal();//llista de productes está buida i surt el missatge de l'excepció.
			
		
			
		Producte producte1 = new Producte ("llet",0.79);
		Producte producte2 = new Producte ("pollastre",3.5);
		Producte producte3 = new Producte ("caviar",50);
		
		venda1.getLlistaProductes().add(producte1);
		venda1.getLlistaProductes().add(producte2);
		venda1.getLlistaProductes().add(producte3);
		
		venda1.calcularTotal();
		
			
		for(int i=0; i< venda1.getLlistaProductes().size();i++) {
			System.out.print("\nNom producte: ");
			System.out.print(venda1.getLlistaProductes().get(i).getNom());
			System.out.print(" - Preu: ");
			System.out.print(venda1.getLlistaProductes().get(i).getPreu()+ "\n");
			
		}
		
		
		System.out.println("\nPreu total: ");
		System.out.println(venda1.getPreuTotal());
			
		try{
			venda1.getLlistaProductes().get(5);//aquesta linia dona ArrayIndexOutOfBoundsException
		}catch (IndexOutOfBoundsException e) {
		      System.out.println(e.getMessage());
	    }
		

	}
}