import java.util.Scanner;

/**
 * exc3
 */
public class exc3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdKm = sc.nextInt();
        String piloto1 = sc.next();
        float[] temposPiloto1 = new float[qtdKm];
        for (int i = 0; i < qtdKm; i++) {
            temposPiloto1[i] = sc.nextFloat();
        }
        String piloto2 = sc.next();
        float[] temposPiloto2 = new float[qtdKm];
        for (int i = 0; i < qtdKm; i++) {
            temposPiloto2[i] = sc.nextFloat();
        }

        for (int i = 0; i < qtdKm; i++) {
            if (temposPiloto1[i] < temposPiloto2[i])
                System.out.print(piloto1 + " ");
            else
                System.out.print(piloto2 + " ");
        }
        System.out.print("\n");
        float temposAcumulados1 = 0, temposAcumulados2 = 0;
        for (int i = 0; i < qtdKm; i++) {
            temposAcumulados1 += temposPiloto1[i];
            temposAcumulados2 += temposPiloto2[i];
            if (temposAcumulados1 > temposAcumulados2)
                System.out.print(piloto2 + " ");
            else
                System.out.print(piloto1 + " ");
        }
    }
}