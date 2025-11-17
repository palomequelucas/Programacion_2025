package Trabajopractico6;

public class AltavozInteligente extends Dispositivo {
    private int volumen;
    private String cancionActual;

    public AltavozInteligente(String nombre) {
        super(nombre);
        this.volumen = 50;
        this.cancionActual = "Ninguna";
    }

    @Override
    public void realizarAccionEspecifica() {
        if (!encendido) {
            System.out.println(nombre + " está apagado. No puede reproducir música.");
            return;
        }

        String[] canciones = {"Shape of You", "Blinding Lights", "Levitating", "Peaches", "Good 4 U"};
        cancionActual = canciones[(int)(Math.random() * canciones.length)];

        String mensaje = "Reproduciendo: " + cancionActual + " (Volumen: " + volumen + "%)";
        System.out.println(mensaje);
        registrarEstado(mensaje);
    }

    public void ajustarVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            volumen = nuevoVolumen;
            String mensaje = "Volumen ajustado a " + volumen + "%";
            System.out.println(mensaje);
            registrarEstado(mensaje);
        }
    }
}
