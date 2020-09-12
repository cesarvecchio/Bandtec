package cenarios.segundo;

public class Professor implements Funcionario{
    private String nome;
    private Integer qtdAulaSem;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulaSem, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulaSem = qtdAulaSem;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAulaSem() {
        return qtdAulaSem;
    }

    public void setQtdAulaSem(Integer qtdAulaSem) {
        this.qtdAulaSem = qtdAulaSem;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorBonus() {
        return qtdAulaSem * valorHoraAula * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", qtdAulaSem=" + qtdAulaSem +
                ", valorHoraAula=" + valorHoraAula +
                ", valorBonus=" + getValorBonus() +
                '}';
    }
}
