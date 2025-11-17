package Trabajopractico2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("===> TRABAJO PRÁCTICO 1 <===");
        //ejercicio calculadora
        AppCalculadora app = new AppCalculadora();
        app.iniciar();
        //ejercicio reloj
        EjercicioReloj.ejecutar();
        ejecutarEjercicioCuentaBancaria();
    }

    public static void ejecutarEjercicioCuentaBancaria() {
        Scanner sc = new Scanner(System.in); // Creamos el scanner para leer teclado

        System.out.println("--- CREACIÓN DE CUENTA BANCARIA ---");

        // 1. Pedir datos iniciales al usuario
        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String numero = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        // Creamos el objeto con los datos ingresados
        CuentaBancaria miCuenta = new CuentaBancaria(numero, titular, saldoInicial);
        System.out.println("¡Cuenta creada exitosamente!");

        // 2. Menú interactivo
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual de " + miCuenta.getTitular() + " es: $" + miCuenta.consultarSaldo());
                    break;

                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = sc.nextDouble();
                    miCuenta.depositar(deposito);
                    System.out.println("Depósito realizado. Nuevo saldo: $" + miCuenta.consultarSaldo());
                    break;

                case 3:
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = sc.nextDouble();
                    boolean exito = miCuenta.retirar(retiro);

                    if (exito) {
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + miCuenta.consultarSaldo());
                    } else {
                        System.out.println("ERROR: Fondos insuficientes o monto inválido.");
                    }
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar nuestro sistema.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

    }
}