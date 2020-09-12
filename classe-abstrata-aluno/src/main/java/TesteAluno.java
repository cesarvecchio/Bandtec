public class TesteAluno {
    public static void main(String[] args) {
        AlunoFundamental fundamental1 = new AlunoFundamental(
                                    1, "João",
                                    10d, 10d,
                                    10d, 10d);
        AlunoFundamental fundamental2 = new AlunoFundamental(
                                    2, "Pedro",
                                    10d, 10d,
                                    10d, 10d);
        AlunoGraduacao graduacao1 = new AlunoGraduacao(
                                    3, "Larissa",
                                    10d, 5d);
        AlunoGraduacao graduacao2 = new AlunoGraduacao(
                                    4, "Maria",
                                    5d, 5d);
        AlunoPos pos1 = new AlunoPos(
                                    5, "Alberto",
                                    10d, 10d, 8d);
        AlunoPos pos2 = new AlunoPos(
                                    6, "Amanda",
                                    10d, 10d, 8d);

        Escola escola = new Escola("Fiap");
        escola.adicionaAluno(fundamental1);
        escola.adicionaAluno(fundamental2);
        escola.adicionaAluno(graduacao1);
        escola.adicionaAluno(graduacao2);
        escola.adicionaAluno(pos1);
        escola.adicionaAluno(pos2);

        escola.exibeTodos();
        System.out.println("-----");
        escola.exibeAlunosGraduacao();
        System.out.println("-----");
        escola.exibeAprovados();
        System.out.println("-----");
        escola.buscaAluno(1);
    }
}


// A. Sim, porque o metodo abstrato calculaMedia tem
// diferentes formas para cada classe que herda da classe mãe

// B. Não terá a necessidade de ficar criando um metodo caso
// criando uma classe nova, basta herdar a classe Aluno e
// sobreescrever o metodo calculaSalario

// C. Para a reutilização de codigo para uma classe que possua o mesmo
// segmento que a classe mãe.
// Assim como nesse projeto que a classe Aluno tem os atributos nome e ra
// e o metodo de calcular media que são importantes para todas as classes
// que são "filhas" dela