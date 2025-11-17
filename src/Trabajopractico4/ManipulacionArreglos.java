package Trabajopractico4;


    import java.util.Scanner;

    public class ManipulacionArreglos {

        public static void ejecutar() {
            Scanner sc = new Scanner(System.in);

            System.out.print("¿Cuántos números desea ingresar? ");
            int cantidad = sc.nextInt();

            int[] arreglo = new int[cantidad];

            System.out.println("Ingrese " + cantidad + " números:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                arreglo[i] = sc.nextInt();
            }

            mostrarArreglo("Arreglo original", arreglo);

            int suma = calcularSuma(arreglo);
            System.out.println("\nSuma de elementos: " + suma);

            int mayor = encontrarMayor(arreglo);
            int menor = encontrarMenor(arreglo);
            System.out.println("Número mayor: " + mayor);
            System.out.println("Número menor: " + menor);

            int[] arregloInvertido = invertirArreglo(arreglo);
            mostrarArreglo("\nArreglo invertido", arregloInvertido);
        }

        private static int calcularSuma(int[] arreglo) {
            int suma = 0;
            for (int num : arreglo) {
                suma += num;
            }
            return suma;
        }

        private static int encontrarMayor(int[] arreglo) {
            int mayor = arreglo[0];
            for (int num : arreglo) {
                if (num > mayor) {
                    mayor = num;
                }
            }
            return mayor;
        }

        private static int encontrarMenor(int[] arreglo) {
            int menor = arreglo[0];
            for (int num : arreglo) {
                if (num < menor) {
                    menor = num;
                }
            }
            return menor;
        }

        private static int[] invertirArreglo(int[] arreglo) {
            int[] invertido = new int[arreglo.length];
            for (int i = 0; i < arreglo.length; i++) {
                invertido[i] = arreglo[arreglo.length - 1 - i];
            }
            return invertido;
        }

        private static void mostrarArreglo(String titulo, int[] arreglo) {
            System.out.println("\n" + titulo + ":");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }



