package lab2;

import java.util.Arrays;

/**
 * Representa disciplina com horas e notas. Aprovado se media >= 7.0.
 */
public class Disciplina {
    private static final double MEDIA_APROVACAO = 7.0;

    private String nomeDisciplina;
    private int horas;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4);
    }

    public Disciplina(String nomeDisciplina, int numNotas) {
        this(nomeDisciplina, numNotas, null);
    }

    /**
     * Cria disciplina com pesos para media ponderada.
     * @param pesos array com peso de cada nota (mesmo tamanho de numNotas)
     */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[numNotas];
        if (pesos != null && pesos.length == numNotas) {
            this.pesos = Arrays.copyOf(pesos, pesos.length);
        } else {
            this.pesos = null;
        }
    }

    /**
     * Cadastra horas cumulativas. Ignora negativos.
     */
    public void cadastraHoras(int horas) {
        if (horas < 0) return;
        this.horas += horas;
    }

    /**
     * Cadastra nota 1..N com valor 0..10. Ignora valores invalidos.
     */
    public void cadastraNota(int nota, double valorNota) {
        if (nota < 1 || nota > this.notas.length) return;
        if (valorNota < 0 || valorNota > 10) return;
        this.notas[nota - 1] = valorNota;
    }

    private double calculaMedia() {
        double soma = 0.0;
        if (this.pesos == null) {
            for (double nota : this.notas) {
                soma += nota;
            }
            return soma / this.notas.length;
        } else {
            int somaPesos = 0;
            for (int i = 0; i < this.notas.length; i++) {
                soma += this.notas[i] * this.pesos[i];
                somaPesos += this.pesos[i];
            }
            return somaPesos > 0 ? soma / somaPesos : 0.0;
        }
    }

    public boolean aprovado() {
        return calculaMedia() >= MEDIA_APROVACAO;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horas + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}
