package Trabajopractico6;

import java.time.LocalDate;

public class TareaTesting extends Tarea {
    private int casosProbadasExitosos;
    private int casosProbadosFallidos;

    public TareaTesting(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        super(nombre, fechaInicio, fechaFin, responsable);
        this.casosProbadasExitosos = 0;
        this.casosProbadosFallidos = 0;
    }

    public void registrarCasoPrueba(boolean exitoso) {
        if (exitoso) {
            casosProbadasExitosos++;
        } else {
            casosProbadosFallidos++;
        }
    }

    @Override
    public String generarInforme() {
        StringBuilder informe = new StringBuilder();
        int totalCasos = casosProbadasExitosos + casosProbadosFallidos;
        double porcentajeExito = totalCasos > 0 ? (casosProbadasExitosos * 100.0 / totalCasos) : 0;

        informe.append("=== TAREA DE TESTING ===\n");
        informe.append("Nombre: ").append(nombre).append("\n");
        informe.append("Responsable: ").append(responsable).append("\n");
        informe.append("Casos exitosos: ").append(casosProbadasExitosos).append("\n");
        informe.append("Casos fallidos: ").append(casosProbadosFallidos).append("\n");
        informe.append(String.format("Porcentaje de éxito: %.2f%%\n", porcentajeExito));
        informe.append("Tiempo invertido: ").append(calcularTiempoInvertido()).append(" días\n");
        informe.append("Estado: ").append(completada ? "Completada" : "En progreso").append("\n");
        return informe.toString();
    }
}