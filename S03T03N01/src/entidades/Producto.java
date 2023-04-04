package entidades;

import java.io.Serializable;

public abstract class Producto implements Serializable {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
   public Producto() {
   
}

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void restarCantidad( int resta) {
        cantidad = cantidad-resta;
    }

    @Override
    public String toString() {
        return "Producte: " + nombre + ", preu: " + precio + "€, stock: " + cantidad;
    }
}