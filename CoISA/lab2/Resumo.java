package lab2;

/**
 * resumo com tema e conteudo
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * cria resumo
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
