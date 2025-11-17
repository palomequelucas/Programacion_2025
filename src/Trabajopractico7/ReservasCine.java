package Trabajopractico7;

import java.util.Scanner;

public class ReservasCine {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        // Crear sala de cine (5 filas x 6 asientos = 30 asientos total)
        SalaCine sala = new SalaCine("Sala Premium 1", 5, 6);

        boolean continuar = true;

        while (continuar) {
            sala.mostrarEstadoSala();

            System.out.println("1. Reservar asiento");
            System.out.println("2. Liberar asiento");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número de asiento (ej: A1, B3): ");
                        String asientoReservar = sc.nextLine().toUpperCase();
                        sala.reservarAsiento(asientoReservar);
                        break;

                    case 2:
                        System.out.print("Ingrese el número de asiento a liberar: ");
                        String asientoLiberar = sc.nextLine().toUpperCase();
                        sala.liberarAsiento(asientoLiberar);
                        break;

                    case 3:
                        continuar = false;
                        System.out.println("Gracias por usar el sistema de reservas");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }
            } catch (AsientoInvalidoException e) {
                System.out.println("✗ " + e.getMessage());
            } catch (AsientoOcupadoException e) {
                System.out.println("✗ " + e.getMessage());
            } catch (CapacidadExcedidaException e) {
                System.out.println("✗ " + e.getMessage());
            }

            if (continuar) {
                System.out.println("\nPresione Enter para continuar...");
                sc.nextLine();
            }
        }
    }
}