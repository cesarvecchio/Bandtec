package cenarios.primeiro;

public class Coordenador extends Funcionario {
    public Coordenador(String nome, Integer qtdHoraSem, Double valorHora) {
        super(nome, qtdHoraSem, valorHora);
    }

    @Override
    public Double getValorBonus() {
        return getQtdHoraSem() * getValorHora() * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "cenarios.primeiro.Coordenador{ " +
                "valorBonus=" + getValorHora() + " } "
                + super.toString();
    }
}