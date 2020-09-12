public class Engenheiro extends Funcionario {
    private Double salario;

    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double calcSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format(
                "-----\n" +
                "Cpf: %s \n" +
                "Nome: %s\n" +
                "Salario: %.2f\n" +
                "-----"
                , super.getCpf(),
                super.getNome(),
                this.calcSalario());
    }
}
