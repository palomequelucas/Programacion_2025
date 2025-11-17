package Trabajopractico6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== TRABAJO PRÁCTICO 6 =====");
            System.out.println("Clases Abstractas e Interfaces");
            System.out.println("1. Sistema de Dispositivos IoT");
            System.out.println("2. Gestión de Tareas Colaborativas");
            System.out.println("3. Sistema de Gestión de Productos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: ejecutarSistemaIoT(); break;
                case 2: ejecutarGestionTareas(); break;
                case 3: ejecutarGestionProductos(); break;
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

    public static void ejecutarSistemaIoT() {
        System.out.println("\n--- EJERCICIO 1: Sistema IoT ---");
        SistemaIoT.ejecutar();
    }

    public static void ejecutarGestionTareas() {
        System.out.println("\n--- EJERCICIO 2: Gestión de Tareas ---");
        GestionTareas.ejecutar();
    }

    public static void ejecutarGestionProductos() {
        System.out.println("\n--- EJERCICIO 3: Gestión de Productos ---");
        GestionProductos.ejecutar();
    }
}