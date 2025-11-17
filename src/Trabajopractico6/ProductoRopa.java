package Trabajopractico6;

public class ProductoRopa extends ProductoAlmacen {
    private String talle;
    private String material;
    private String temporada;

    public ProductoRopa(String nombre, double precio, String talle, String material, String temporada) {
        super(nombre, precio);
        this.talle = talle;
        this.material = material;
        this.temporada = temporada;
    }

    @Override
    public double calcularPrecio() {
        if (temporada.equalsIgnoreCase("Invierno") || temporada.equalsIgnoreCase("Verano")) {
            return precio * 1.05;
        }
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PRODUCTO ROPA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Talle: " + talle);
        System.out.println("Material: " + material);
        System.out.println("Temporada: " + temporada);
        System.out.println("Precio: $" + calcularPrecio());
    }
}
