public class PontoTeste {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(1.5, 2.5);
        System.out.println(ponto.getPonto());
        System.out.printf("A distância entre os pontos é: %.2f", ponto.calcularDistancia(3.5, 5.5));
    }
}