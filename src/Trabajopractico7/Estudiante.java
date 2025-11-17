package Trabajopractico7;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Double> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(double calificacion) throws CalificacionInvalidaException {
        validarCalificacion(calificacion);
        calificaciones.add(calificacion);
        System.out.println("✓ Calificación " + calificacion + " agregada correctamente");
    }

    private void validarCalificacion(double calificacion) throws CalificacionInvalidaException {
        if (calificacion < 0 || calificacion > 10) {
            throw new CalificacionInvalidaException(
                    "Valor inválido: " + calificacion + ". La calificación debe estar entre 0 y 10"
            );
        }
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }

        double suma = 0;
        for (double calif : calificaciones) {
            suma += calif;
        }
        return suma / calificaciones.size();
    }

    public void mostrarCalificaciones() {
        System.out.println("\n--- Calificaciones de " + nombre + " ---");
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas");
        } else {
            for (int i = 0; i < calificaciones.size(); i++) {
                System.out.println("Calificación " + (i + 1) + ": " + calificaciones.get(i));
            }
            System.out.printf("Promedio: %.2f%n", calcularPromedio());
        }
    }

    public String getNombre() {
        return nombre;
    }
}