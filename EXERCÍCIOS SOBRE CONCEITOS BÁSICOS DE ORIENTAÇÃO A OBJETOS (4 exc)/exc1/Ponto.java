public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getPonto() {
        return "As coordenadas (x,y) do ponto são: (" + x + "; " + y + ")";
    }

    public double calcularDistancia(double x, double y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }
}