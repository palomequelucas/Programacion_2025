package Trabajopractico6;

public abstract class ProductoAlmacen {
    protected String nombre;
    protected double precio;

    public ProductoAlmacen(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularPrecio();

    public abstract void mostrarDetalles();

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
