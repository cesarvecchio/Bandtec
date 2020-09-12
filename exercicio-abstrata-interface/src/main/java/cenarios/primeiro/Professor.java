package cenarios.primeiro;

public class Professor extends Funcionario {
    public Professor(String nome, Integer qtdHoraSem, Double valorHora) {
        super(nome, qtdHoraSem, valorHora);
    }

    @Override
    public Double getValorBonus() {
        return getQtdHoraSem() * getValorHora() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "cenarios.primeiro.Professor{ " +
                "valorBonus=" + getValorBonus() + " } "
                + super.toString();
    }
}