package lab2;

import java.util.Arrays;

/**
 * disciplina com notas e horas
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
     * cria disciplina com pesos
     * @param nomeDisciplina nome da disciplina
     * @param numNotas numero de notas
     * @param pesos peso de cada nota
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
     * cadastra horas
     * @param horas horas a adicionar
     */
    public void cadastraHoras(int horas) {
        if (horas < 0) return;
        this.horas += horas;
    }

    /**
     * cadastra nota
     * @param nota numero da nota
     * @param valorNota valor da nota
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
