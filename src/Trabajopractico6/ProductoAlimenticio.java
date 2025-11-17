package Trabajopractico6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProductoAlimenticio extends ProductoAlmacen {
    private LocalDate fechaVencimiento;
    private String categoria;
    private int diasAlerta;

    public ProductoAlimenticio(String nombre, double precio, LocalDate fechaVencimiento,
                               String categoria) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.categoria = categoria;
        this.diasAlerta = 7;
    }

    @Override
    public double calcularPrecio() {
        if (estaPorVencer()) {
            return precio * 0.8;
        }
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PRODUCTO ALIMENTICIO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio original: $" + precio);
        System.out.println("Precio final: $" + calcularPrecio());
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);

        if (estaPorVencer()) {
            long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
            System.out.println("⚠️ ALERTA: Producto próximo a vencer (" + diasRestantes + " días)");
            System.out.println("   Descuento del 20% aplicado");
        }
    }

    public boolean estaPorVencer() {
        long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
        return diasRestantes >= 0 && diasRestantes <= diasAlerta;
    }
}