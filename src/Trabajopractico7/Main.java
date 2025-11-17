vpackage Trabajopractico7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== TRABAJO PRÁCTICO 7 =====");
            System.out.println("Manejo de Excepciones");
            System.out.println("1. Validador de Contraseña");
            System.out.println("2. Gestor de Calificaciones");
            System.out.println("3. Administrador de Reservas de Cine");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: ejecutarValidadorContrasena(); break;
                case 2: ejecutarGestorCalificaciones(); break;
                case 3: ejecutarReservasCine(); break;
                case 0:
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        sc.close();
    }

    public static void ejecutarValidadorContrasena() {
        System.out.println("\n--- EJERCICIO 1: Validador de Contraseña ---");
        ValidadorContrasena.ejecutar();
    }

    public static void ejecutarGestorCalificaciones() {
        System.out.println("\n--- EJERCICIO 2: Gestor de Calificaciones ---");
        GestorCalificaciones.ejecutar();
    }

    public static void ejecutarReservasCine() {
        System.out.println("\n--- EJERCICIO 3: Reservas de Cine ---");
        ReservasCine.ejecutar();
    }
}