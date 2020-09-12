package cenarios.segundo;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Mario", 6, 100.00);
        Professor professor2 = new Professor("Maria", 3, 100.00);

        Coordenador coordenador1 = new Coordenador("Albert", 3, 100.00,
                5, 100.00);
        Coordenador coordenador2 = new Coordenador("Albertina", 3, 100.00,
                3, 150.00);

        ControleBonus controleBonus = new ControleBonus();
        controleBonus.adicionaFuncionario(professor1);
        controleBonus.adicionaFuncionario(professor2);
        controleBonus.adicionaFuncionario(coordenador1);
        controleBonus.adicionaFuncionario(coordenador2);

        System.out.println(controleBonus.exibeFuncionario());

        System.out.println(controleBonus.calculaTotalBonus());
    }
}
