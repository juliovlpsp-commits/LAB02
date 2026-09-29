package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] resumos;
    private int quantidade;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
        this.quantidade = 0;
        this.proximaPosicao = 0;
    }

    public void adiciona(String tema, String resumo) {
        this.temas[proximaPosicao] = tema;
        this.resumos[proximaPosicao] = tema + ": " + resumo;

        if (quantidade < temas.length) {
            quantidade++;
        }
        proximaPosicao = (proximaPosicao + 1) % temas.length;
    }

    public String[] pegaResumos() {
        String[] copia = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            copia[i] = resumos[i];
        }
        return copia;
    }

    public int conta() {
        return this.quantidade;
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(quantidade).append(" resumo(s) cadastrado(s)\n");
        sb.append("- ");
        for (int i = 0; i < quantidade; i++) {
            sb.append(temas[i]);
            if (i < quantidade - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
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