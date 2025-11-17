package Trabajopractico7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GestorCalificaciones {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre);
        boolean continuar = true;

        System.out.println("\nSistema de Calificaciones - Ingrese las calificaciones (0-10)");
        System.out.println("Ingrese -1 para finalizar");

        while (continuar) {
            try {
                System.out.print("\nCalificación: ");
                double calificacion = sc.nextDouble();

                if (calificacion == -1) {
                    continuar = false;
                    continue;
                }

                estudiante.agregarCalificacion(calificacion);

            } catch (InputMismatchException e) {
                System.out.println("✗ Error: Debe ingresar un valor numérico");
                sc.nextLine(); // Limpiar buffer
            } catch (CalificacionInvalidaException e) {
                System.out.println("✗ " + e.getMessage());
            }
        }

        estudiante.mostrarCalificaciones();
    }
}
