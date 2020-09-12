public abstract class Funcionario {
    private String cpf;
    private String nome;

    public abstract Double calcSalario();

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format(
                " ----- \n " +
                        "Cpf: %s \n " +
                        "Nome: %s \n " +
                        " ----- ",
                this.cpf, this.nome);
    }
}
