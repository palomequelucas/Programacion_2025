package Trabajopractico3;

public class InteresCompuesto {

    public static void ejecutar() {
        double capitalInicial = 10000.0;
        double tasaInteres = 0.06; // 6%
        int años = 5;

        System.out.println("Capital inicial: $" + capitalInicial);
        System.out.println("Tasa de interés anual: " + (tasaInteres * 100) + "%");
        System.out.println("Período: " + años + " años");
        System.out.println("\n--- Cálculo de Interés Compuesto ---");

        double valorFuturo = calcularValorFuturo(capitalInicial, tasaInteres, años);

        System.out.println("\nValor futuro (sin redondeo): $" + valorFuturo);
        System.out.println("Valor futuro (Math.round): $" + Math.round(valorFuturo));
        System.out.println("Valor futuro (Math.floor): $" + Math.floor(valorFuturo));
        System.out.println("Valor futuro (Math.ceil): $" + Math.ceil(valorFuturo));

        // TODO: Especificar comportamiento de la inversión
        System.out.println("\n--- Análisis del comportamiento ---");
        mostrarComportamientoInversion(capitalInicial, tasaInteres, años);
    }

    private static double calcularValorFuturo(double capital, double tasa, int años) {
        // Fórmula: VF = VP * (1 + r)^n
        return capital * Math.pow(1 + tasa, años);
    }

    private static void mostrarComportamientoInversion(double capital, double tasa, int años) {
        // TODO: Mostrar comportamiento año por año
        System.out.println("Año\tCapital");
        for (int i = 0; i <= años; i++) {
            double valor = capital * Math.pow(1 + tasa, i);
            System.out.printf("%d\t$%.2f%n", i, valor);
        }
    }
}