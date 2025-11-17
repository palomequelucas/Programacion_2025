package Trabajopractico6;

import java.util.Random;

public class SensorTemperatura extends Dispositivo {
    private double temperaturaActual;
    private double umbralAlerta;

    public SensorTemperatura(String nombre, double umbralAlerta) {
        super(nombre);
        this.umbralAlerta = umbralAlerta;
        this.temperaturaActual = 20.0;
    }

    @Override
    public void realizarAccionEspecifica() {
        if (!encendido) {
            System.out.println(nombre + " está apagado. No puede medir temperatura.");
            return;
        }

        Random rand = new Random();
        temperaturaActual = 15 + rand.nextDouble() * 20;

        String mensaje = String.format("Temperatura medida: %.2f°C", temperaturaActual);
        System.out.println(mensaje);
        registrarEstado(mensaje);

        if (temperaturaActual > umbralAlerta) {
            String alerta = "¡ALERTA! Temperatura supera umbral de " + umbralAlerta + "°C";
            System.out.println(alerta);
            registrarEstado(alerta);
        }
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }
}