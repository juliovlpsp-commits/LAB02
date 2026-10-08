package lab2;

import java.util.Arrays;

public class Disciplina {
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

    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[numNotas];
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas) {
        this.horas += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
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
        return calculaMedia() >= 7.0;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horas + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}