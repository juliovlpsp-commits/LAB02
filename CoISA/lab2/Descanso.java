package lab2;

/**
 * descanso do aluno
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
     * define horas de descanso
     * @param valor horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        if (valor < 0) return;
        this.horasDescanso = valor;
    }

    /**
     * define numero de semanas
     * @param valor numero de semanas
     */
    public void defineNumeroSemanas(int valor) {
        if (valor < 0) return;
        this.numeroSemanas = valor;
    }

    /**
     * verifica se esta descansado
     * @return descansado ou cansado
     */
    public String getStatusGeral() {
        if (this.numeroSemanas > 0 && ((double) this.horasDescanso / this.numeroSemanas) >= HORAS_MINIMAS_DESCANSADO) {
            return "descansado";
        }
        return "cansado";
    }
}
