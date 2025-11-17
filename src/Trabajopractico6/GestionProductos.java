package Trabajopractico6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionProductos {

    public static void ejecutar() {
        System.out.println("Inicializando sistema de gestión de productos...\n");

        List<ProductoAlmacen> productos = new ArrayList<>();

        ProductoAlimenticio alimento1 = new ProductoAlimenticio(
                "Leche Entera 1L",
                150.0,
                LocalDate.now().plusDays(3),
                "Lácteos"
        );

        ProductoAlimenticio alimento2 = new ProductoAlimenticio(
                "Galletas de Chocolate",
                250.0,
                LocalDate.now().plusDays(45),
                "Galletitas"
        );

        ProductoElectronico electronico1 = new ProductoElectronico(
                "Notebook Lenovo",
                85000.0,
                "Lenovo",
                24
        );

        ProductoElectronico electronico2 = new ProductoElectronico(
                "Mouse Inalámbrico",
                3500.0,
                "Logitech",
                12
        );

        ProductoRopa ropa1 = new ProductoRopa(
                "Campera de Invierno",
                12000.0,
                "M",
                "Poliéster",
                "Invierno"
        );

        ProductoRopa ropa2 = new ProductoRopa(
                "Remera Básica",
                2500.0,
                "L",
                "Algodón",
                "Todo Uso"
        );

        productos.add(alimento1);
        productos.add(alimento2);
        productos.add(electronico1);
        productos.add(electronico2);
        productos.add(ropa1);
        productos.add(ropa2);

        System.out.println("=== CATÁLOGO DE PRODUCTOS ===\n");

        for (ProductoAlmacen producto : productos) {
            producto.mostrarDetalles();
            System.out.println();
        }

        System.out.println("=== VERIFICACIÓN DE PRODUCTOS ALIMENTICIOS ===");
        for (ProductoAlmacen producto : productos) {
            if (producto instanceof ProductoAlimenticio) {
                ProductoAlimenticio alimento = (ProductoAlimenticio) producto;
                if (alimento.estaPorVencer()) {
                    System.out.println("⚠️ " + alimento.getNombre() + " está próximo a vencer");
                }
            }
        }

        double totalInventario = 0;
        for (ProductoAlmacen producto : productos) {
            totalInventario += producto.calcularPrecio();
        }

        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total productos en inventario: " + productos.size());
        System.out.println("Valor total del inventario: $" + String.format("%.2f", totalInventario));
    }
}