public class Main {
    public static void main(String[] args) {
        Cartela cartela = new Cartela();

        System.out.println(cartela.getBicho(2));
        System.out.println(cartela.getBicho(25));
        System.out.println(cartela.getBicho(1));

        Aposta apostaFixa = new Aposta(new int[]{1, 5, 5, 9, 6});
        System.out.println(apostaFixa.imprimeAposta(cartela));

        Aposta apostaAleatoria = Aposta.gerarApostaAleatoria(5);
        System.out.println(apostaAleatoria.imprimeAposta(cartela));
    }
}