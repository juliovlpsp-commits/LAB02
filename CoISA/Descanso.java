public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            return "cansado";
        }
        int media = this.horasDescanso / this.numeroSemanas;
        if (media >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}