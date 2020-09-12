package cenarios.primeiro;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Marcio", 6, 100.00);
        Professor professor2 = new Professor("Maria", 6, 150.00);

        Coordenador coordenador1 = new Coordenador("Amadel", 8, 200.00);
        Coordenador coordenador2 = new Coordenador("Marcos", 4, 100.00);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.adicionarFuncinario(professor1);
        controleBonus.adicionarFuncinario(professor2);
        controleBonus.adicionarFuncinario(coordenador1);
        controleBonus.adicionarFuncinario(coordenador2);

        System.out.println(controleBonus.exibeFuncionarios());

        System.out.println(controleBonus.totalBonus());
    }
}
