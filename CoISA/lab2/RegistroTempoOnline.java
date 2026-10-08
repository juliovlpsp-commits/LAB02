package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineGasto;

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineGasto = 0;
    }

    public void adicionaTempoOnline(int tempo) {
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