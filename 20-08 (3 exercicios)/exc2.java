import java.util.Scanner;

/**
 * exc2
 */
public class exc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor = sc.nextFloat() / 100;
        int meses = sc.nextInt();
        double total = 0;
        for (int i = 0; i < meses; i++) {
            total += sc.nextFloat();
            total *= 1 + valor;
        }
        System.out.println(total);
    }
}