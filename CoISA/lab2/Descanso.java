package lab2;

public class Descanso {
    private static final int HORAS_MINIMAS_DESCANSADO = 26;

    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    public void defineHorasDescanso(int valor) {
        if (valor < 0) return;
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        if (valor < 0) return;
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        if (this.numeroSemanas > 0 && ((double) this.horasDescanso / this.numeroSemanas) >= HORAS_MINIMAS_DESCANSADO) {
            return "descansado";
        }
        return "cansado";
    }
}
