public class Vendedor extends Funcionario {
    private Double vendas;
    private Double taxa;

    public Vendedor(String cpf, String nome,
                    Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return taxa * vendas;
    }

    @Override
    public String toString() {
        return String.format(
                "-----\n" +
                        "Cpf: %s\n" +
                        "Nome: %s\n" +
                        "Vendas: %.2f\n" +
                        "Taxa: %.2f\n" +
                        "Salario: %.2f\n" +
                        "-----",
                super.getCpf(), super.getNome(),
                this.vendas, this.taxa, calcSalario());
    }
}
