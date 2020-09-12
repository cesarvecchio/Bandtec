import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> alunos;

    public Escola(String nome) {
        this.nome = nome;
        alunos = new ArrayList<Aluno>();
    }

    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibeTodos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void exibeAlunosGraduacao() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                System.out.println(aluno);
            }
        }
    }

    public void exibeAprovados() {
        for (Aluno aluno : alunos) {
            if (aluno.calculaMedia() >= 5) {
                System.out.println(aluno);
            }
        }
    }

    public void buscaAluno(Integer ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa() == ra) {
                System.out.println(aluno);
            }
        }
    }
}
