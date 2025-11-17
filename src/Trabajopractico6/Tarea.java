package Trabajopractico6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Tarea {
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected String responsable;
    protected boolean completada;

    public Tarea(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
        this.completada = false;
    }

    public long calcularTiempoInvertido() {
        LocalDate fechaCalculo = completada ? fechaFin : LocalDate.now();
        return ChronoUnit.DAYS.between(fechaInicio, fechaCalculo);
    }

    public abstract String generarInforme();

    public void marcarCompletada() {
        this.completada = true;
        this.fechaFin = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public boolean isCompletada() {
        return completada;
    }
}