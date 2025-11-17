package Trabajopractico7;

public class CapacidadExcedidaException extends Exception {

    public CapacidadExcedidaException() {
        super("No hay más asientos disponibles. La sala está llena");
    }
}