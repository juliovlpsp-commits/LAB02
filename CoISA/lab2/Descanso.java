package lab2;

/**
 * Controla rotina de descanso. Descansado se media horas/semana >= 26.
 */
public class Descanso {
    private static final int HORAS_MINIMAS_DESCANSADO = 26;

    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    /**
     * Define total de horas de descanso.
     * @param valor total de horas (ignora negativos)
     */
    public void defineHorasDescanso(int valor) {
        if (valor < 0) return;
        this.horasDescanso = valor;
    }

    /**
     * Define numero de semanas.
     * @param valor numero de semanas (ignora negativos)
     */
    public void defineNumeroSemanas(int valor) {
        if (valor < 0) return;
        this.numeroSemanas = valor;
    }

    /**
     * Retorna "descansado" se media >= 26, senao "cansado".
     */
    public String getStatusGeral() {
        if (this.numeroSemanas > 0 && ((double) this.horasDescanso / this.numeroSemanas) >= HORAS_MINIMAS_DESCANSADO) {
            return "descansado";
        }
        return "cansado";
    }
}
