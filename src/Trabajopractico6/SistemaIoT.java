package Trabajopractico6;

public class SistemaIoT {

    public static void ejecutar() {
        System.out.println("Inicializando red de dispositivos IoT...\n");

        SensorTemperatura sensor = new SensorTemperatura("Sensor Sala Principal", 28.0);
        CamaraSeguridad camara = new CamaraSeguridad("Cámara Entrada", "1080p");
        AltavozInteligente altavoz = new AltavozInteligente("Alexa Cocina");

        System.out.println("=== SENSOR DE TEMPERATURA ===");
        sensor.encender();
        sensor.realizarAccionEspecifica();
        sensor.realizarAccionEspecifica();
        sensor.apagar();

        System.out.println("\n=== CÁMARA DE SEGURIDAD ===");
        camara.encender();
        camara.realizarAccionEspecifica();
        camara.realizarAccionEspecifica();
        camara.apagar();

        System.out.println("\n=== ALTAVOZ INTELIGENTE ===");
        altavoz.encender();
        altavoz.ajustarVolumen(75);
        altavoz.realizarAccionEspecifica();
        altavoz.realizarAccionEspecifica();
        altavoz.apagar();

        System.out.println("\n=== HISTORIALES ===");
        sensor.mostrarHistorial();
        camara.mostrarHistorial();
        altavoz.mostrarHistorial();
    }
}