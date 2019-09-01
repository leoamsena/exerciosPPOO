public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void exibir() {
        System.out.printf("%02dh:%02dm:%02ds\n", hora, minuto, segundo);
    }

    public void formatarTempo(int segundo) {
        this.segundo = (segundo >= 60) ? segundo % 60 : segundo;
        this.minuto = (segundo / 60 >= 60) ? (segundo / 60) % 60 : segundo / 60;
        this.hora = segundo / 3600;
        this.exibir();
    }
}