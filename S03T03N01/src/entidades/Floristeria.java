package entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Floristeria implements Serializable {
    private String nombreFloristeria;
    private ArrayList<Arbol> stockArboles;
    private ArrayList<Flor> stockFlores;
    private ArrayList<Decoracion> stockDecoraciones;
    private ArrayList<Ticket> tickets = new ArrayList<>();


	 public Floristeria(String nombre) {
	        this.nombreFloristeria = nombre;
	        this.stockArboles = new ArrayList<Arbol>();
	        this.stockFlores = new ArrayList<Flor>();
	        this.stockDecoraciones = new ArrayList<Decoracion>();
	     }

		public ArrayList<Ticket> getTickets() {
			return tickets;
		}

    public void addArbol(Arbol arbol) {
        stockArboles.add(arbol);
    }

    public void addFlor(Flor flor) {
        stockFlores.add(flor);
    }

    public void addDecoracion(Decoracion decoracion) {
        stockDecoraciones.add(decoracion);
    }

    
    public void imprimirStock() {
        System.out.println("Stock de la floristería:");
        System.out.println("Arboles:");
        for (Arbol arbol : stockArboles) {
            System.out.println(arbol);
        }
        System.out.println("Flores:");
        for (Flor flor : stockFlores) {
            System.out.println(flor);
        }
        System.out.println("Decoraciones:");
        for (Decoracion decoracion : stockDecoraciones) {
            System.out.println(decoracion);
        }
    }
    
    public void imprimirCantidadStock() {
    	int totalArboles = 0;
    	 for (Arbol arbol : stockArboles) {
    		 totalArboles +=  arbol.cantidad;
         }
    	 int totalFlores = 0;
    	 for (Flor flor : stockFlores) {
    		 totalFlores +=  flor.cantidad;
         }
    	
    	 int totalDecoraciones = 0;
    	 for (Decoracion decoracion : stockDecoraciones) {
    		 totalDecoraciones +=  decoracion.cantidad;
         }
    	
    	
        System.out.println("Stock de la floristeria:");
        System.out.println("Arbres: " + totalArboles);
        System.out.println("Flors: " + totalFlores);
        System.out.println("Decoracions: " + totalDecoraciones);
       
    }

    public String getNombreFloristeria() {
		return nombreFloristeria;
	}

	public ArrayList<Arbol> getStockArboles() {
		return stockArboles;
	}

	public ArrayList<Flor> getStockFlores() {
		return stockFlores;
	}

	
	public ArrayList<Decoracion> getStockDecoraciones() {
		return stockDecoraciones;
	}

	
    public void retirarArbol(Arbol arbol, int canntidad) {
        stockArboles.remove(arbol);
    }

    public void retirarFlor(Flor flor, int canntidad) {
        stockFlores.remove(flor);
    }

    public void retirarDecoracion(Decoracion decoracion, int cantidad) {
        stockDecoraciones.remove(decoracion);
    }
    public void restarArbol(Arbol arbol, int cantidad) {
    	this.stockArboles.get(this.stockArboles.indexOf(arbol)).cantidad -= cantidad;
    }

    public void restarFlor(Flor flor, int cantidad) {
    	this.stockFlores.get(this.stockFlores.indexOf(flor)).cantidad -= cantidad;
    }

    public void restarDecoracion(Decoracion decoracion, int cantidad) {
    	this.stockDecoraciones.get(this.stockDecoraciones.indexOf(decoracion)).cantidad -= cantidad;
    }

    public void imprimirValorTotalStock() {
        double total = 0;
        for (Arbol arbol : stockArboles) {
            total += arbol.getPrecio() * arbol.cantidad;
        }
        for (Flor flor : stockFlores) {
            total += flor.getPrecio()* flor.cantidad;
        }
        for (Decoracion decoracion : stockDecoraciones) {
            total += decoracion.getPrecio() * decoracion.cantidad;
        }
        System.out.println("Valor total del stock: " + total + " euros");
    }
}