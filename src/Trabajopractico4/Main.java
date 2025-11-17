package Trabajopractico4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione el ejercicio que desea ejecutar:");
            System.out.println("1. Manipulación de Arreglos (Suma, Mayor, Menor, Invertir)");
            System.out.println("2. Ordenamiento y Comparación (Bubble vs Arrays.sort, Objetos)");
            System.out.println("3. Búsqueda Binaria (Palabras)");
            System.out.println("4. Salir");
            System.out.print(">> Opción: ");

            // Validación básica de entrada para evitar errores si meten letras
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                // Consumir el salto de línea sobrante
                sc.nextLine();
            } else {
                System.out.println("Error: Por favor ingrese un número válido.");
                sc.next(); // Limpiar la entrada incorrecta
                continue;
            }

            System.out.println("\n--------------------------------------------------");

            switch (opcion) {
                case 1:
                    // Llama al método estático de la clase correspondiente
                    ManipulacionArreglos.ejecutar();
                    break;

                case 2:
                    OrdenamientoArreglos.ejecutar();
                    break;

                case 3:
                    BusquedaArreglos.ejecutar();
                    break;

                case 4:
                    System.out.println("Finalizando el programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("⚠ Opción no válida. Intente nuevamente.");
            }

            if (continuar) {
                System.out.println("--------------------------------------------------");
                System.out.println("Presione ENTER para volver al menú principal...");
                sc.nextLine(); // Pausa para que el usuario pueda leer los resultados
            }
        }

        sc.close();
    }
}