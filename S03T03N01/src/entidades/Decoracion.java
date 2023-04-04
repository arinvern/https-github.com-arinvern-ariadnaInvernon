package entidades;

public class Decoracion extends Producto {
    private String material;

    public Decoracion(String nombre, double precio, int cantidad, String material) {
        super(nombre, precio, cantidad);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", material: " + material;
    }
}