public class HorarioTeste {
    public static void main(String[] args) {
        Horario h = new Horario(1, 2, 3);
        h.exibir();
        h.formatarTempo(3690);
        h.formatarTempo(3521);
        h.formatarTempo(59);
    }
}