package Trabajopractico4;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
    public class OrdenamientoArreglos {

        public static void ejecutar() {
            // Parte 1: Comparación Bubble Sort vs Arrays.sort()
            System.out.println("=== PARTE 1: Comparación de Algoritmos ===\n");
            compararAlgoritmos();

            // Parte 2: Ordenamiento de Productos
            System.out.println("\n\n=== PARTE 2: Ordenamiento de Productos ===\n");
            demostrarOrdenamientoProductos();
        }

        private static void compararAlgoritmos() {
            int[] tamaños = {100, 1000, 10000};

            System.out.println("Tamaño\t\tBubble Sort\tArrays.sort()");
            System.out.println("-----------------------------------------------");

            for (int tamaño : tamaños) {
                int[] arr1 = generarArregloAleatorio(tamaño);
                int[] arr2 = arr1.clone();

                long inicioBubble = System.nanoTime();
                bubbleSort(arr1);
                long finBubble = System.nanoTime();
                long tiempoBubble = (finBubble - inicioBubble) / 1000000;

                long inicioArrays = System.nanoTime();
                Arrays.sort(arr2);
                long finArrays = System.nanoTime();
                long tiempoArrays = (finArrays - inicioArrays) / 1000000;

                System.out.printf("%d\t\t%d ms\t\t%d ms%n", tamaño, tiempoBubble, tiempoArrays);
            }

            System.out.println("\n--- Análisis ---");
            System.out.println("Bubble Sort: O(n²) - Lento para arreglos grandes");
            System.out.println("Arrays.sort(): O(n log n) - Mucho más eficiente");
        }

        private static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        private static int[] generarArregloAleatorio(int tamaño) {
            Random rand = new Random();
            int[] arr = new int[tamaño];
            for (int i = 0; i < tamaño; i++) {
                arr[i] = rand.nextInt(10000);
            }
            return arr;
        }

        private static void demostrarOrdenamientoProductos() {
            ArrayList<Producto> productos = new ArrayList<>();
            productos.add(new Producto("Laptop", 1200.50, 5));
            productos.add(new Producto("Mouse", 25.99, 50));
            productos.add(new Producto("Teclado", 75.00, 20));
            productos.add(new Producto("Monitor", 350.00, 10));
            productos.add(new Producto("Auriculares", 89.99, 30));

            System.out.println("--- Productos originales ---");
            mostrarProductos(productos);

            Collections.sort(productos);
            System.out.println("\n--- Ordenados por precio (Comparable) ---");
            mostrarProductos(productos);

            Collections.sort(productos, new ProductoComparatorPorNombre());
            System.out.println("\n--- Ordenados por nombre (Comparator) ---");
            mostrarProductos(productos);

            Collections.sort(productos, new ProductoComparatorPorStock());
            System.out.println("\n--- Ordenados por stock (Comparator) ---");
            mostrarProductos(productos);
        }

        private static void mostrarProductos(ArrayList<Producto> productos) {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }
}

