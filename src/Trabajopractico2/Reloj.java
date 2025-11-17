package Trabajopractico2;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    // Constructor por defecto
    public Reloj() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Método para establecer hora
    public void establecerHora(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora inválida. Debe estar en formato 24h (HH:MM:SS)");
        }
    }

    // Mostrar hora con formato HH:MM:SS
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
    }

    // Avanzar un segundo
    public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}
