package lab2;

/**
 * tempo online da disciplina
 */
public class RegistroTempoOnline {
    private static final int META_PADRAO = 120;

    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineGasto;

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, META_PADRAO);
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineGasto = 0;
    }

    /**
     * adiciona tempo online
     * @param tempo horas a adicionar
     */
    public void adicionaTempoOnline(int tempo) {
        if (tempo < 0) return;
        this.tempoOnlineGasto += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnlineGasto >= this.tempoOnlineEsperado;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineGasto + "/" + this.tempoOnlineEsperado;
    }
}
