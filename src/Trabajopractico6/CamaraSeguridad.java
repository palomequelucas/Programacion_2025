package Trabajopractico6;

public class CamaraSeguridad extends Dispositivo {
    private boolean grabando;
    private String resolucion;

    public CamaraSeguridad(String nombre, String resolucion) {
        super(nombre);
        this.resolucion = resolucion;
        this.grabando = false;
    }

    @Override
    public void realizarAccionEspecifica() {
        if (!encendido) {
            System.out.println(nombre + " está apagada. No puede grabar.");
            return;
        }

        if (!grabando) {
            grabando = true;
            String mensaje = "Iniciando grabación en " + resolucion;
            System.out.println(mensaje);
            registrarEstado(mensaje);
        } else {
            grabando = false;
            String mensaje = "Deteniendo grabación";
            System.out.println(mensaje);
            registrarEstado(mensaje);
        }
    }

    public boolean isGrabando() {
        return grabando;
    }
}