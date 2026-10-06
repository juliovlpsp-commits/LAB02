package lab2;

import java.util.Arrays;

public class Disciplina {
    private static final double MEDIA_APROVACAO = 7.0;
    private static final int QTD_NOTAS = 4;

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[QTD_NOTAS];
    }

    public void cadastraHoras(int horas) {
        if (horas < 0) return;
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        if (nota < 1 || nota > QTD_NOTAS) return;
        if (valorNota < 0 || valorNota > 10) return;
        this.notas[nota - 1] = valorNota;
    }

    private double calculaMedia() {
        double soma = 0;
        for (double n : this.notas) {
            soma += n;
        }
        return soma / this.notas.length;
    }

    public boolean aprovado() {
        return calculaMedia() >= MEDIA_APROVACAO;
    }

    @Override
    public String toString() {
        return String.format("%s %d %.1f %s", this.nomeDisciplina, this.horasEstudo, calculaMedia(), Arrays.toString(this.notas));
    }
}
