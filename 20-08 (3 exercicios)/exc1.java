import java.util.Scanner;

/**
 * exc1
 */
public class exc1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int genero = scanner.nextInt();
        int idade = scanner.nextInt();
        float tempoDeTrabalho = scanner.nextFloat();

        if ((genero == 0 && tempoDeTrabalho > 15) || (genero == 1 && tempoDeTrabalho > 20)) { // entra na regra
            float tempoFaltante = (30 + (genero * 5)) - tempoDeTrabalho;
            System.out.println((tempoFaltante * 0.3) + idade + tempoFaltante);
        } else { // não entra na regra
            System.out.println(62 + (genero * 3));
        }
    }
}