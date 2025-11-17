package Trabajopractico6;

import java.time.LocalDate;

public class TareaDesarrollo extends Tarea {
    private String lenguajeProgramacion;
    private int lineasCodigo;

    public TareaDesarrollo(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
                           String responsable, String lenguajeProgramacion) {
        super(nombre, fechaInicio, fechaFin, responsable);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.lineasCodigo = 0;
    }

    public void registrarLineasCodigo(int lineas) {
        this.lineasCodigo += lineas;
    }

    @Override
    public String generarInforme() {
        StringBuilder informe = new StringBuilder();
        informe.append("=== TAREA DE DESARROLLO ===\n");
        informe.append("Nombre: ").append(nombre).append("\n");
        informe.append("Responsable: ").append(responsable).append("\n");
        informe.append("Lenguaje: ").append(lenguajeProgramacion).append("\n");
        informe.append("Líneas de código: ").append(lineasCodigo).append("\n");
        informe.append("Tiempo invertido: ").append(calcularTiempoInvertido()).append(" días\n");
        informe.append("Estado: ").append(completada ? "Completada" : "En progreso").append("\n");
        return informe.toString();
    }
}
