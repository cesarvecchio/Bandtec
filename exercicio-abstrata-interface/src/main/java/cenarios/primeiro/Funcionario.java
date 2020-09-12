package cenarios.primeiro;

public abstract class Funcionario {
    private String nome;
    private Integer qtdHoraSem;
    private Double valorHora;

    public Funcionario(String nome, Integer qtdHoraSem, Double valorHora) {
        this.nome = nome;
        this.qtdHoraSem = qtdHoraSem;
        this.valorHora = valorHora;
    }

    public abstract Double getValorBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoraSem() {
        return qtdHoraSem;
    }

    public void setQtdHoraSem(Integer qtdHoraSem) {
        this.qtdHoraSem = qtdHoraSem;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "cenarios.primeiro.Funcionario{" +
                "nome='" + nome + '\'' +
                ", qtdHoraSem=" + qtdHoraSem +
                ", valorHora=" + valorHora +
                '}';
    }
}