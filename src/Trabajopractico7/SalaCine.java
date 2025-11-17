package Trabajopractico7;

import java.util.HashMap;
import java.util.Map;

public class SalaCine {
    private String nombre;
    private int capacidadTotal;
    private Map<String, Asiento> asientos;
    private int asientosOcupados;

    public SalaCine(String nombre, int filas, int asientosPorFila) {
        this.nombre = nombre;
        this.capacidadTotal = filas * asientosPorFila;
        this.asientos = new HashMap<>();
        this.asientosOcupados = 0;

        // Crear asientos (ejemplo: A1, A2, B1, B2, etc.)
        for (int fila = 0; fila < filas; fila++) {
            char letraFila = (char) ('A' + fila);
            for (int num = 1; num <= asientosPorFila; num++) {
                String numeroAsiento = letraFila + String.valueOf(num);
                asientos.put(numeroAsiento, new Asiento(numeroAsiento));
            }
        }
    }

    public void reservarAsiento(String numeroAsiento)
            throws AsientoInvalidoException, AsientoOcupadoException, CapacidadExcedidaException {

        // Validar capacidad
        if (asientosOcupados >= capacidadTotal) {
            throw new CapacidadExcedidaException();
        }

        // Validar que el asiento existe
        if (!asientos.containsKey(numeroAsiento.toUpperCase())) {
            throw new AsientoInvalidoException(
                    "El asiento " + numeroAsiento + " no existe en esta sala"
            );
        }

        // Intentar reservar
        Asiento asiento = asientos.get(numeroAsiento.toUpperCase());
        asiento.reservar();
        asientosOcupados++;

        System.out.println("✓ Asiento " + numeroAsiento + " reservado exitosamente");
    }

    public void liberarAsiento(String numeroAsiento) throws AsientoInvalidoException {
        if (!asientos.containsKey(numeroAsiento.toUpperCase())) {
            throw new AsientoInvalidoException(
                    "El asiento " + numeroAsiento + " no existe en esta sala"
            );
        }

        Asiento asiento = asientos.get(numeroAsiento.toUpperCase());
        if (!asiento.isOcupado()) {
            System.out.println("El asiento " + numeroAsiento + " ya estaba libre");
        } else {
            asiento.liberar();
            asientosOcupados--;
            System.out.println("✓ Asiento " + numeroAsiento + " liberado");
        }
    }

    public void mostrarEstadoSala() {
        System.out.println("\n=== SALA: " + nombre + " ===");
        System.out.println("Capacidad: " + capacidadTotal + " asientos");
        System.out.println("Ocupados: " + asientosOcupados);
        System.out.println("Disponibles: " + (capacidadTotal - asientosOcupados));
        System.out.println("\nMapa de asientos ([ ] = Libre, [X] = Ocupado):");
        System.out.println("PANTALLA");
        System.out.println("─────────────────────────");

        char filaActual = 'A';
        System.out.print(filaActual + " │ ");

        for (Map.Entry<String, Asiento> entry : asientos.entrySet()) {
            String numero = entry.getKey();
            Asiento asiento = entry.getValue();

            if (numero.charAt(0) != filaActual) {
                filaActual = numero.charAt(0);
                System.out.println();
                System.out.print(filaActual + " │ ");
            }

            System.out.print(asiento.isOcupado() ? "[X] " : "[ ] ");
        }
        System.out.println("\n");
    }

    public int getAsientosDisponibles() {
        return capacidadTotal - asientosOcupados;
    }
}