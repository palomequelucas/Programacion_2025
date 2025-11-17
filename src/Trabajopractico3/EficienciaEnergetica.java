package Trabajopractico3;

public class EficienciaEnergetica {

    public static void ejecutar() {
        // TODO: Calcular ahorro de energía usando Math.sqrt()
        double reduccionConsumo = 400.0; // kWh reducidos
        double ahorroAnual = calcularAhorroAnual(reduccionConsumo);

        System.out.println("Reducción de consumo: " + reduccionConsumo + " kWh");
        System.out.println("Ahorro anual calculado: " + ahorroAnual + " kWh");

        // TODO: Determinar máximo y mínimo consumo entre electrodomésticos
        double[] consumos = {150.5, 200.3, 89.7, 320.1, 175.9};
        System.out.println("\nConsumos de electrodomésticos:");
        for (int i = 0; i < consumos.length; i++) {
            System.out.println("Electrodoméstico " + (i+1) + ": " + consumos[i] + " kWh");
        }

        double maximo = obtenerMaximoConsumo(consumos);
        double minimo = obtenerMinimoConsumo(consumos);

        System.out.println("\nMáximo consumo: " + maximo + " kWh");
        System.out.println("Mínimo consumo: " + minimo + " kWh");
    }

    private static double calcularAhorroAnual(double reduccion) {
        // TODO: Implementar cálculo usando Math.sqrt()
        // Ejemplo: ahorro = sqrt(reduccion) * factor
        return Math.sqrt(reduccion) * 12; // Placeholder
    }

    private static double obtenerMaximoConsumo(double[] consumos) {
        // TODO: Usar Math.max() o implementar búsqueda
        double max = consumos[0];
        for (double consumo : consumos) {
            max = Math.max(max, consumo);
        }
        return max;
    }

    private static double obtenerMinimoConsumo(double[] consumos) {
        // TODO: Usar Math.min() o implementar búsqueda
        double min = consumos[0];
        for (double consumo : consumos) {
            min = Math.min(min, consumo);
        }
        return min;
    }
}