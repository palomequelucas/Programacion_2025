package Trabajopractico7;

public class ContrasenaCorta extends ContrasenaInvalidaException {

    public ContrasenaCorta() {
        super("La contraseña debe tener al menos 8 caracteres");
    }
}