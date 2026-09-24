public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int quantidade;
    private int indiceSubstituicao;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidade = 0;
        this.indiceSubstituicao = 0;
    }

    public void adicionaResumo(String tema, String conteudo) {
        for (int i = 0; i < quantidade; i++) {
            if (temas[i].equals(tema)) {
                conteudos[i] = conteudo;
                return;
            }
        }

        temas[indiceSubstituicao] = tema;
        conteudos[indiceSubstituicao] = conteudo;

        indiceSubstituicao = (indiceSubstituicao + 1) % temas.length;

        if (quantidade < temas.length) {
            quantidade++;
        }
    }

    public String[] pegaResumos() {
        String[] resumos = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            resumos[i] = temas[i] + ": " + conteudos[i];
        }
        return resumos;
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(quantidade).append(" resumo(s) cadastrado(s):\n");
        for (int i = 0; i < quantidade; i++) {
            sb.append("- ").append(temas[i]).append(": ").append(conteudos[i]);
            if (i < quantidade - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public int contaResumos() {
        return quantidade;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidade; i++) {
            if (temas[i].equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }
}