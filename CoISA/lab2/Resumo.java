package lab2;

/**
 * Representa um resumo de estudo com tema e conteudo.
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Cria um resumo.
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema() {
        return this.tema;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
