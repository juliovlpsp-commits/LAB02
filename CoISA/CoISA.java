public class CoISA {
    public static void main(String[] args) {
        Descanso descanso = new Descanso();
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(1);
        System.out.println("Descanso: " + descanso.getStatusGeral());

        RegistroTempoOnline tempoLP2 = new RegistroTempoOnline("LP2", 60);
        tempoLP2.adicionaTempoOnline(30);
        System.out.println(tempoLP2);
        System.out.println("Atingiu meta? " + tempoLP2.atingiuMetaTempoOnline());

        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(10);
        prog2.cadastraNota(1, 7.0);
        prog2.cadastraNota(2, 8.0);
        prog2.cadastraNota(3, 7.5);
        prog2.cadastraNota(4, 7.5);
        System.out.println(prog2);
        System.out.println("Aprovado? " + prog2.aprovado());

        RegistroResumos meusResumos = new RegistroResumos(2);
        meusResumos.adicionaResumo("Classes", "Classes definem tipos de objetos");
        meusResumos.adicionaResumo("Objetos", "Instancias de classes");
        System.out.println(meusResumos.imprimeResumos());
        System.out.println("Tem resumo sobre Classes? " + meusResumos.temResumo("Classes"));
    }
}