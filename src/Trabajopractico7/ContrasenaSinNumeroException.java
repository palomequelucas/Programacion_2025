package Trabajopractico7;

public class ContrasenaSinNumeroException extends ContrasenaInvalidaException {

    public ContrasenaSinNumeroException() {
        super("La contraseña debe contener al menos un número");
    }
}