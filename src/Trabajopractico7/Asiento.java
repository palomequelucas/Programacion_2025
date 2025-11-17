package Trabajopractico7;

public class Asiento {
    private String numero;
    private boolean ocupado;

    public Asiento(String numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public void reservar() throws AsientoOcupadoException {
        if (ocupado) {
            throw new AsientoOcupadoException(numero);
        }
        ocupado = true;
    }

    public void liberar() {
        ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + (ocupado ? " [X]" : " [ ]");
    }
}