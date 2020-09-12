package cenarios.segundo;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Funcionario> lista;

    public ControleBonus() {
        lista = new ArrayList<Funcionario>();
    }

    public void adicionaFuncionario(Funcionario p) {
        lista.add(p);
    }

    public List<Funcionario> exibeFuncionario() {
        return lista;
    }

    public Double calculaTotalBonus() {
        Double total = 0d;

        for(Funcionario p : lista) {
            total += p.getValorBonus();
        }

        return total;
    }

    @Override
    public String toString() {
        return "ControleBonus{" +
                "lista=" + lista +
                '}';
    }
}
