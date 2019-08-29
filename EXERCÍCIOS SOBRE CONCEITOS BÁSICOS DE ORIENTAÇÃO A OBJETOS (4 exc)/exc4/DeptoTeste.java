import java.util.Scanner;

public class DeptoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do departamento: ");
        String nomeDpto = sc.nextLine();
        System.out.print("Digite a quantidade de docentes: ");
        int qtdDocentes = sc.nextInt();
        Depto depto = new Depto(nomeDpto, qtdDocentes);
        sc.nextLine();
        System.out.println("Digite os nomes dos docentes (um por linha): ");
        for (int i = 0; i < qtdDocentes; i++) {
            depto.cadastrarDocente(sc.nextLine());
        }
        System.out.print("Digite o numero de cursos: ");
        depto.setNumeroCursos(sc.nextInt());
        System.out.print("Digite o numero de alunos: ");
        depto.setNumeroAlunos(sc.nextInt());
        depto.mostrarDetalhes();

    }
}