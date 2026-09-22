import java.util.Arrays;
import java.util.Random;

public class Aposta {
    private int[] numeros;

    public Aposta(int[] numeros) {
        this.numeros = numeros;
        Arrays.sort(this.numeros);
    }

    public static Aposta gerarApostaAleatoria(int quantidade) {
        int[] aux = new int[quantidade];
        Random r = new Random();
        for (int i = 0; i < quantidade; i++) {
            aux[i] = 1 + r.nextInt(25);
        }
        return new Aposta(aux);
    }

    public int[] getNumeros() {
        return numeros;
    }

    public String imprimeAposta(Cartela cartela) {
        StringBuilder retorno = new StringBuilder();
        for (int id : numeros) {
            retorno.append(cartela.getBicho(id)).append(" ");
        }
        return retorno.toString().trim();
    }
}