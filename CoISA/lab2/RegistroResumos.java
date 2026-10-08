package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * registro de resumos.
 */
public class RegistroResumos {
    private Resumo[] resumos;
    private int qtdResumos;
    private int posAtual;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.qtdResumos = 0;
        this.posAtual = 0;
    }

    /**
     * adiciona resumo.
     */
    public void adiciona(String tema, String conteudo) {
        if (temResumo(tema)) return;
        Resumo resumo = new Resumo(tema, conteudo);
        this.resumos[this.posAtual] = resumo;
        this.posAtual = (this.posAtual + 1) % this.resumos.length;
        if (this.qtdResumos < this.resumos.length) {
            this.qtdResumos++;
        }
    }

    public void adicionaResumo(String tema, String conteudo) {
        adiciona(tema, conteudo);
    }

    public String[] pegaResumos() {
        String[] resultado = new String[this.qtdResumos];
        for (int i = 0; i < this.qtdResumos; i++) {
            int idx = indiceReal(i);
            resultado[i] = this.resumos[idx].toString();
        }
        return resultado;
    }

    public int conta() {
        return this.qtdResumos;
    }

    public int contaResumos() {
        return conta();
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(conta()).append(" resumo(s) cadastrado(s)\n- ");
        for (int i = 0; i < this.qtdResumos; i++) {
            int idx = indiceReal(i);
            sb.append(this.resumos[idx].getTema());
            if (i < this.qtdResumos - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.qtdResumos; i++) {
            int idx = indiceReal(i);
            if (this.resumos[idx].getTema().equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * busca por conteudo.
     */
    public String[] busca(String chaveDeBusca) {
        if (chaveDeBusca == null || chaveDeBusca.isEmpty()) {
            return new String[0];
        }
        String chaveLower = chaveDeBusca.toLowerCase();
        List<String> temasEncontrados = new ArrayList<>();
        for (int i = 0; i < this.qtdResumos; i++) {
            int idx = indiceReal(i);
            if (this.resumos[idx] != null && this.resumos[idx].getConteudo().toLowerCase().contains(chaveLower)) {
                temasEncontrados.add(this.resumos[idx].getTema());
            }
        }
        Collections.sort(temasEncontrados);
        return temasEncontrados.toArray(new String[0]);
    }

    private int indiceReal(int posicaoLogica) {
        if (qtdResumos < resumos.length) {
            return posicaoLogica;
        }
        return (posAtual + posicaoLogica) % resumos.length;
    }
}
