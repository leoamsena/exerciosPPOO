import java.util.Scanner;

public class CarrinhoTeste {
    public static void main(String[] args) {
        Carrinho c = new Carrinho("Luiz", 24, 6, 2017);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            c.inserirItem(sc.next());
        }
        c.exibir();
        Carrinho c2 = new Carrinho("Leo", 24, 6, 2017, 3);
        for (int i = 0; i < 3; i++) {
            c2.inserirItem(sc.next());
        }
        c2.exibir();
    }
}