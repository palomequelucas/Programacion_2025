package Trabajopractico2;

public class EjercicioReloj {

    public static void ejecutar() {
        System.out.println("\n=== Ejercicio 2: Reloj ===");

        Reloj reloj = new Reloj();
        reloj.establecerHora(23, 59, 58);
        reloj.mostrarHora();

        System.out.println("Avanzando segundos...");
        reloj.avanzarSegundo();
        reloj.mostrarHora();

        reloj.avanzarSegundo();
        reloj.mostrarHora();
    }
}