package Trabajopractico7;

public class AsientoOcupadoException extends Exception {

    public AsientoOcupadoException(String numeroAsiento) {
        super("El asiento " + numeroAsiento + " ya está ocupado");
    }
}