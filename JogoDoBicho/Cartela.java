public class Cartela {
    private static final String[] ANIMAIS = {
            "Avestruz", "Aguia", "Burro", "Borboleta",
            "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo",
            "Elefante", "Galo", "Gato", "Jacare", "Leao", "Macaco", "Porco", "Pavao", "Peru",
            "Touro", "Tigre", "Urso", "Veado", "Vaca"
    };

    public String getBicho(int id) {
        if (id < 1 || id > ANIMAIS.length) {
            return "Numero fora da faixa [1-25]";
        }
        return ANIMAIS[id - 1];
    }
}