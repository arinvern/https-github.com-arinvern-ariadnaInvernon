package entidades;

public class Flor extends Producto {
    private String color;

    public Flor(String nombre, double precio, int cantidad, String color) {
        super(nombre, precio, cantidad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color;
    }
}
