package Trabajopractico2;

import java.util.Scanner;

public class AppCalculadora {
    private final Calculadora calculadora;
    private final Scanner scanner;

    public AppCalculadora() {
        this.calculadora = new Calculadora();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("===== CALCULADORA =====");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double a = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double b = scanner.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            try {
                switch (opcion) {
                    case 1 -> resultado = calculadora.sumar(a, b);
                    case 2 -> resultado = calculadora.restar(a, b);
                    case 3 -> resultado = calculadora.multiplicar(a, b);
                    case 4 -> resultado = calculadora.dividir(a, b);
                    default -> {
                        System.out.println("Opción no válida.");
                        operacionValida = false;
                    }
                }

                if (operacionValida) {
                    System.out.println("Resultado: " + resultado);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
