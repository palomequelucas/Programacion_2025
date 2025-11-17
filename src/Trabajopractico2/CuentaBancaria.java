package Trabajopractico2;
public class CuentaBancaria {


    private String numeroCuenta;
    private String titular;
    private double saldo;


    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }


    public boolean retirar(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true; // Operación exitosa
        } else {
            return false; // Operación fallida (saldo insuficiente)
        }
    }


    public double consultarSaldo() {
        return this.saldo;
    }


    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}