package Trabajopractico6;

import java.time.LocalDate;

public class TareaDiseño extends Tarea {
    private String herramientaDiseño;
    private int iteracionesRealizadas;

    public TareaDiseño(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
                       String responsable, String herramientaDiseño) {
        super(nombre, fechaInicio, fechaFin, responsable);
        this.herramientaDiseño = herramientaDiseño;
        this.iteracionesRealizadas = 0;
    }

    public void registrarIteracion() {
        this.iteracionesRealizadas++;
    }

    @Override
    public String generarInforme() {
        StringBuilder informe = new StringBuilder();
        informe.append("=== TAREA DE DISEÑO ===\n");
        informe.append("Nombre: ").append(nombre).append("\n");
        informe.append("Responsable: ").append(responsable).append("\n");
        informe.append("Herramienta: ").append(herramientaDiseño).append("\n");
        informe.append("Iteraciones: ").append(iteracionesRealizadas).append("\n");
        informe.append("Tiempo invertido: ").append(calcularTiempoInvertido()).append(" días\n");
        informe.append("Estado: ").append(completada ? "Completada" : "En progreso").append("\n");
        return informe.toString();
    }
}