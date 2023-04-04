
package entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private LocalDateTime fecha;
    private ArrayList<Producto> productos;
    private double total;

    public Ticket(int id, ArrayList<Producto> productos) {
        this.id = id;
        this.fecha = LocalDateTime.now();
        this.productos = productos;
        this.total = calcularTotal(productos);
    }

    private double calcularTotal(ArrayList<Producto> productos) {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", data=" + fecha + ", productes=" + productos + ", total=" + total + "]";
	}


    
    
}