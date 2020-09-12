package cenarios.primeiro;

import java.util.List;

import java.util.ArrayList;

public class ControleBonus {
    private List<Funcionario> lista;

    public ControleBonus() {
        lista = new ArrayList();
    }

    public void adicionarFuncinario(Funcionario f) {
        lista.add(f);
    }

    public List<Funcionario> exibeFuncionarios() {
        return lista;
    }

    public Double totalBonus() {
        Double total = 0d;

        for(Funcionario f : lista) {
            total += f.getValorBonus();
        }

        return total;
    }

    @Override
    public String toString() {
        return "cenarios.primeiro.ControleBonus{" +
                "lista=" + lista +
                '}';
    }
}
