package Trabajopractico6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionTareas {

    public static void ejecutar() {
        System.out.println("Inicializando sistema de gestión de tareas...\n");

        List<Tarea> tareas = new ArrayList<>();

        TareaDesarrollo tarea1 = new TareaDesarrollo(
                "Implementar módulo de autenticación",
                LocalDate.of(2024, 11, 1),
                LocalDate.of(2024, 11, 15),
                "Juan Pérez",
                "Java"
        );
        tarea1.registrarLineasCodigo(450);
        tarea1.registrarLineasCodigo(320);
        tarea1.marcarCompletada();

        TareaDiseño tarea2 = new TareaDiseño(
                "Diseñar interfaz de usuario",
                LocalDate.of(2024, 11, 5),
                LocalDate.of(2024, 11, 20),
                "María González",
                "Figma"
        );
        tarea2.registrarIteracion();
        tarea2.registrarIteracion();
        tarea2.registrarIteracion();

        TareaTesting tarea3 = new TareaTesting(
                "Testing de integración",
                LocalDate.of(2024, 11, 10),
                LocalDate.of(2024, 11, 25),
                "Carlos Rodríguez"
        );
        tarea3.registrarCasoPrueba(true);
        tarea3.registrarCasoPrueba(true);
        tarea3.registrarCasoPrueba(false);
        tarea3.registrarCasoPrueba(true);
        tarea3.registrarCasoPrueba(true);

        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);

        System.out.println("=== INFORMES DE TAREAS ===\n");
        for (Tarea tarea : tareas) {
            System.out.println(tarea.generarInforme());
        }

        long tiempoTotal = 0;
        for (Tarea tarea : tareas) {
            tiempoTotal += tarea.calcularTiempoInvertido();
        }

        System.out.println("=== RESUMEN GENERAL ===");
        System.out.println("Total de tareas: " + tareas.size());
        System.out.println("Tiempo total invertido: " + tiempoTotal + " días");
    }
}