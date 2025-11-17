package Trabajopractico3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== TRABAJO PRÁCTICO 3 =====");
            System.out.println("1. Eficiencia Energética");
            System.out.println("2. Interés Compuesto");
            System.out.println("3. Procesamiento de Tweets");
            System.out.println("4. Validación de Contraseñas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejecutarEficienciaEnergetica();
                    break;
                case 2:
                    ejecutarInteresCompuesto();
                    break;
                case 3:
                    ejecutarProcesamientoTweets();
                    break;
                case 4:
                    ejecutarValidacionContrasenas();
                    break;
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

    public static void ejecutarEficienciaEnergetica() {
        System.out.println("\n--- EJERCICIO 1: Eficiencia Energética ---");
        EficienciaEnergetica.ejecutar();
    }

    public static void ejecutarInteresCompuesto() {
        System.out.println("\n--- EJERCICIO 2: Interés Compuesto ---");
        InteresCompuesto.ejecutar();
    }

    public static void ejecutarProcesamientoTweets() {
        System.out.println("\n--- EJERCICIO 3: Procesamiento de Tweets ---");
        ProcesamientoTweets.ejecutar();
    }

    public static void ejecutarValidacionContrasenas() {
        System.out.println("\n--- EJERCICIO 4: Validación de Contraseñas ---");
        ValidacionContrasenas.ejecutar();
    }
}