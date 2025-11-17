package Trabajopractico6;

public class ProductoElectronico extends ProductoAlmacen {
    private int mesesGarantia;
    private String marca;

    public ProductoElectronico(String nombre, double precio, String marca, int mesesGarantia) {
        super(nombre, precio);
        this.marca = marca;
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecio() {
        if (mesesGarantia >= 24) {
            return precio * 1.1;
        }
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PRODUCTO ELECTRÓNICO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: $" + calcularPrecio());
        System.out.println("Garantía: " + mesesGarantia + " meses");

        if (mesesGarantia >= 24) {
            System.out.println("✓ Garantía extendida (+10% en precio)");
        }
    }
}