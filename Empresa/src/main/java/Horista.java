public class Horista extends Funcionario {
    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome,
                   Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }

    @Override
    public String toString() {
        return String.format(
                "-----\n" +
                        "Cpf: %s\n" +
                        "Nome: %s\n" +
                        "QtdHora: %d\n" +
                        "Valor hora: %.2f\n" +
                        "Salario: %.2f\n" +
                        "-----",
                super.getCpf(), super.getNome(),
                this.qtdHora, this.valorHora,
                calcSalario()
        );
    }
}
