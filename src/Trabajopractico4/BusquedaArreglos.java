package Trabajopractico4;
import java.util.Arrays;
import java.util.Scanner;

public class BusquedaArreglos {

    public static void ejecutar() {
        String[] palabras = {
                "algoritmo", "arreglo", "binario", "clase", "datos",
                "estructura", "función", "java", "método", "objeto",
                "ordenamiento", "programa", "recursión", "variable"
        };

        Arrays.sort(palabras);

        System.out.println("Arreglo de cadenas ordenado alfabéticamente:");
        mostrarArreglo(palabras);

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("\nIngrese una palabra para buscar (o 'salir' para terminar): ");
            String busqueda = sc.nextLine().toLowerCase();

            if (busqueda.equals("salir")) {
                continuar = false;
                continue;
            }

            int resultado = Arrays.binarySearch(palabras, busqueda);

            if (resultado >= 0) {
                System.out.println("✓ Palabra encontrada en la posición: " + resultado);
                System.out.println("  Contexto: ");
                mostrarContexto(palabras, resultado);
            } else {
                int puntoInsercion = -(resultado + 1);
                System.out.println("✗ Palabra NO encontrada");
                System.out.println("  Se insertaría en la posición: " + puntoInsercion);
            }
        }
    }

    private static void mostrarArreglo(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("[%2d] %s%n", i, arreglo[i]);
        }
    }

    private static void mostrarContexto(String[] arreglo, int posicion) {
        int inicio = Math.max(0, posicion - 2);
        int fin = Math.min(arreglo.length - 1, posicion + 2);

        for (int i = inicio; i <= fin; i++) {
            if (i == posicion) {
                System.out.println("  -> [" + i + "] " + arreglo[i] + " <--");
            } else {
                System.out.println("     [" + i + "] " + arreglo[i]);
            }
        }
    }
}