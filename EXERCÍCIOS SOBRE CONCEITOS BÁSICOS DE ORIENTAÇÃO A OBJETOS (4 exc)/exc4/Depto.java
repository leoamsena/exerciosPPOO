public class Depto {
    private String nome;
    private String[] docente;
    private int numeroCursos;
    private int numeroAlunos;
    private int contador;

    public Depto(String nome, int qtdadeDocentes) {
        this.nome = nome;
        docente = new String[qtdadeDocentes];
        contador = 0;
    }

    public Depto(String nome, String[] docente, int numeroCursos, int numeroAlunos, int contador) {
        this.nome = nome;
        this.docente = docente;
        this.contador = contador;
        this.numeroCursos = numeroCursos;
        this.numeroAlunos = numeroAlunos;
    }

    public void cadastrarDocente(String nomeDocente) {
        docente[contador] = nomeDocente;
        contador++;
    }

    public void setNumeroCursos(int numeroCursos) {
        this.numeroCursos = numeroCursos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public void mostrarDetalhes() {
        System.out.printf("Nome do departamento: %s \nProfessores: \n", this.nome);
        for (String prof : this.docente) {
            System.out.printf("\t%s\n", prof);
        }
        System.out.printf("Numero de Cursos: %d\nNumero de Alunos: %d\n", this.numeroCursos, this.numeroAlunos);
    }
}