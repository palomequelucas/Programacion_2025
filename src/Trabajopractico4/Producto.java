package Trabajopractico4;
public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }

    @Override
    public String toString() {
        return String.format("%-15s | $%-8.2f | Stock: %d", nombre, precio, stock);
    }
}