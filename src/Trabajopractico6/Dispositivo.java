package Trabajopractico6;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Dispositivo {
    protected String nombre;
    protected boolean encendido;
    protected List<String> historialEstados;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
        this.historialEstados = new ArrayList<>();
        registrarEstado("Dispositivo creado");
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            registrarEstado("Dispositivo encendido");
            System.out.println(nombre + " se ha encendido.");
        } else {
            System.out.println(nombre + " ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            registrarEstado("Dispositivo apagado");
            System.out.println(nombre + " se ha apagado.");
        } else {
            System.out.println(nombre + " ya está apagado.");
        }
    }

    public String obtenerEstado() {
        return encendido ? "Encendido" : "Apagado";
    }

    protected void registrarEstado(String descripcion) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        historialEstados.add("[" + timestamp + "] " + descripcion);
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial de " + nombre + " ---");
        for (String estado : historialEstados) {
            System.out.println(estado);
        }
    }

    public abstract void realizarAccionEspecifica();

    public String getNombre() {
        return nombre;
    }
}