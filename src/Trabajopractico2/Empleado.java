package Trabajopractico2;

public class Empleado {
    private static int contadorLegajos = 1000;
    private static int cantidadTotal = 0;

    // Atributos de instancia (propios de cada empleado)
    private int legajo;
    private String nombre;
    private double salario;

    // Constructor
    public Empleado(String nombre, double salarioInicial) {
        this.nombre = nombre;
        this.salario = salarioInicial;

        // Asignamos un legajo único y aumentamos los contadores
        this.legajo = contadorLegajos;
        contadorLegajos++;
        cantidadTotal++;
    }

    // --- Métodos de Lógica ---

    /**
     * Aumentar salario por PORCENTAJE.
     */
    public void aumentarSalario(double porcentaje, String motivo) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
        // Aquí podríamos guardar el motivo en un historial si fuera necesario
    }

    /**
     * Aumentar salario por MONTO FIJO.
     */
    public void aumentarSalario(int montoFijo, String motivo) {
        this.salario += montoFijo;
    }

    public static int getCantidadTotalEmpleados() {
        return cantidadTotal;
    }

    public String obtenerDetalles() {
        return "Legajo: " + legajo + " | Nombre: " + nombre + " | Salario: $" + salario;
    }

    public String getNombre() {
        return nombre;
    }
}
